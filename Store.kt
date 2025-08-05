// Product class
class Product(
    val name: String,
    val category: String,
    val price: Double,
    var quantity: Int
) {
    fun displayInfo() {
        println("$name | $category | $$price | Quantity: $quantity")
    }
}

// Store class
class Store {
    val products = mutableListOf<Product>()

    fun addProduct(product: Product) {
        products.add(product)
        println("Product added.\n")
    }

    fun viewProducts() {
        if (products.isEmpty()) {
            println("No products available.\n")
        } else {
            println("Available Products:")
            for (i in products.indices) {
                print("${i + 1}. ")
                products[i].displayInfo()
            }
            println()
        }
    }

    fun removeProduct(name: String) {
        var found = false
        for (product in products) {
            if (product.name.equals(name, ignoreCase = true)) {
                products.remove(product)
                println("Product removed.\n")
                found = true
                break
            }
        }
        if (!found) {
            println("Product not found.\n")
        }
    }
}

// Main function
fun main() {
    val store = Store()

    while (true) {
        println("=== Store Menu ===")
        println("1. View all products")
        println("2. Add new product")
        println("3. Remove product")
        println("0. Exit")
        print("Enter choice: ")

        val choice = readLine()

        if (choice == "1") {
            store.viewProducts()
        } else if (choice == "2") {
            print("Enter product name: ")
            val name = readLine() ?: ""

            print("Enter category: ")
            val category = readLine() ?: ""

            print("Enter price: ")
            val priceInput = readLine()
            val price = priceInput?.toDoubleOrNull() ?: 0.0

            print("Enter quantity: ")
            val quantityInput = readLine()
            val quantity = quantityInput?.toIntOrNull() ?: 0

            val product = Product(name, category, price, quantity)
            store.addProduct(product)

        } else if (choice == "3") {
            print("Enter name of product to remove: ")
            val name = readLine() ?: ""
            store.removeProduct(name)
        } else if (choice == "0") {
            println("Exiting program.")
            break
        } else {
            println("Invalid option.\n")
        }
    }
}
