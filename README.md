# 🌟 QR Code generator library - Java 🌟

This project aims to be the best, clearest QR Code generator library. The primary goals are flexible options and absolute correctness. Secondary goals are compact implementation size and good documentation comments.

## 📌 Features
Core Features:
- Significantly shorter code but more documentation comments compared to competing libraries
- Supports encoding all 40 versions (sizes) and all 4 error correction levels, as per the QR Code Model 2 standard
- Output format: Raw modules/pixels of the QR symbol
- Detects finder-like penalty patterns more accurately than other implementations
- Encodes numeric and special-alphanumeric text in less space than general text
- Open-source code under the permissive MIT License

Manual Parameters:
- User can specify minimum and maximum version numbers allowed, then library will automatically choose smallest version in the range that fits the data
- User can specify mask pattern manually, otherwise library will automatically evaluate all 8 masks and select the optimal one
- User can specify absolute error correction level, or allow the library to boost it if it doesn't increase the version number
- User can create a list of data segments manually and add ECI segments

Optional Advanced Features:
- Encodes Japanese Unicode text in kanji mode to save a lot of space compared to UTF-8 bytes
- Computes optimal segment mode switching for text with mixed numeric/alphanumeric/general/kanji parts

## 🚀 Getting Started

To get started with this project, follow these steps:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/septianyudhistira/seeyou-qrcode.git

## 👥 Contributing
Feel free to submit issues or pull requests for improvements and bug fixes.

🎉 Special Thanks
This project is inspired by the work of the following individual:

@nayuki - For the amazing foundational work on [his/her/their] number utility library, which provided the core ideas and inspiration for this project.
