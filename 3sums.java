/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all 
unique triplets in the array which gives the sum of zero.

Note:
The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

************************************************************************************************************************************
The idea is to sort an input array and then run
through all indices of a possible first element of a triplet. 
For each possible first element we make a standard bi-directional 2Sum 
sweep of the remaining part of the array. Also we want to skip equal elements to 
avoid duplicates in the answer without making a set or smth like that
************************************************************************************************************************************
*/
