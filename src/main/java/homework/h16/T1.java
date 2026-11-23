package homework.h16;

// https://leetcode.com/problems/flood-fill/
public class T1 {
  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int oldColor = image[sr][sc];
    if (oldColor == color) {
      return image;
    }
    fill(image, sr, sc, oldColor, color);
    return image;
  }

  private void fill(int[][] img, int r, int c, int oldColor, int newColor) {
    if (r < 0 || r >= img.length || c < 0 || c >= img[0].length) {
      return;
    }
    if (img[r][c] != oldColor) {
      return;
    }
    img[r][c] = newColor;
    fill(img, r - 1, c, oldColor, newColor);
    fill(img, r + 1, c, oldColor, newColor);
    fill(img, r, c - 1, oldColor, newColor);
    fill(img, r, c + 1, oldColor, newColor);
  }
}
