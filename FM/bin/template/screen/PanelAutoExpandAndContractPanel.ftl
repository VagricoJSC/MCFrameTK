		p.${aBlockId}Panel.add(p.FoldBasePanel);
		p.${aBlockId}Panel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.${aBlockId}Panel.add(p.CtrlPanel, null);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
