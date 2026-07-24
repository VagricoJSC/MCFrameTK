package mcframe.clientMABC.MABCP0850;

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
import java.util.*;
import javax.swing.tree.*;

import mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_SlsItmGrpReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_SlsItmGrpReg_MC extends MABCP_SlsItmGrpReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _noEvent = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_SlsItmGrpReg_MC() {
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
	public MABCP_SlsItmGrpReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL0850_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0850_Srch01Caller<P extends MABCP_SlsItmGrpReg, B extends MA_MABCL0850_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0850_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			super.clear();
			clearSub();
		}

		@Override
		protected void setModeNoDown() {
			if (isUpdOpe()) {
				setUPDStatus();
				setButtonMode();
			}
			else {
				setFIXStatus();
			}
		}

		@Override
		protected void show() {
			super.show();
			showSub();
		}

		protected void showSub() {
			// ツリーの表示
			viewTree(TreeTree, DtlTable);
		}
	}

	/**
	 * [MA_MABCL0850_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0850_Upd01Caller<P extends MABCP_SlsItmGrpReg, B extends MA_MABCL0850_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0850_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MA_MABCL0850_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0850_Del01Caller<P extends MABCP_SlsItmGrpReg, B extends MA_MABCL0850_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0850_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[SrchBtn]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doSrchBtn_srch(MCEventInfo info) {
		callMA_MABCL0850_Srch01();
	}
	/**
	 * Panel[TreeBtn]のボタン[view]の押下時の処理
	 */
	@Override
	public void doTreeBtn_view(MCEventInfo info) {
		viewTree(TreeTree, DtlTable);
		DtlTable.selectRowNoFocus(0);
		setButtonMode();
	}
	/**
	 * Panel[TreeBtn]のボタン[expand]の押下時の処理
	 */
	@Override
	public void doTreeBtn_expand(MCEventInfo info) {
		TreeTree.expandAll();
	}
	/**
	 * Panel[TreeBtn]のボタン[collapse]の押下時の処理
	 */
	@Override
	public void doTreeBtn_collapse(MCEventInfo info) {
		TreeTree.collapseAll();
	}
	/**
	 * Panel[Btn1]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn1_select_all(MCEventInfo info) {
		_noEvent = true; // 全選択の際に選択ＦＬＧのイベントが走らないように設定
		doSelectAll(DtlTable);
		_noEvent = false;
	}
	/**
	 * Panel[Btn1]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn1_deselect_all(MCEventInfo info) {
		_noEvent = true; // 全解除の際に選択ＦＬＧのイベントが走らないように設定
		doDeselectAll(DtlTable);
		_noEvent = false;
	}
	/**
	 * Panel[Btn1]のボタン[add_top]の押下時の処理
	 */
	@Override
	public void doBtn1_add_top(MCEventInfo info) {
		// 常に最下行に追加
		DtlTable.selectRowNoFocus(getDtlL().size()-1);
		DtlR addR = insertRow(DtlTable);
		addR.sls_itm_grp_lvl(MCNumber.ZERO);
		setButtonMode();
	}
	/**
	 * Panel[Btn1]のボタン[add_sub]の押下時の処理
	 */
	@Override
	public void doBtn1_add_sub(MCEventInfo info) {
		DtlR r = DtlTable.getSelectedMCRow();
		DtlR addR = insertRow(DtlTable);
		addR.up_sls_itm_grp_cd(r.sls_itm_grp_cd());
		addR.up_sls_itm_grp_nm(r.sls_itm_grp_nm());
		addR.sls_itm_grp_lvl(r.sls_itm_grp_lvl().add(1));
		setButtonMode();
	}
	/**
	 * Panel[Btn1]のボタン[del_rec]の押下時の処理
	 */
	@Override
	public void doBtn1_del_rec(MCEventInfo info) {
		delRec(DtlTable);
	}
	/**
	 * Panel[Btn1]のボタン[can_del]の押下時の処理
	 */
	@Override
	public void doBtn1_can_del(MCEventInfo info) {
		canDel(DtlTable);
	}
	/**
	 * Panel[Btn1]のボタン[rcopy]の押下時の処理
	 */
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0850_Del01();
	}

	@Override
	public void doBtn1_rcopy(MCEventInfo info) {
		// 行コピーで上一覧の選択行が変更される前に、下一覧に重複行が無いかチェック
		MCMessageList msgList = new MCMessageList();
		checkDuplicate(msgList, getLclTable(), getLclRKeyColumns());
		if (msgList.size() > 0) {
			message(msgList);
		}
		else {
			DtlR src = DtlTable.getSelectedMCRow();
			DtlR dest = DtlTable.getList().createRow();

			if (!src.isEmpty()) {
				MCConstRow.copyvalue(dest, src);
				getRLUtil().defCopyRowSub(dest);
				dest.sls_itm_grp_cd(null);
				dest.sls_itm_grp_nm(null);
				dest.setStatus(Status.CREATE);
			}
			//NCイベントがここで起こる
			//MCConstRow.copyvalueの前に持っていかないこと
			if (isNull(src.up_sls_itm_grp_cd())) {
				insertRow(DtlTable, DtlTable.getRowCount(), dest);
			}
			else {
				TreeR treeR = (TreeR)getTreeAndTableMap().get(src);
				int addIdx = TreeTree.getAllChildRows(treeR).size() + 1;
				if ((src.getGUIIndex() + addIdx) <= DtlTable.getRowCount()) {
					insertRow(DtlTable, src.getGUIIndex() + addIdx, dest);
				}
				else {
					insertRow(DtlTable, DtlTable.getRowCount(), dest);
				}
			}
			copyRowSub(dest);
			setButtonMode();
		}
	}
	/**
	 * Panel[LclBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_select_all(MCEventInfo info) {
		doSelectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doLclBtn_radd(MCEventInfo info) {
		insertRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLclBtn_rdel(MCEventInfo info) {
		deleteRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doLclBtn_rcopy(MCEventInfo info) {
		copyRow(LclTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0850_Upd01();
	}


	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_SLS_ITM_GRP));
		getCndR().sls_itm_grp_lvl(MCNumber.ZERO);
	}

	@Override
	protected void clearAll() {
		super.clearAll();
		clearSub();
	}

	protected void clearSub() {
		getTreeL().clear();
	}

	@Override
	public void fillSpace() {
		// 何もしない
	}

	@Override
	protected void doCndOpeNC(MCEventInfo info) {
		clearAll();
		// 操作種別変更時は常にFIXモード
		setFIXStatus();
		moveFocusCndPanel();
	}

	/**
	 * 販売品目体系削除ボタンの処理
	 */
	protected void delRec(MCTable table) {
		MCRow r = table.getSelectedMCRow();
		if (isNull(r.getValueNE(getUpdCntrColumn()))) {
			if (isExistsSubRec(r, table)) {
				throw new MCException(MABCP0015);
			}
			_noEvent = true; // 行削除後にフォーカス移動のイベントでイベントが走らないように設定
			deleteRow(table);
			_noEvent = false;
			int idx = r.getGUIIndex();
			if (table.getList().size()-1 < idx) {
				idx = table.getList().size()- 1;
			}
			table.selectRowNoFocus(idx);
		}
		else {
			if (isExistsSubRec(r, table, false)) {
				throw new MCException(MABCP0016);
			}

			r.setBooleanNE(DtlR.$del_flg, true);
			r.setStatus(MCRow.MODIFY);
			getTreeAndTableMap().set(TreeTree.getList(), DtlTable.getList());
		}
		setButtonMode();
	}
	/**
	 * 下位レコードが存在すればtrueを返す。
	 */
	protected boolean isExistsSubRec(MCRow row, MCTable table) {
		return !isNull(getSubRecRow(row, table));
	}
	/**
	 * 論理削除ＦＬＧが引数で指定したBOOL値の下位レコードが存在すればtrueを返す。
	 */
	protected boolean isExistsSubRec(MCRow row, MCTable table, boolean delFlg) {
		String slsItmGrpCd = row.getStringNE(DtlR.$sls_itm_grp_cd);
		if (isNull(slsItmGrpCd)) {
			return false;
		}
		MCIndexKey key = table.getList().createIndex(DtlR.$up_sls_itm_grp_cd, DtlR.$del_flg);
		return table.getList().getFirst(key, slsItmGrpCd, delFlg) != null;
	}
	/**
	 * 下位レコードを返す。
	 */
	protected MCRow getSubRecRow(MCRow row, MCTable table) {
		String cd = row.getStringNE(DtlR.$sls_itm_grp_cd);
		if (isNull(cd)) {
			return null;
		}
		MCIndexKey key = table.getList().createIndex(DtlR.$up_sls_itm_grp_cd);
		return table.getList().getFirst(key, cd);
	}
	/**
	 * 上位レコードを返す。
	 */
	protected MCRow getUpRecRow(MCRow row, MCTable table) {
		String cd = row.getStringNE(DtlR.$up_sls_itm_grp_cd);
		if (isNull(cd)) {
			return null;
		}
		MCIndexKey key = table.getList().createIndex(DtlR.$sls_itm_grp_cd);
		return table.getList().getFirst(key, cd);
	}
	/**
	 * 上位レコードの選択がオンのとき、下位レコードの選択をオンにする。
	 */
	protected void setSubCheckOn(DtlR row, MCTable table) {
		if (row.check()) {
			for (DtlR subR : getSubList(row, table)) {
				if (!subR.check()) {
					subR.check(true);
					setSubCheckOn(subR, table);
				}
			}
		}
	}
	/**
	 * 下位リストを返す。
	 */
	protected MCList<DtlR> getSubList(MCRow row, MCTable table) {
		String cd = row.getStringNE(DtlR.$sls_itm_grp_cd);
		MCIndexKey key = table.getList().createIndex(DtlR.$up_sls_itm_grp_cd);
		MCList<DtlR> subL = getDtlL().subList(key, cd);
		return subL;
	}

	/**
	 * ボタンのモード制御
	 */
	protected void setButtonMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (!isNull(r)) {
			setDefaultMode(Btn1_del_rec);
		}
		else {
			Btn1_del_rec.setMode(MCMode.DISABLE);
		}
		if (!isNull(r) && r.del_flg()) {
			setDefaultMode(Btn1_can_del);
		}
		else {
			Btn1_can_del.setMode(MCMode.DISABLE);
		}
		if (checkNotSet(DtlTable)) {
			Btn1_add_top.setMode(MCMode.DISABLE);
			Btn1_add_sub.setMode(MCMode.DISABLE);
			Btn1_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn1_add_top);
			if (!isNull(r) && !isNull(r.sls_itm_grp_cd()) && !isNull(r.sls_itm_grp_nm()) && !r.del_flg()) {
				setDefaultMode(Btn1_add_sub);
			}
			else {
				Btn1_add_sub.setMode(MCMode.DISABLE);
			}
			if (!isNull(r)) {
				setDefaultMode(Btn1_rcopy);
			}
			else {
				Btn1_rcopy.setMode(MCMode.DISABLE);
			}
		}
	}

	protected boolean checkNotSet(MCTable table) {
		if (table == DtlTable) {
			for (DtlR r : getDtlL()) {
				if (isNull(r.sls_itm_grp_cd())) {
					return true;
				}
			}
		}
		return false;
	}

	protected boolean _dropFlg = false;

	protected void setDropFlgTrue() {
		_dropFlg = true;
	}

	protected boolean chkDrop() {
		if (_dropFlg) {
			_dropFlg = false;
			return true;
		}
		return false;
	}

	/**
	 * ノードに対応するレコードを取得し、論理削除フラグがオンときfalseを返す（ドラッグさせない）
	 */
	protected boolean notDelSlsItmGrp(MCTree tree, MCTreeNode treeNode) {
		if (tree == TreeTree) {
			MCRow r = getTreeAndTableMap().get((MCRow)treeNode.getUserObject());
			if (r != null && r.getBoolean(DtlR.$del_flg)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		// 一覧の値が変更されたとき、ツリーとのマップを更新
		for (MCColumnConfig c : DtlTable.getAllColumnConfigs()) {
			if (c == lc) {
				getTreeAndTableMap().set(TreeTree.getList(), DtlTable.getList());
			}
		}
	}
	/**
	 * 論理削除取消ボタンの処理
	 */
	protected void canDel(MCTable table) {
		MCRow r = table.getSelectedMCRow();
		if (isNull(r)) {
			return ;
		}
		MCIndexKey key = table.getList().createIndex(DtlR.$sls_itm_grp_cd);
		MCRow row = table.getList().getFirst(key, r.getStringNE(DtlR.$up_sls_itm_grp_cd));
		
		if (!isNull(row) && row.getBooleanNE(DtlR.$del_flg)) {
			throw new MCException(MABCP0017);
		}

		r.setBooleanNE(DtlR.$del_flg, false);
		if (!isNull(row)) {
			MCNumber parentLvl = row.getNumberNE(DtlR.$sls_itm_grp_lvl);
			r.setNumberNE(DtlR.$sls_itm_grp_lvl, parentLvl.add(1));
		}
		if (r.isStatusNone()) {
			r.setStatus(MCRow.MODIFY);
		}
		getTreeAndTableMap().set(TreeTree.getList(), DtlTable.getList());

		setButtonMode();
	}

	@Override
	public boolean doDtl_check_VC(MCEventInfo info) {
		if (!_noEvent) {
			DtlR r = getDtlL().get(info.getEventIndex());
			MCRow upR = getUpRecRow(r, DtlTable);
			if (!isNull(upR)) {
				if (upR.getBoolean(DtlR.$check)) {
					return false;
				}
			}
		}
		return super.doDtl_check_VC(info);
	}

	@Override
	public void doDtl_check_NC(MCEventInfo info){
		if (!_noEvent) {
			super.doDtl_check_NC(info);

			int eventIdx = info.getEventIndex();
			DtlR r = getDtlL().get(eventIdx);
			setSubCheckOn(r, DtlTable);
			viewTree(TreeTree, DtlTable);
			DtlTable.selectRow(eventIdx);
		}
	}

	@Override
	public boolean doDtl_sls_itm_grp_cd_VC(MCEventInfo info) {
		if (getDtlL().getFirst(DtlR.$sls_itm_grp_cd, info.getNewValue()) != null) {
			dialog(MABCP0017);
			return false;
		}
		
		return super.doDtl_sls_itm_grp_cd_VC(info);
	}

	@Override
	public void doDtl_sls_itm_grp_cd_LC(MCEventInfo info) {
		super.doDtl_sls_itm_grp_cd_LC(info);

		int eventIdx = info.getEventIndex();
		viewTreeWithoutListSort(TreeTree, DtlTable);
		DtlTable.selectRow(eventIdx);

		setButtonMode();
	}

	@Override
	public void doDtl_sls_itm_grp_nm_LC(MCEventInfo info) {
		super.doDtl_sls_itm_grp_nm_LC(info);

		int eventIdx = info.getEventIndex();
		viewTreeWithoutListSort(TreeTree, DtlTable);
		DtlTable.selectRow(eventIdx);

		setButtonMode();
	}

	/**
	 * TreeのNCEventの実装<p>
	 * 選択した行のRowにリンクするTableの行をselectRow()で選択します。
	 */
	@Override
	public void doTree_NC(MCEventInfo info) {
		super.doTree_NC(info);

		if (!_noEvent) {
			viewList(TreeTree, DtlTable);
			selectRowNoFocus(info.getEventIndex(), false, DtlTable, TreeTree);
		}
	}

	/**
	 * Listを表示します。
	 */
	protected void viewList(MCTree tree, MCTable tab) {
		if (!chkDrop()) {
			return;
		}
		TreeModel model = tree.getModel();
		DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
		Enumeration e = root.preorderEnumeration();

		MCList<MCRow> listL = tab.getList().createInstance();
		MCList<MCRow> treeL = tree.getList().createInstance();
		
		
		while (e.hasMoreElements()) {
			DefaultMutableTreeNode node = (DefaultMutableTreeNode) e.nextElement();
			if (node.getUserObject() instanceof TreeR) {
				TreeR treeR = (TreeR) node.getUserObject();
				treeL.add(treeR);

				TreeAndTableMap map = getTreeAndTableMap();
				DtlR r = (DtlR)map.get(treeR);
				DefaultMutableTreeNode pNode = (DefaultMutableTreeNode) node.getParent();
				if (pNode.getUserObject() instanceof TreeR) {
					TreeR pR = (TreeR) pNode.getUserObject();
					// 上位が変更された場合のみ書き換え、ステータス変更
					if (!isSame(r.up_sls_itm_grp_cd(), pR.sls_itm_grp_cd())) {
						r.up_sls_itm_grp_cd(pR.sls_itm_grp_cd());
						r.up_sls_itm_grp_nm(pR.sls_itm_grp_nm());
						r.sls_itm_grp_lvl(pR.sls_itm_grp_lvl().add(1));
						if (r.isStatusNone()) {
							r.setStatus(MCRow.MODIFY);
						}
					}
				}
				listL.add(r);
			}
		}

		// treeに表示できていないMCRowを維持する。
		tab.getList().removeAll(listL);
		tab.getList().addAll(listL);

		getTreeAndTableMap().set(listL, treeL);
	}


	/**
	 * Treeを表示します。
	 */
	protected void viewTree(MCTree tre, MCTable tab) {
		MCList<MCRow> a = tre.getList();
		MCList<MCRow> b = getTreeSrc(tab.getList());
		setTree(a, b, tab);
		getTreeAndTableMap().set(a, b);
		tre.expandAll();

		// ツリーの並び順に合わせてリストを再表示
		setDropFlgTrue();
		viewList(tre, tab);
	}
	/**
	 * Treeに表示する元のリストを返します。
	 */
	protected MCList<MCRow> getTreeSrc(MCList<MCRow> l) {
		MCList<MCRow> m = MCList.create(MCRow.class);
		for (MCRow r : l) {
			if (!r.isEmpty() && !isNull(r.getStringNE("sls_itm_grp_cd"))) {
				m.add(r);
			}
		}
		return m;
	}
	/**
	 * Treeに設定します。
	 */
	protected void setTree(MCList<MCRow> treeL, MCList<MCRow> tabL, MCTable table) {

		MCList<MCRow> tmp = treeL.createInstance();

		for (MCRow r : tabL) {
			MCRow treeR = treeL.createRow();
			if (isNull(r.getStringNE("sls_itm_grp_cd"))) {
				continue;
			}
			// データを全て持つ
			treeR.setValuesByName(r);
			treeR.setStringNE("tree_sls_itm_grp_cd", (r.getStringNE("sls_itm_grp_cd")));
			treeR.setStringNE("tree_up_sls_itm_grp_cd", (r.getStringNE("up_sls_itm_grp_cd")));
			treeR.setStringNE("tree_row_label",
					createNodeLabel(r.getGUIIndex(), columnDtl_sls_itm_grp_cd, columnDtl_sls_itm_grp_nm));
			treeR.setAttributes(r);
			tmp.add(treeR);
		}
		treeL.setAll(tmp);
	}

	/**
	 * TableのNCEventの実装<p>
	 * 選択した行のRowにリンクするTreeの行が見えるようにTreeを展開します。
	 */
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		if (_noEvent) {
			viewTreeWithoutListSort(TreeTree, DtlTable);
		}

		selectRowNoFocus(info.getEventIndex(), true, DtlTable, TreeTree);
		setButtonMode();
	}
	protected void selectRowNoFocus(int i, boolean treeFlg, MCTable table, MCTree tree) {
		if (i < 0) {
			return ;
		}
		TreeAndTableMap map = getTreeAndTableMap();
		if (treeFlg) {
			DtlR r = (DtlR) table.getRow(i);
			MCRow tr = map.get(r);
			if (tree.getList().contains(tr)) {
				tree.selectRowNoFocus((TreeR) tr);
				DefaultMutableTreeNode root = (DefaultMutableTreeNode)  tree.getModel().getRoot();
				Enumeration e = root.preorderEnumeration();
				
				DefaultMutableTreeNode node = null;
				while (e.hasMoreElements()) {
					node = (DefaultMutableTreeNode) e.nextElement();
					if (node.getUserObject() == tr) {
						tree.scrollPathToVisible(new TreePath(node.getPath()));
						break;
					}
				}
			}
		}
		else {
			TreeR r = (TreeR) tree.getList().get(i);
			MCRow tr = map.get(r);
			if (table.getList().contains(tr)) {
				table.selectRowNoFocus(tr.getGUIIndex());
			}
		}
	}

	/**TreeとTableのRow同士の関連付けを保持します。*/
	TreeAndTableMap _treeTableMap = createTreeAndTableMap();

	/**TreeとTableのRow同士の関連付けを保持するTreeAndTableMapクラスを取得します。*/
	protected TreeAndTableMap getTreeAndTableMap() {
		return _treeTableMap;
	}

	/**リストＡとＢとを関連付けるためのクラスを取得します。*/
	protected TreeAndTableMap createTreeAndTableMap() {
		return new TreeAndTableMap();
	}

	/**リストＡとＢとを関連付けるクラスです。*/
	protected class TreeAndTableMap {
		Map<MCRow, MCRow> _abMap = new HashMap<MCRow, MCRow>();

		Map<MCRow, MCRow> _baMap = new HashMap<MCRow, MCRow>();

		/**
		 * 引数の List の Row 同士を関連付けます。
		 *
		 * <b>List同士を関連付けるものではありません。</b><br>
		 * 関連付けは格納順に行います。
		 * どちらか一方の要素が無くなった時点で関連付けは終了します。
		 * 残りの Row の関連付けは行われません。
		 */
		public void set(MCList<?> tree, MCList<?> table) {

			init();

			// マップ作成対象外のリスト
			if (isNull(tree) || isNull(table)) {
				return;
			}

			_abMap = new HashMap<MCRow, MCRow>();
			_baMap = new HashMap<MCRow, MCRow>();

			// マップ作成
			int size = tree.size();
			int bSize = table.size();
			size = (size < bSize) ? size : bSize;
			for (int i = 0; i < size; i++) {
				MCRow ar = tree.get(i);
				MCRow br = table.get(i);

				_abMap.put(ar, br);
				_baMap.put(br, ar);
			}

		}

		public MCRow get(MCRow key) {

			if (_abMap.containsKey(key)) {
				return _abMap.get(key);
			}
			if (_baMap.containsKey(key)) {
				return _baMap.get(key);
			}
			return null;
		}

		public void init() {
			_abMap.clear();
			_baMap.clear();
		}

		public void remove(MCRow key) {
			if (_abMap.containsKey(key)) {
				_abMap.remove(key);

			}
			else if (_baMap.containsKey(key)) {
				_baMap.remove(key);
			}
		}
	}


	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		DtlTable.setCellConfig(createDtlConf());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}

	public class DtlConf extends MAUDP_RLBaseCellConfig {
		public DtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (table.getBaseTable() == DtlTable) {
				DtlR r = (DtlR) table.getBaseTable().getRow(index);
				if (column == columnDtl_sls_itm_grp_cd) {
					if (isExistsSubRec(r, table)) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}


	@Override
	protected void tableInit() {
		super.tableInit();

		((MCTree64)TreeTree).delegate64 = getTree1Delegate();
	}

	protected static MCTree64Delegate getTree1Delegate() {
		// 別ファイル（MCTree64AppDelegate.java）で定義
		return new MCTree64AppDelegate();
	}

	protected boolean canDragAndDrop(MCTree tree) {
		if (tree == TreeTree) {
			return isSame(getStatus(), UPD);
		}
		return false;
	}
	@Override
	public MCList getDtl_up_sls_itm_grp_cd(MCRow row, MCEventInfo info) {
		MCList<DtlR> l = getDtlL();
		MCList<DtlR> nl = l.subList(r -> !isNull(r.sls_itm_grp_cd()) && !r.del_flg());
		nl.sort(DtlR.$sls_itm_grp_cd);
		return nl;
	}

	@Override
	protected void listInit() {
		super.listInit();
		columnDtl_up_sls_itm_grp_cd.setListVisibleColumn(DtlR.$sls_itm_grp_cd, DtlR.$sls_itm_grp_nm);
		getDtl_up_sls_itm_grp_cd_ListPutter().setColumns(DtlR.$sls_itm_grp_cd, DtlR.$sls_itm_grp_nm);
	}

	/**
	 * Tableの情報を元にTreeを表示します。Tableのリストをツリーの並びと合わせる処理は実行しません。
	 */
	protected void viewTreeWithoutListSort(MCTree tre, MCTable tab) {
		MCList<MCRow> a = tre.getList();
		MCList<MCRow> b = getTreeSrc(tab.getList());
		setTree(a, b, tab);

		getTreeAndTableMap().set(a, b);

		tre.expandAll();
		
		selectRowNoFocus(tab.getMCSelectedRow(), true, tab, tre);
	}

	@Override
	public void doDtl_up_sls_itm_grp_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_up_sls_itm_grp_cd_LC(info);
		setSlsItmGrpLvl(getDtlL().get(info.getEventIndex()));
		int eventIdx = info.getEventIndex();
		viewTreeWithoutListSort(TreeTree, DtlTable);
		DtlTable.selectRow(eventIdx);
		setButtonMode();
		
	}
	protected void setSlsItmGrpLvl(DtlR changedRow) {
		MCNumber newLvl = MCNumber.ZERO;
		if (!isNull(changedRow.up_sls_itm_grp_cd())) {
			DtlR parentDtlR = getDtlL().getFirst(DtlR.$sls_itm_grp_cd, changedRow.up_sls_itm_grp_cd());
			newLvl = parentDtlR.sls_itm_grp_lvl().add(1);
		}
		if (isSame(changedRow.sls_itm_grp_lvl(), newLvl)) {
			return;
		}
		changedRow.sls_itm_grp_lvl(newLvl);

		applySlsItmGrpLvlToChildren(changedRow);
	}
	protected void applySlsItmGrpLvlToChildren(DtlR parentR) {
		if (isNull(parentR.sls_itm_grp_cd())) {
			return;
		}

		MCNumber lvl = parentR.sls_itm_grp_lvl();
		MCList<DtlR> allDtlL = getDtlL();
		MCIndexKey allDtlUpIdx = allDtlL.createIndex(DtlR.$up_sls_itm_grp_cd);
		MCList<DtlR> childDtlL = allDtlL.subList(allDtlUpIdx, parentR.sls_itm_grp_cd());

		while (!childDtlL.isEmpty()) {
			lvl = lvl.add(1);
			MCList<DtlR> nextLvlL = MCList.create(DtlR.class);
			for (DtlR currentLvlR : childDtlL) {
				currentLvlR.sls_itm_grp_lvl(lvl);
				if (currentLvlR.isStatusNone()) {
					currentLvlR.setStatus(MCRow.MODIFY);
				}

				// さらに下位のリストを作成する
				// 新規行で販売品目体系CDが未入力のとき、下位の販売品目体系は存在しない
				if (!isNull(currentLvlR.sls_itm_grp_cd())) {
					MCList<DtlR> currentChildL = allDtlL.subList(allDtlUpIdx, currentLvlR.sls_itm_grp_cd());
					nextLvlL.addAll(currentChildL);
				}
			}
			childDtlL.setAll(nextLvlL);
		}
	}

	/**
	 * 無限ループかどうかを判定します。<p>
	 * 
	 * @param changeRow 変更対象の行
	 * @param newCd 変更対象の変更後コード
	 * @param newUpCd 変更対象の変更後上位コード
	 * @param changeList 変更対象のリスト
	 * @return 無限ループの場合はtrue。それ以外はfalse。
	 */
	protected boolean hasInfinitLoop(DtlR changeRow, String newCd, String newUpCd, MCList<DtlR> changeList) {

		// 同一レコードでのループ
		if (isSame(newCd, newUpCd)) {
			return true;
		}
		
		MCList<DtlR> l = changeList.shallowClone();
		l.remove(changeRow);

		HashSet<String> upCds = new HashSet<>();
		upCds.add(newCd);
		
		// 上位が引数newCdと一致する場合は無限ループとみなす
		MCIndexKey getUpCdKey = l.createIndex(DtlR.$sls_itm_grp_cd);
		DtlR up = l.getFirst(getUpCdKey, newUpCd);
		while(up != null) {
			String up_cd = up.up_sls_itm_grp_cd();
			if (isNull(up_cd)) {
				break;
			}
			
			if (upCds.contains(up_cd)) {
				return true;
			}
			
			upCds.add(up_cd);
			
			up = l.getFirst(getUpCdKey, up_cd);
		}
		return false;
	}

	@Override
	public boolean doDtl_up_sls_itm_grp_cd_VC(MCEventInfo info) {
		MCList<DtlR> l = getDtlL();
		DtlR r = l.get(info.getEventIndex());

		if (!isNull(info.getNewValue())) {
			// 無限ループは不可
			if (hasInfinitLoop(r, r.sls_itm_grp_cd(), (String)info.getNewValue(), l)) {
				return false;
			}
		}
		return super.doDtl_up_sls_itm_grp_cd_VC(info);
	}

}