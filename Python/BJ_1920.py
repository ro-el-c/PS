#1920 수 찾기
'''
  1. 시간 초과 - in을 이용한 단순 연산 - O(N*M)
  2. 정렬 후 이진 탐색 - O((N+M)logN)
'''
import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
nums.sort()

m = int(input())
find_nums = list(map(int, input().split()))

def findNum(num):
  lo, hi = 0, len(nums)-1
  while lo <= hi:
    mid = (lo + hi) // 2

    if nums[mid] < find_num:
      lo = mid + 1
    elif nums[mid] > find_num:
      hi = mid - 1
    else:
      return True
  return False

for find_num in find_nums:
  print(1 if findNum(find_num) else 0)
