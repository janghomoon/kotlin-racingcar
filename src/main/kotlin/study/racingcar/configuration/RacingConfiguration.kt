package study.racingcar.configuration

import study.racingcar.controller.RacingCarController
import study.racingcar.repository.CarRepository
import study.racingcar.service.RacingService

class RacingConfiguration {
    fun racingCarController(): RacingCarController {
        return RacingCarController(racingService())
    }

    private fun racingService(): RacingService {
        return RacingService(carRepository())
    }

    private fun carRepository(): CarRepository {
        return CarRepository()
    }
}
