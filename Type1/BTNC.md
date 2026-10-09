# PHẦN 3. NÂNG CAO KỸ NĂNG OOP

## Bài 7. Sao chép và di chuyển điểm

**Độ khó:** 3/5

### Đề bài

Một điểm A có tọa độ `(x, y)`. Hãy tạo một điểm B là bản sao của A, sau đó di chuyển B theo độ dịch chuyển `(dx, dy)`.

**Lưu ý:** Điểm A ban đầu phải được giữ nguyên.

### Yêu cầu lớp `Point`

| Phương thức                  | Chức năng                              |
| ---------------------------- | -------------------------------------- |
| `Point(double x, double y)`  | Constructor có tham số                 |
| `Point(Point p)`             | Constructor sao chép                   |
| `move(double dx, double dy)` | Thay đổi tọa độ của đối tượng hiện tại |
| `getX()`                     | Trả về tọa độ x                        |
| `getY()`                     | Trả về tọa độ y                        |

### Input

- Dòng đầu là số bộ test `t`.
- Mỗi test gồm 4 số thực `x y dx dy`.

### Output

In tọa độ A và B sau khi di chuyển B, theo thứ tự:

`xA yA xB yB`

Mỗi số có 2 chữ số thập phân.

### Ví dụ

**Input**

```text
2
1 2 3 4
-2 5 4 -3
```

**Output**

```text
1.00 2.00 4.00 6.00
-2.00 5.00 2.00 2.00
```

### Kiến thức mới

- Copy Constructor.
- Thay đổi trạng thái đối tượng.
- Phân biệt hai đối tượng độc lập.
- Sử dụng `this`.
- Sử dụng getter để lấy dữ liệu.

---

## Bài 8. Tính khoảng cách bằng hai phương thức

**Độ khó:** 3/5

### Đề bài

Một người đi từ A đến B rồi đến C.

Hãy tính khoảng cách AB, BC và tổng quãng đường.

Tuy nhiên, chương trình phải sử dụng hai cách gọi phương thức khác nhau.

### Yêu cầu lớp `Point`

Xây dựng hai phương thức:

**Phương thức 1:**

```java
public double distance(Point other)
```

**Phương thức 2:**

```java
public static double distance(Point p1, Point p2)
```

### Yêu cầu trong `main()`

Bắt buộc tính:

- AB bằng `a.distance(b)`.
- BC bằng `Point.distance(b, c)`.
- Tổng quãng đường bằng `AB + BC`.

### Input

- Dòng đầu là số bộ test `t`.
- Mỗi test gồm 6 số thực tọa độ A, B, C.

### Output

In 3 số:

`AB BC Tổng_quãng_đường`

Mỗi số có 2 chữ số thập phân.

### Ví dụ

**Input**

```text
2
0 0 3 4 6 8
1 1 1 4 5 4
```

**Output**

```text
5.00 5.00 10.00
3.00 4.00 7.00
```

### Kiến thức mới

- Method Overloading.
- Phương thức `static`.
- Instance Method.
- Phân biệt cách gọi phương thức qua đối tượng và qua tên lớp.

---

## Bài 9. Khoảng cách giữa hai drone trong không gian 3D

**Độ khó:** 3/5

### Đề bài

Hai drone bay trong không gian ba chiều.

Mỗi drone có tọa độ `(x, y, z)`.

Hãy tính khoảng cách giữa hai drone.

### Yêu cầu lớp `Point3D`

| Thành phần                              | Chức năng                 |
| --------------------------------------- | ------------------------- |
| `private double x, y, z`                | Tọa độ không gian 3 chiều |
| `Point3D(double x, double y, double z)` | Constructor               |
| `getX()`                                | Lấy tọa độ x              |
| `getY()`                                | Lấy tọa độ y              |
| `getZ()`                                | Lấy tọa độ z              |
| `distance(Point3D other)`               | Tính khoảng cách 3D       |

### Công thức

Khoảng cách giữa hai điểm trong không gian 3 chiều:

