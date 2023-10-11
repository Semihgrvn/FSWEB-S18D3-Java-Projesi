
// select * from kitap as k, tur as t where k.turno=t.turno and t.turadi in('Fıkra', 'Hikaye')
//select o.ogrno, o.ograd, o.ogrsoyad, k.kitapadi from ogrenci as o, islem as i, kitap as k where o.ogrno= i.ogrno and i.kitapno = k.kitapno and sinif in('10A', '10B')
//select o.ograd, o.ogrsoyad, i.atarih from ogrenci as o inner join islem as i on o.ogrno=i.ogrno
//select k.kitapadi, t.turadi from kitap as k inner join tur as t on k.turno=t.turno where t.turadi= 'Fıkra' or t.turadi= 'Hikaye'
//select o.ogrno, o.ograd, o.ogrsoyad, k.kitapadi from ogrenci as o inner join islem as i on o.ogrno = i.ogrno inner join kitap as k on k.kitapno= i.kitapno where o.sinif in ( '10B', '10C') order by o.ograd
//select  o.ograd, o.ogrsoyad,i.atarih from ogrenci as o left join islem as i on o.ogrno = i.ogrno
//select  o.ograd, o.ogrsoyad,i.atarih from ogrenci as o left join islem as i on o.ogrno = i.ogrno where i.atarih is null
//select k.kitapadi, k.kitapno, count(k.kitapno) from kitap as k inner join islem as i on k.kitapno = i.kitapno group by k.kitapadi, k.kitapno order by k.kitapno
//select k.kitapadi, k.kitapno, count(i.kitapno) as adet from kitap as k left join islem as i on k.kitapno = i.kitapno group by k.kitapadi, k.kitapno order by adet asc
//select o.ograd, o.ogrsoyad, k.kitapadi from ogrenci as o inner join islem as i on o.ogrno= i.ogrno inner join kitap as k on i.kitapno=k.kitapno
//select o.ograd, o.ogrsoyad, k.kitapadi,y.yazarad, y.yazarsoyad, i.atarih, t.turadi from ogrenci as o left join islem as i on o.ogrno= i.ogrno left join kitap as k on i.kitapno=k.kitapno left join yazar as y on k.yazarno=y.yazarno left join tur as t on k.turno=t.turno order by o.ograd, o.ogrsoyad
//select o.ograd, o.ogrsoyad, count(i.ogrno) from ogrenci as o inner join islem as i on o.ogrno = i.ogrno where o.sinif in('10A', '10B') group by o.ograd, o.ogrsoyad
//select avg(sayfasayisi) as ortalama_sayfasayisi from kitap
//select k.kitapadi, k.sayfasayisi from kitap as k where sayfasayisi > (select avg(sayfasayisi) from kitap)
//select count(o.ogrno) from ogrenci as o
//select count(o.ogrno) as 'toplam sayı' from ogrenci as o
//select count(distinct o.ograd) as 'toplam sayı' from ogrenci as o
//select max(k.sayfasayisi) from kitap as k
//select k.kitapadi, k.sayfasayisi from kitap as k order by k.sayfasayisi desc limit 1
//select min(sayfasayisi) from kitap
//select kitapadi sayfasayisi from kitap where sayfasayisi=(select min(sayfasayisi) from kitap)
//select max(sayfasayisi) from kitap as k inner join tur as t on k.turno = t.turno where t.turadi = 'Dram'
//select sum(sayfasayisi) from islem as i left join kitap as k on i.kitapno=k.kitapno where i.ogrno=15
//select o.ograd, count(*) from ogrenci as o group by o.ograd
//select sinif, count(o.ogrno) from ogrenci as o group by o.sinif
//select sinif, cinsiyet, count(*) as 'ogrenci sayisi' from ogrenci group by sinif, cinsiyet order by sinif
//select o.ograd, o.ogrsoyad, sum(k.sayfasayisi) from ogrenci as o inner join islem as i on i.ogrno = o.ogrno inner join kitap as k on i.kitapno=k.kitapno group by o.ograd, o.ogrsoyad order by total desc
//select o.ogrno, o.ograd, o.ogrsoyad, count(i.kitapno) as 'kitap sayisi' from islem as i inner join ogrenci as o on i.ogrno = o.ogrno group by o.ogrno, o.ograd, o.ogrsoyad