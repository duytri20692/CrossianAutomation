# Chương trình Quản lý Điểm Thi Cuối Kỳ

## Mô tả

Đây là một chương trình Java console cho phép **giáo viên chủ nhiệm** nhập thông tin **điểm thi cuối kỳ** của học sinh trong lớp và hiển thị:

- Bảng điểm tổng hợp cho toàn bộ học sinh
- Học sinh có **điểm trung bình cao nhất**
- Học sinh có **điểm cao nhất ở từng môn**

Chương trình hỗ trợ **nhiều học sinh cùng có điểm cao nhất**.

---

## Tính năng

- Nhập số lượng học sinh
- Nhập danh sách môn học
- Nhập điểm từng môn cho từng học sinh
- Tính và hiển thị điểm trung bình
- Hiển thị bảng điểm rõ ràng theo bảng
- Tìm và hiển thị học sinh có:
  - Điểm trung bình cao nhất
  - Điểm cao nhất theo từng môn (nếu nhiều bạn bằng điểm → hiển thị tất cả)

---

## Cách chạy chương trình

### 1. Yêu cầu trước khi chạy

- Cài đặt Java JDK phiên bản 8 trở lên

- Thiết lập biến môi trường JAVA_HOME

- Thêm đường dẫn bin của Java vào PATH

### 2. Tải và chuẩn bị dự án

```bash 
git clone <link_repo>
```
```bash
cd <tên_thư_mục>/src
```

### 3. Biên dịch chương trình

```bash
javac -encoding UTF-8 GradeReport.java
```

### 4. Chạy chương trình

```bash
java GradeReport
```

---

## Ví dụ nhập liệu

```
Nhập số lượng học sinh: 2
Nhập tên các môn thi (phân cách bằng dấu phẩy): Toán, Lý, Hóa

Nhập thông tin cho học sinh thứ 1
Tên học sinh: Nam
Nhập điểm môn Toán: 9
Nhập điểm môn Lý: 8
Nhập điểm môn Hóa: 9

Nhập thông tin cho học sinh thứ 2
Tên học sinh: Lan
Nhập điểm môn Toán: 9
Nhập điểm môn Lý: 10
Nhập điểm môn Hóa: 9
```

---

## Kết quả đầu ra mẫu

```
=== BẢNG ĐIỂM CUỐI KỲ ===
STT  Tên                 Toán      Lý        Hóa       Trung Bình
----------------------------------------------------------
1    Nam                 9.00      8.00      9.00      8.67
2    Lan                 9.00      10.00     9.00      9.33

Học sinh có điểm trung bình cao nhất (9.33):
 - Lan

Học sinh có điểm cao nhất từng môn:
 - Toán (9.00):
    + Nam
    + Lan
 - Lý (10.00):
    + Lan
 - Hóa (9.00):
    + Nam
    + Lan
```

---

## Cấu trúc dự án

```
.
├── GradeReport.java    // File mã nguồn chính
└── README.md           // Tài liệu mô tả chương trình
```

---

## Công nghệ sử dụng

- Java SE 8+
- Console application (không dùng thư viện ngoài)

---

## Ghi chú

- Sử dụng `Scanner` để nhập liệu từ bàn phím.
- Dùng `ArrayList` và `LinkedHashMap` để lưu danh sách học sinh và điểm.
- Dùng `Stream` API và `Comparator` để tìm điểm cao nhất.

---


## Tác giả

Tri Nguyen - QA Automation Engineer 

