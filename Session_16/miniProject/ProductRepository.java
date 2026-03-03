package Session_16.miniProject;

import java.util.*;

public class ProductRepository implements IRepository<Product> {

    private List<Product> productList;
    private Map<String, Product> productMap;

    public ProductRepository() {
        productList = new ArrayList<>();
        productMap = new HashMap<>();
    }

    @Override
    public boolean add(Product item) {
        if (item == null || item.getId() == null) return false;
        if (productMap.containsKey(item.getId())) return false;

        productList.add(item);
        productMap.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if (id == null || !productMap.containsKey(id)) return false;

        Product p = productMap.remove(id);
        productList.remove(p);
        return true;
    }

    @Override
    public Product findById(String id) {
        if (id == null) return null;
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList);
    }

    public void sortByPriceAscending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public Map<String, Integer> countByType() {
        Map<String, Integer> result = new HashMap<>();
        for (Product p : productList) {
            if (p instanceof ElectronicProduct) {
                result.put("Electronic", result.getOrDefault("Electronic", 0) + 1);
            } else if (p instanceof FoodProduct) {
                result.put("Food", result.getOrDefault("Food", 0) + 1);
            }
        }
        return result;
    }
}