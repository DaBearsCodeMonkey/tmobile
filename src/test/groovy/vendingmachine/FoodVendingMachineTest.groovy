package vendingmachine

import spock.lang.Specification

class FoodVendingMachineTest extends Specification {
    def "Creates a new vending empty vending machine"() {
        given:
        def vendingMachine = new FoodVendingMachine()
        def expectedResult =  new Item[2][2]
        def apple = new Item("apple", 0)
        def orange = new Item("orange", 0)
        def celery = new Item("celery", 0)
        def broccoli = new Item("broccoli", 0)

        expectedResult[0][0] = apple
        expectedResult[0][1] = orange
        expectedResult[1][0] = celery
        expectedResult[1][1] = broccoli

        when:
        def actualResult = vendingMachine.createVendingMachine()

        then:
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                expectedResult[i][j] == actualResult[i][j]
            }
        }
    }
}
