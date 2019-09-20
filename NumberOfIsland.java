{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int numIslands(char[][] grid) \{\
       if(grid == null || grid.length == 0 )\
			return 0;\
		int num =0;\
        int r_count = grid.length, c_count = grid[0].length;\
        for(int i =0; i < r_count ; i++) \{\
        	for(int j=0; j <c_count; j++) \{\
        		if(grid[i][j]=='1') \{\
        			num++;\
        			dfs(grid,i,j);\
        		\}\
        	\}\
        \}\
 		return num;\
	\}\
	\
	\
	public void dfs(char[][] grid, int r, int c) \{\
		\
		if( r<0 || c<0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0' )\
			return;\
		\
		if (grid[r][c]==0)\
			return;\
		grid[r][c]=0;\
		dfs(grid,r,c-1);\
		dfs(grid,r,c+1);\
		dfs(grid,r-1,c);\
		dfs(grid,r+1,c);\
	\}\
\}}