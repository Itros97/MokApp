package app.skylerie.mokapp.data.repository

interface AssetRepository {
    //Region: Physical Products
    /**
     * Insert physical product into the repository
     */
    fun insertPhysicalProduct()
    /**
     * Get physical product from the repository
     */
    fun getPhysicalProduct()
    /**
     * Update physical product in the repository
     */
    fun updatePhysicalProduct()
    /**
     * Delete physical product from the repository
     */
    fun deletePhysicalProduct()
    /**
     * Get by category id
     */
    fun getPhysicalProductsByCategoryId()

    //EndRegion: Physical Products

    //Region: Digital Products
    /**
     * Insert digital product into the repository
     */
    fun insertDigitalProduct()
    /**
     * Get digital product from the repository
     *
     */
    fun getDigitalProduct()
    /**
     * Update digital product in the repository
     */
    fun updateDigitalProduct()
    /**
     * Delete digital product from the repository
     */
    fun deleteDigitalProduct()
    /**
     * Get by category id
     */
    fun getDigitalProductsByCategoryId()

    //EndRegion: Digital Products


}