\[
d = \sqrt{(x_1-x_2)^2+(y_1-y_2)^2+(z_1-z_2)^2}
\]

### Input

- Dòng đầu là số bộ test `t`.
- Mỗi test gồm 6 số thực:

`x1 y1 z1 x2 y2 z2`

### Output

In khoảng cách giữa hai drone với 2 chữ số thập phân.

### Ví dụ

**Input**

```text
2
0 0 0 1 2 2
1 1 1 4 5 13
```

**Output**

```text
3.00
13.00
```

### Kiến thức vận dụng

- Constructor.
- Encapsulation.
- Getter.
- Đối tượng làm tham số phương thức.
- Sử dụng `Math.sqrt()` và `Math.pow()`.

---

# PHẦN 4. BÀI TẬP KHÓ – VẬN DỤNG OOP

## Bài 10. Kiểm tra và tính chu vi tam giác

**Độ khó:** 4/5

### Đề bài

Cho ba điểm A, B, C trên mặt phẳng.

Hãy kiểm tra xem ba điểm có tạo thành một tam giác hợp lệ hay không.

- Nếu hợp lệ, tính chu vi tam giác.
- Nếu không hợp lệ, in `INVALID`.

### Yêu cầu

Xây dựng hai lớp:

- `Point`
- `Triangle`

### Lớp `Point`

Chứa tọa độ và phương thức tính khoảng cách:

```java
double distance(Point other)
```

### Lớp `Triangle`

Constructor:

```java
Triangle(Point a, Point b, Point c)
```

Các phương thức:

```java
boolean isValid()
double perimeter()
```

### Điều kiện tam giác hợp lệ

Gọi độ dài ba cạnh là `a`, `b`, `c`.

Tam giác hợp lệ khi:

- `a > 0`, `b > 0`, `c > 0`.
- `a + b > c`.
- `a + c > b`.
- `b + c > a`.

Chu vi tam giác:

\[
P = a+b+c
\]

**Lưu ý:** Khi so sánh số thực, nên xét sai số nhỏ như `1e-9`.

### Input

- Dòng đầu là số bộ test `t`.
- Mỗi test gồm 6 số thực tọa độ A, B, C.

### Output

- Nếu hợp lệ, in chu vi với 2 chữ số thập phân.
- Nếu không hợp lệ, in `INVALID`.

### Ví dụ

**Input**

```text
2
0 0 3 0 0 4
0 0 1 1 2 2
```

**Output**

```text
12.00
INVALID
```

### Kiến thức vận dụng

- Xây dựng nhiều lớp.
- Composition (lớp chứa đối tượng của lớp khác).
- Constructor nhận đối tượng.
- Phương thức trả về `boolean`.
- Kiểm tra điều kiện hình học.
- So sánh số thực với sai số.

---

## Bài 11. Kiểm tra hai vùng phủ sóng

**Độ khó:** 4/5

### Đề bài

Hai trạm phát sóng A và B có vùng phủ sóng dạng hình tròn.

Mỗi trạm được xác định bởi:

- Tâm `(x, y)`.
- Bán kính `r`.

Hãy kiểm tra xem hai vùng phủ sóng có điểm chung hay không, kể cả khi hai đường tròn chỉ tiếp xúc.

### Yêu cầu

Xây dựng hai lớp:

- `Point`
- `Circle`

### Lớp `Point`

Chứa tọa độ và phương thức tính khoảng cách.

### Lớp `Circle`

Khai báo thuộc tính:

```java
private Point center;
private double radius;
```

Constructor:

```java
Circle(Point center, double radius)
```

Phương thức:

```java
boolean overlaps(Circle other)
```

### Điều kiện hai vùng phủ sóng có điểm chung

Hai vùng phủ sóng có điểm chung khi:

\[
d \leq r_1+r_2
\]

Trong đó:

- `d`: Khoảng cách giữa hai tâm.
- `r1`: Bán kính hình tròn thứ nhất.
- `r2`: Bán kính hình tròn thứ hai.

Giả sử bán kính luôn không âm.

### Input

