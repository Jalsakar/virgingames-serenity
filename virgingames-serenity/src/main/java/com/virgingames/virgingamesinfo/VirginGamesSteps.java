package com.virgingames.virgingamesinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class VirginGamesSteps {
    @Step("Getting all games information ")
    public ValidatableResponse getAllJackpotsInfo(){
        return SerenityRest.given()
                .when()
                .get(EndPoints.END_POINT)
                .then();
    }
}
