package boot

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation._

@RestController
class MyController {

  @RequestMapping(value = Array("/ping"), method = Array(RequestMethod.GET))
  @ResponseStatus(HttpStatus.OK)
  def ping() = {
    "pong"
  }

}