- Dòng đầu là số bộ test `t`.
- Mỗi test gồm 6 số thực:

`x1 y1 r1 x2 y2 r2`

### Output

- In `YES` nếu hai vùng phủ sóng có điểm chung.
- In `NO` nếu hai vùng phủ sóng không có điểm chung.

### Ví dụ

**Input**

```text
2
0 0 3 4 0 2
0 0 1 5 0 1
```

**Output**

```text
YES
NO
```

### Kiến thức vận dụng

- Composition.
- Thuộc tính là đối tượng.
- Constructor.
- Phương thức nhận đối tượng.
- Phương thức trả về `boolean`.
- Tính khoảng cách giữa hai điểm.
- Kiểm tra điều kiện hình học.

---

## Bài 12. Tìm trạm GPS gần nhất

**Độ khó:** 5/5

### Đề bài

Một kỹ sư khảo sát đang ở vị trí A `(x, y)`.

Trong khu vực có N trạm GPS với tọa độ khác nhau.

Hãy tìm trạm GPS gần vị trí A nhất.

**Lưu ý:** Nếu nhiều trạm có cùng khoảng cách nhỏ nhất, chọn trạm xuất hiện đầu tiên trong danh sách.

### Yêu cầu

Xây dựng lớp `Point` tương tự bài J04001.

### Lớp `Point`

Các thành phần:

```java
private double x;
private double y;
```

Constructor:

```java
Point(double x, double y)
```

Getter:

```java
double getX()
double getY()
```

Phương thức tính khoảng cách:

```java
double distance(Point other)
```

### Yêu cầu trong `main()`

Bắt buộc:

- Sử dụng mảng đối tượng `Point[]` để lưu các trạm GPS.
- Tạo đối tượng `Point` cho vị trí kỹ sư.
- Nhập tọa độ từng trạm GPS.
- Tính khoảng cách từ kỹ sư đến từng trạm.
- Tìm khoảng cách nhỏ nhất.
- Xác định vị trí của trạm gần nhất.
- Nếu có nhiều khoảng cách bằng nhau, giữ trạm xuất hiện đầu tiên.

### Input

Dòng đầu là số bộ test `t`.

Trong mỗi test:

- Dòng đầu gồm `N x y`.
- `N` là số trạm GPS (`1 ≤ N ≤ 1000`).
- `(x, y)` là tọa độ kỹ sư.
- `N` dòng tiếp theo, mỗi dòng gồm tọa độ của một trạm GPS.

### Output

In:

`Vị_trí_trạm Khoảng_cách_nhỏ_nhất`

Trong đó:

- Vị trí trạm được đánh số từ 1.
- Khoảng cách nhỏ nhất lấy 2 chữ số thập phân.

### Ví dụ

**Input**

```text
2
3 0 0
3 4
6 8
0 6
4 1 1
2 1
1 2
2 2
4 5
```

**Output**

```text
1 5.00
1 1.00
```

### Kiến thức vận dụng

- Constructor.
- Encapsulation.
- Getter.
- Đối tượng.
- Mảng đối tượng `Point[]`.
- Phương thức tính khoảng cách.
- Vòng lặp tìm giá trị nhỏ nhất.
- Xử lý trường hợp nhiều giá trị bằng nhau.
- Làm việc với nhiều bộ test.

---

# TỔNG KẾT KIẾN THỨC OOP

| Bài | Chủ đề                     | Kiến thức trọng tâm          | Độ khó |
| --- | -------------------------- | ---------------------------- | ------ |
| 7   | Sao chép và di chuyển điểm | Copy Constructor             | 3/5    |
| 8   | Tính khoảng cách           | Method Overloading, Static   | 3/5    |
| 9   | Khoảng cách 3D             | Object, Method, Math         | 3/5    |
| 10  | Chu vi tam giác            | Composition, Validation      | 4/5    |
| 11  | Vùng phủ sóng              | Composition, Boolean         | 4/5    |
| 12  | Trạm GPS gần nhất          | Array of Objects, Min Search | 5/5    |
