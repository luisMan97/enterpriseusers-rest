# enterpriseusers-rest
## Installation
Run git clone to download proyect

```ruby
git clone https://github.com/luisMan97/enterpriseusers-rest.git
```
First clone the next soap web service project and run

https://github.com/luisMan97/enterpriseusers-soap

IMPORTANT: check the README.md

#### Use
1) Open project with Spring Tool for Eclipse (https://spring.io/tools)
2) Go to EmployeeController class.
2) Tap on the Run button

Example call get

```ruby
http://localhost:8080/enterpriseusers/api/employee?name=l&lastname=r&document_type=c&document=1&birth=1997-04-04&vinculation=2020-05-25&position=d&salary=1.0
```

Json response:

```ruby
{
  "age":
    {
      "years": 1997,
      "months": 3,
      "days": 4
    },
    "vinculation":
      {
        "years": 2020,
        "months": 4,
        "days": 25
      }
}
```

#### Error Messages
When some field is not added to url

```ruby
{
  "message": "All fields are required"
}
```

When some field is empty

```ruby
{
  "message": "Fields is not should empty"
}
```

When some date field is not formatted correct
```ruby
{
  "message": "The employee should be adult"
}
```

When age field is less to 18
```ruby
{
  "message": "The employee should be adult"
}
