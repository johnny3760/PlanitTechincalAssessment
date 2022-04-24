$(document).ready(function() {
CucumberHTML.timelineItems.pushArray([
  {
    "id": "0a9496b8-f297-4ee0-9ca6-7161887f24cd",
    "feature": "validate contact page",
    "scenario": "navigate to contact  and validate error",
    "start": 1650787834844,
    "group": 1,
    "content": "",
    "tags": "@contact_page,",
    "end": 1650787849068,
    "className": "passed"
  },
  {
    "id": "840e5225-26a7-48aa-be98-8ed462cd07a2",
    "feature": "validate contact page",
    "scenario": "enter valid data and click submit",
    "start": 1650787849104,
    "group": 1,
    "content": "",
    "tags": "@contact_page,@mandatory_fields,",
    "end": 1650787869194,
    "className": "passed"
  },
  {
    "id": "1286f557-e3aa-4e99-8e3d-a333c1af0a3f",
    "feature": "validate contact page",
    "scenario": "enter invalid data and verify error message",
    "start": 1650787869210,
    "group": 1,
    "content": "",
    "tags": "@contact_page,@invalid_data,",
    "end": 1650787875444,
    "className": "passed"
  },
  {
    "id": "39273c45-0d5d-4996-a0da-ea04a1c8f280",
    "feature": "verify items in the cart",
    "scenario": "validate the cart",
    "start": 1650787875470,
    "group": 1,
    "content": "",
    "tags": "@add_cart,",
    "end": 1650787925660,
    "className": "passed"
  }
]);
CucumberHTML.timelineGroups.pushArray([
  {
    "id": 1,
    "content": "Thread[main,5,main]"
  }
]);
});