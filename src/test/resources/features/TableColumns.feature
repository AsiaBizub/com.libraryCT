@tableColumns
Feature: Table columns names
  Agile Story: As a user, I should be able to see tables with default info:
  Actions, ISBN, Name, Author, Category, Year, Borrowed By

  @student98
  Scenario: Library home page table column names verification
    Given User-student98 should be already logged in
    Then User should see the following column names
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |

  @student99
  Scenario: Library home page table column names verification
    Given User-student99 should be already logged in
    Then User should see the following column names
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |

  @student100
  Scenario: Library home page table column names verification
    Given User-student100 should be already logged in
    Then User should see the following column names
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |

  @librarian15
  Scenario: Library home page table column names verification
    Given User-librarian15 should be already logged in
    Then User should see the following column names
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |