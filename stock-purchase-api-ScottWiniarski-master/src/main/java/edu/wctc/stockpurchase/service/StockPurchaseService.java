package edu.wctc.stockpurchase.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import edu.wctc.stockpurchase.entity.StockPurchase;
import edu.wctc.stockpurchase.repo.StockPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockPurchaseService {
    private final StockPurchaseRepository stockPurchaseRepository;
    private final ObjectMapper objectMapper;


    @Autowired
    public StockPurchaseService(StockPurchaseRepository stockPurchaseRepository, ObjectMapper objectMapper) {
        this.stockPurchaseRepository = stockPurchaseRepository;
        this.objectMapper = objectMapper;
    }

    public List<StockPurchase> getAllPurchases(){
        List<StockPurchase> list = new ArrayList<>();
        stockPurchaseRepository.findAll().forEach(list::add);
        return list;
    }

    public StockPurchase findById(int id){
        return stockPurchaseRepository.findById(id).orElse(null);
    }

    public StockPurchase buildPurchase(StockPurchase stock){
        stock.setId(0);
        return stockPurchaseRepository.save(stock);
    }

    public StockPurchase editPurchase(StockPurchase stock){
        return stockPurchaseRepository.save(stock);
    }

    public StockPurchase patchPurchase(int id, JsonPatch patch){
        try{
            System.out.println("Bug A");
            StockPurchase editedPurchase = findById(id);
            JsonNode patched = patch.apply(objectMapper.convertValue(editedPurchase, JsonNode.class));
            StockPurchase patchedPurchase = objectMapper.treeToValue(patched, StockPurchase.class);
            System.out.println("Bug B");
            stockPurchaseRepository.save(patchedPurchase);
            return patchedPurchase;
        }
        catch(JsonPatchException | JsonProcessingException exception ) {
            System.out.println("Super Bug");
            throw new RuntimeException("Couldn't patch");
        }
    }

    public void deletePurchase(int id){
        stockPurchaseRepository.deleteById(id);
    }

}
