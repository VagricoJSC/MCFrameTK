package mcframe.clientMAUB.MAUBP5210;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientFXUC.FXUCP0010.FXUCP_DataUtil;
import mcframe.clientFXBA.FXBAP0010.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_Hrrchy_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_Hrrchy_D_MC extends MAUBP_Hrrchy_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected MCList <MCConstRow> _base_list_all = null;
	protected MCList <MCConstRow> _base_list_view = null;
	protected String _hrrchy_col_nm = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Hrrchy_D_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_Hrrchy_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/*
	 * ■階層表示用埋込画面
	 * 
	 * 機能：
	 * 展開番号（par_extnoとextno）で階層を表現し、
	 * 展開、折りたたみ機能を持ったテーブルにする。
	 * 
	 * 仕様：
	 * １）extnoは一意である必要がある。
	 * ２）par_extno = 0のコンテナが存在する場合、そのコンテナが
	 * 最上位と判断され、ソート順を決めるsort_noに、
	 * 展開番号の展開順の通りに連番が設定される。
	 * そのため、埋込画面利用画面で別の項目をソートに
	 * 使用することはできない。
	 */

	// 通信後処理
	@Override
	public void afterCallParts(MCRowMatcher matcher, MCCaller caller) {
		super.afterCallParts(matcher, caller);
		int blockIdx = caller.getDownParamBlockIndex(HrrchyTable);
		MCList<?> downL = caller.getDownParamList(blockIdx);
		String hrrchy_str_col = columnHrrchy_hrrchy_str.getBaseRowColumnName();
		String leaf_str_col = columnHrrchy_leaf_str.getBaseRowColumnName();
		String bottom_flg_col = columnHrrchy_bottom_flg.getBaseRowColumnName();
		String sort_col_col = columnHrrchy_sort_col.getBaseRowColumnName();
		String innerRow_col = hrrchy_str_col.substring(0, hrrchy_str_col.lastIndexOf("."));
		MCList<HrrchyR> tarL = downL.innerRowList(innerRow_col, HrrchyR.class);
		if (caller instanceof mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher
				|| caller instanceof mcframe.clientMAUD.MAUDP0030.MAUDP_RLSearcher) {
			setViewInfo(tarL);
			FXBAP_Caller fc = (FXBAP_Caller)caller;
			fc.addDownItemNames(blockIdx, hrrchy_str_col, leaf_str_col, bottom_flg_col, sort_col_col);
		}
	}

	// 部品内で使用するユーティリティ
	protected IfHrrchyBase getHrrchyBaseNE() {
		return getLinkPartsPanelNE(IfHrrchyBase.class);
//		return getBaseNE(IfHrrchyBase.class);
	}
	
	
	protected String getHrrchyColNm() {
		return _hrrchy_col_nm;
	}
	
	protected Class getBaseRowClass() {
		return getBaseListAll().createRow().getClass();
	}
	
	protected MCList<HrrchyR> getHrrcyListAll() {
		return getInnerHrrcyList(getBaseListAll());
	}

	protected MCList<HrrchyR> getHrrcyListView() {
		return getInnerHrrcyList(getBaseListView());
	}
	
	protected MCList<HrrchyR> getInnerHrrcyList(MCList<? extends MCConstRow> l) {
		MCList<HrrchyR> ret = MCList.create(HrrchyR.class);
		for (MCConstRow r :l) {
			ret.add(r.getInnerRow(getHrrchyColNm(), HrrchyR.class));
		}
		return ret;
	}

	protected void setViewInfo(MCList<HrrchyR> l) {
		MCIndexKey idx = l.createIndex(HrrchyR.$par_extno);
		IfHrrchyBase mv = getHrrchyBaseNE();
		if (mv == null || !mv.setHrrchyStr()){
			setHrrchyStr(l);
		}
		if (mv == null || !mv.setLeafStr()) {
			setLeafStr(l);
		}
		setBottomFlg(l, idx);
		setSortCol(l, idx, null, 0);
	}

	
	/**
	 * 現状のリスト（getHrrchyL()で取得できるリスト）に対して表示用の項目をセットする。
	 * afterCallPartsが呼べない状況で表示用の項目をセットしたい場合に使うことを想定している。
	 * 
	 * @param l 全ての行を含むリスト
	 */
	public void setViewInfo() {
		setViewInfo(getHrrchyL());
	}

	// ベース画面で使用するAPI
	public MCList<MCConstRow> getBaseListAll() {
		return _base_list_all;
	}

	public MCList<MCConstRow> getBaseListView() {
		return _base_list_view;
	}
	
	/**
	 * 指定したリストを保持し、全て閉じて表示する。
	 * Callerのshowメソッドの中で呼ぶことを想定している。
	 * 
	 * @param l 全ての行を含むリスト
	 */
	public void showCollapseAll(MCList<? extends MCConstRow> l) {
		getBaseListAll().setAll(l);
		collapseAll();
	}
	
	/**
	 * 指定したリストを保持し、全展開して表示する。
	 * Callerのshowメソッドの中で呼ぶことを想定している。
	 * 
	 * @param l 全ての行を含むリスト
	 */
	public void showExpandAll(MCList<? extends MCConstRow> l) {
		getBaseListAll().setAll(l);
		expandAll();
	}
	
	
	/**
	 * 全展開して表示する。
	 */
	public void expandAll() {
		if (getBaseListAll().isEmpty()) {
			return;
		}
		
		MCTable<?> table = HrrchyTable.getBaseTable();
		javax.swing.JComponent compo = MCBeansUtil.getFocusOwner(getBaseRootPanel());
		boolean focus = table.equalsIgnoreCase(compo);
		table.removeEditor();
		table.mcClearSelection();
		
		MCList<MCConstRow> tmp = getBaseListAll().shallowClone();
		hndlExpandList(tmp);
		getBaseListView().setAll(tmp);
		sortHrrchyTable();
		setExtValue();
		
		if (HrrchyTable.getRowCount() > 0) {
			if (focus) {
				table.selectLeftmostColumn(0);
			}
			else {
				table.selectRowNoFocus(0);
			}
		}
		afterSetViewList();
		adjustWidthHrrchyTable();
	}

	/**
	 * 全て閉じて表示する。
	 */
	public void collapseAll() {
		
		if (getBaseListAll().isEmpty()) {
			return;
		}
		
		MCTable<?> table = HrrchyTable.getBaseTable();
		javax.swing.JComponent compo = MCBeansUtil.getFocusOwner(getBaseRootPanel());
		boolean focus = table.equalsIgnoreCase(compo);
		table.removeEditor();
		table.mcClearSelection();
		
		MCList<MCConstRow> addL = MCList.create(getBaseRowClass());
		MCList<MCConstRow> rmL = MCList.create(getBaseRowClass());
		for (HrrchyR r :getHrrcyListAll()) {
			if (isNull(r.par_extno())) {
				addL.add((MCConstRow)r.getRootRow());
			}
			else {
				rmL.add((MCConstRow)r.getRootRow());
			}
		}
		MCList<MCConstRow> exptRmL = hndlCollapseList(rmL);
		if (exptRmL != null) {
			addL.addAll(exptRmL);
		}
		getBaseListView().setAll(addL);
		
		sortHrrchyTable();
		setExtValue();
		
		if (HrrchyTable.getRowCount() > 0) {
			if (focus) {
				table.selectLeftmostColumn(0);
			}
			else {
				table.selectRowNoFocus(0);
			}
		}
		afterSetViewList();
		adjustWidthHrrchyTable();
	}


	// 初期化処理
	@Override
	protected void partsInit() {
		super.partsInit();
		_base_list_view = (MCList<MCConstRow>)HrrchyTable.getBaseTable().getList();
		_base_list_all = _base_list_view.shallowClone();
		setHrrchyColNm();
		columnHrrchy_ext.setIgnoreStatus(true);
		HrrchyTable.getBaseTable().setPopupConfig(createHrrchyTablePopupConfig());
		
		columnHrrchy_extno.setScale(0);
		columnHrrchy_par_extno.setScale(0);
		columnHrrchy_sort_col.setScale(0);
		
		//---GUI操作、表示
		//ソート不可
		HrrchyTable.getBaseTable().setSortable(false);
		//ステータスカラム非表示
		HrrchyTable.getBaseTable().setStatusColumnVisible(false);
		
		//---ソート順
		HrrchyTable.getBaseTable().addSortColumn(columnHrrchy_sort_col, SortType.ASC);
	}
	
	protected FXBAP_PopupConfig createHrrchyTablePopupConfig() {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(HrrchyTable.getBaseTable());
		conf.ignoreSortOrder(true);
		conf.ignoreTableSort(true);
		return conf;
	}
	
	protected void setHrrchyColNm() {
		_hrrchy_col_nm = findHrrchyColNm();
	}
	
	protected String findHrrchyColNm() {
		String path = columnHrrchy_ext.getBaseRowColumnName();
		return path.substring(0, path.lastIndexOf("."));
	}

	// イベント処理
	@Override
	public void doHrrchy_ext_NC(MCEventInfo info) {
		super.doHrrchy_ext_NC(info);
		
		selectionChanged(info, false);
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		getBaseListAll().clear();
		getBaseListView().clear();
	}
	
	protected void doExtChng() {
		HrrchyR r = HrrchyTable.getSelectedMCRow();
		if (r == null || r.bottom_flg()) {
			return;
		}
		setValueEx(columnHrrchy_ext, r.getGUIIndex(), !r.ext());
	}

	/**
	 * 「展開」の値を変更したときの処理
	 */
	protected void selectionChanged(MCEventInfo info, boolean below) {
		HrrchyR r = getHrrchyL().get(info.getEventIndex());

		if (r.ext()) {
			doCollapse(r);
		}
		else {
			if (below) {
				doExpandOffspring(r);
			}
			else {
				doExpand(r);
			}
		}
		sortHrrchyTable();
		setExtValue();
		afterSetViewList();
		adjustWidthHrrchyTable();
	}
	
	protected void doExpand(HrrchyR r) {
		MCList<MCConstRow> tmp = MCList.create(getBaseRowClass());
		for (HrrchyR s :getHrrcyListAll().subList(HrrchyR.$par_extno, r.extno())) {
			tmp.add((MCConstRow)s.getRootRow());
		}
		hndlExpandList(tmp);
		getBaseListView().addAll(tmp);
	}
	
	protected void doExpandOffspring(HrrchyR r) {
		MCList<MCConstRow> tmp = getOffspring(r);
		hndlExpandList(tmp);
		getBaseListView().addAll(tmp);
	}

	protected void hndlExpandList(MCList<MCConstRow> l) {
		if (getHrrchyBaseNE() != null) {
			getHrrchyBaseNE().hndlExpandList(l);
		}
	}
	
	protected void doCollapse(HrrchyR r) {
		MCList<MCConstRow> tmp = getOffspring(r);
		hndlCollapseList(tmp);
		getBaseListView().removeAll(tmp);
	}
	
	protected MCList<MCConstRow> getOffspring(HrrchyR par) {
		MCList<MCConstRow> ret = MCList.create(getBaseRowClass());
		MCList<HrrchyR> l = getHrrcyListAll();
		MCIndexKey idx = l.createIndex(HrrchyR.$par_extno);
		findOffspring(l, idx, par, ret);
		return ret;
	}
	
	protected void findOffspring(MCList<HrrchyR> l, MCIndexKey idx, HrrchyR par, MCList<MCConstRow> buf) {
		MCList<HrrchyR> chldren = l.subList(idx, par.extno());
		for (HrrchyR chd :chldren) {
			buf.add((MCConstRow)chd.getRootRow());
			findOffspring(l, idx, chd, buf);
		}
	}
	
	protected  MCList<MCConstRow> hndlCollapseList(MCList<MCConstRow> l) {
		if (getHrrchyBaseNE() != null) {
			return getHrrchyBaseNE().hndlCollapseList(l);
		}
		return null;
	}
	
	protected void afterSetViewList() {
		if (getHrrchyBaseNE() != null) {
			getHrrchyBaseNE().afterSetViewList();
		}
	}

	protected void setExtValue() {
		MCList<HrrchyR> l = getHrrcyListView();
		MCIndexKey idx = l.createIndex(HrrchyR.$par_extno);
		for (HrrchyR r :l) {
			if (r.bottom_flg()) {
				r.ext(false);
			}
			else if (l.subList(idx, r.extno()).size() > 0) {
				r.ext(false);
			}
			else {
				r.ext(true);
			}
		}
	}

	// セルコンフィグ
	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (!isDefaultModeEditable(column)) {
			return super.getCellMode(index, column);
		}
		if (column == columnHrrchy_ext) {
			if (getHrrchyL().get(index).bottom_flg()) {
				return MCMode.READ_ONLY;
			}
		}
		return super.getCellMode(index, column);
	}

	protected void sortHrrchyTable() {
		sort(HrrchyTable.getBaseTable());
	}

	protected void adjustWidthHrrchyTable() {
		HrrchyTable.getBaseTable().adjustWidth();
	}

	protected void setHrrchyStr(MCList<HrrchyR> l) {
		for (HrrchyR r : l) {
			if (!isNull(r.hrrchy())) {
				r.hrrchy_str(putHrrchyIndent(r.hrrchy(), r.hrrchy().toString()));
			}
		}	
	}

	protected void setLeafStr(MCList<HrrchyR> l) {
		for (HrrchyR r : l) {
			r.leaf_str(putLeafIndent(r.hrrchy(), r.leaf()));
		}	
	}
	
	/**
	 * 階層番号用のインデントを文字列に追加して返す。<p>
	 * @param indentNum インデント数
	 * @param str 文字列
	 * @return インデントを追加した文字列
	 */
	public String putHrrchyIndent(MCNumber indentNum, String str) {
		return FXUCP_DataUtil.putIndent(indentNum, str);
	}

	/**
	 * リーフ、ノード用のインデントを文字列に追加して返す。<p>
	 * 
	 * @param indentNum インデント数
	 * @param str 文字列
	 * @return インデントを追加した文字列
	 */
	public String putLeafIndent(MCNumber indentNum, String str) {
		if (getPgmSettingBooleanNE(this, false, "leafindent")){
			return FXUCP_DataUtil.putIndent(indentNum, str);
		}
		return str;
	}

	protected void setBottomFlg(MCList<HrrchyR> l, MCIndexKey idx) {
		for (HrrchyR r :l) {
			if (l.subList(idx, r.extno()).isEmpty()) {
				r.bottom_flg(true);
			}
		}
	}
	
	protected int setSortCol(MCList<HrrchyR> l, MCIndexKey idx, MCNumber par_extno, int current) {
		// 親展開番号をもとに直接の子レコードを取得する
		MCList<HrrchyR> chdL = l.subList(idx, par_extno);

		chdL.sort(HrrchyR.$extno);
		for (HrrchyR chd : chdL) {
			// ソートキーの設定
			chd.sort_col(current);
			// ソートキーの採番
			current++;

			// このレコードの子レコードに対してソートキーを設定する
			current = setSortCol(l, idx, chd.extno(), current);
		}

		// 最後に採番したソートキーを返す
		return current;
	}

}