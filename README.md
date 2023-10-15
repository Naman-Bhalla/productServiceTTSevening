## Creating Database

```markdown
create database productservice3oct23;
create user productservice3oct23;
grant all privileges on productservice3oct23.* to productservice3oct23;
```


## Assignments

### 21st September 2023

1. Implement code till 3381091c1c936fbdc4c1292fc5ef0c769d2b02cb yourself.
2. Make sure all Controllers in /controllers/ are taking appropriate parameters as required by corresponding APIs in https://fakestoreapi.com/docs
3. (Stretch) Try to understand https://spring.io/guides/gs/consuming-rest/ and implement FakeStoreProductServiceImpl. 

### 26th September 2023

1. Implement all of the APIs under `Products` at: https://fakestoreapi.com/docs (other than Limit Results and Sort Results)
2. Make your FakeStoreProductServiceImpl not depend on RestTemplate at all. Instead of this it should depend on `FakeStoreClient`

### 15thOctober 2023
1. Go through all of the APIs in CategoryController and ProductController
2. Create a SelfProductService and SelfCategoryService implementing the corresponding interface
3. Implement the code inside each of the services. This code should now work with corresponding repositories.