# This is Path File Path Guide

Java Spring Boot dengan struktur modular, menggunakan Maven, Java 17, dan versi stabil Spring Boot (3.3.12).
    
    warung_madura-system
    |- .idea
    |- .mvn
    |- src
        |- main
            |- java
                |- com.warung_madura.warung_madura_system
                    |- controller
                        |- ProductController
                        |- TransactionController
                        |- UserController
                    |- model
                        |- Admin
                        |- Cashier
                        |- InventoryManager
                        |- MinimarketApplication
                        |- Product
                        |- Report
                        |- ReportManager
                        |- SalesManager
                        |- Transaction
                        |- User
                        |- UserManager
                    |- repository
                        |- ProductRepository
                        |- TransactionRepository
                        |- UserRepository
                    |- service
                        |- ProductService
                        |- TransactionService
                        |- UserService
                    |- WarungMaduraSystemApplication
            |- resources
                |- application.properties