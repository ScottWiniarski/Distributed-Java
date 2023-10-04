package edu.wctc.stockpurchase.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import edu.wctc.stockpurchase.entity.StockPurchase;
import edu.wctc.stockpurchase.repo.StockPurchaseRepository;
import edu.wctc.stockpurchase.service.StockPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/stockpurchases")
public class StockPurchaseController {

    private final StockPurchaseService stockPurchaseService;

    @Autowired
    public StockPurchaseController(StockPurchaseService stockPurchaseService) {
        this.stockPurchaseService = stockPurchaseService;
    }

    @GetMapping
    public List<StockPurchase> findAll(){
        System.out.println("Bug D");
        return stockPurchaseService.getAllPurchases();
    }

    @GetMapping("/{purchaseid}")
    public StockPurchase getById(@PathVariable int purchaseid){
        System.out.println("Bug E");
        return stockPurchaseService.findById(purchaseid);
    }

    @PostMapping
    public StockPurchase createPurchase(@RequestBody StockPurchase stockPurchase){
        return stockPurchaseService.buildPurchase(stockPurchase);
    }

    @PutMapping
    public StockPurchase updatePurchase(@RequestBody StockPurchase stockPurchase){
        return stockPurchaseService.editPurchase(stockPurchase);
    }

    @PatchMapping("/{purchaseid}")
    public StockPurchase patchPurchase(@PathVariable int purchaseid,@RequestBody JsonPatch patch){
        System.out.println("Bug C");
        return stockPurchaseService.patchPurchase(purchaseid, patch);
    }

    @DeleteMapping("/{purchaseid}")
    public String deletePurchase(@PathVariable int purchaseid){
        stockPurchaseService.deletePurchase(purchaseid);
        return ("Deleted purchase with ID: " + purchaseid);
    }


}
