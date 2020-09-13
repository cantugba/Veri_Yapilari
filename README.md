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
