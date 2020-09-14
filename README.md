# Veri Yapilari

### Sıralama Algoritmaları

#### Araya Sokma Siralamasi - Insertion Sort 
- Araya sokma algoritması, sıralanacak dizinin ilk elemanını yerinde bırakır ondan sonraki elemanları sırayla alarak sıraya uygun yere sokar.     
- Olumsuz yanı araya sokulacak eleman için geride kalan diğer elemanların birer kaydırılması gerekliliğidir. Zaman maliyeti açısından olumsuz.   
- Bu algoritmanın karmaşıklığı O(n²)’dir.

#### Seçmeli Siralamasi - Selection Sort 
- Dizinin her adımda bir elemanı seçilir ve kalan dizinin en küçük elemanı bulunarak seçilen elemanla yer değiştirilir.
- Bu işlem dizinin başından ya da sonundan başlanarak tüm elemanlar değerlendirilene kadar devam eder.
- Bu algoritmanın karmaşıklığı O(n²) dir.

#### Buket Sıralaması - Radix Sort
- Radix Sort dizinin terimlerini birbirleriyle mukayese etmez. Onun yerine, sayıları basamak (hane) değerlerine göre gruplar.
- Verilen sayıları sağdan sola doğru ya da soldan sağa doğru basamak değerlerine göre ayırır. 
- Her geçişte, aynı basamak değerini alan sayılar bir araya getirilir. Geçişler bitince, sayılar sıralanmış olur.
- Ortalama olarak, zaman karmaşıklığı O(n) dir.

#### Kabarcık Sıralaması - Bubble Sort
- Dizideki her bir eleman baştan başlanarak ve her adımda birer kaydırılarak ikişer ikişer kendi içinde kıyaslanır ve yer değiştirilir. 
- Bu ikili kontrol işlemi doğru sıralama elde edilene kadar devam eder.
- Bu algoritmanın karmaşıklığı O(n²) dir.

#### Birleşmeli Sıralama - Merge Sort
- Parçala yönet mantığıyla geliştirilmiş özyinelemeli (recursive) sıralama algoritmasıdır. Temel olarak üç aşamadan oluşur. 
- Algoritma kendine verilen diziye ikiye böler. Birinci ve ikinci parçaların sıralanmasını sağlar. 
- Zaman karmaşıklığı O(n log₂ n) dir.

#### Kümeleme/Yığınlama Sıralaması - Heap Sort
- Heap Sort, özel ağaç yapısı ile eleman kümesindeki değerlerin kümeleme işlemi yapılmasıyla ortaya çıkan sıralama algoritmasıdır. 
- Bu algoritmada büyük olan sayı daima ağacın üst bölümünde yer alır. Kendinden küçük sayılar bu ağacın dallarını oluşturmaktadırlar.
- Bu algoritmanın karmaşıklığı O(n log₂ n) dir.

#### Hızlı Sıralama - Quick Sort
- “Böl ve yönet” stratejisine dayanan basit ve hızlı bir sıralama yöntemi kullanır. Bu algoritma, başlarken dizinin terimleri arasından bir terimi mihenk (pivot) olarak seçer. 
- Pivottan küçük değerler solda büyük değerler sağda alt dizilere ayrılır. Pivot bu iki alt diziden birine yerleştirilebilir. 
- Daha sonra bu alt dizilerde kendi içlerinde pivot değerlere göre yeniden alt dizilere ayrılır. 
- Bu işlem diziler parçalanamayacak duruma gelene kadar tekrarlanır. Bu algoritma özyinelemeli (recursive) doğaya sahiptir.
- Bu algoritmanın karmaşıklığı O(n log₂ n) dir.

