package pe.com.bank.service.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.bank.service.card.entity.CardEntity;
import pe.com.bank.service.card.service.CardService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/card")
public class CardController {
    @Autowired
    private CardService cardService;

    @PostMapping("/save")
    public Mono<CardEntity> saveClient(@RequestBody @Valid CardEntity cardEntity) {
        return this.cardService.saveCard(cardEntity);
    }

    @GetMapping("/{id}")
    public Mono<CardEntity> findById(@PathVariable String id) {
        return this.cardService.findByIdCard(id);
    }

    @PutMapping("/update")
    public Mono<CardEntity> updateCard(@RequestBody @Valid CardEntity cardEntity) {
        return this.cardService.updateCard(cardEntity);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteIdCard(@PathVariable String id) {
        return this.cardService.deleteByIdCard(id);
    }

    @GetMapping()
    public Flux<CardEntity> findAllCard() {
        return this.cardService.findAllCard();
    }
}
