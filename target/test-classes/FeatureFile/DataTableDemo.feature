Feature: passing the data at step level

  Scenario: As a user i am able to passing  the data at step level using single column without header
    Given user is passing the data at step level in single column without header
      | oranium |
      | priya   |
      | swetha  |

  Scenario: pasing data using multiple column without header
    Given user passing the data using multiple column without header
      | oranium | oranium1234 |
      | priya   | priya123    |
      | kavi    | kavi123     |

  Scenario: passing data as single header with single value
    Given user passing the data as single header with singel value.
      | name  | loki    |
      | age   |      23 |
      | place | chennai |

  Scenario: passing  data as single headers and multiple value
    Given user passing the data as single headers and multiple value
      | name   | age | place       |
      | priya  |  23 | chennai     |
      | swetha |  25 | kerala      |
      | loki   |  26 | tirunelveli |
