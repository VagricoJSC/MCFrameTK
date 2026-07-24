package mcframe.clientMABC.MABCP1510;

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

import mcframe.clientFXBA.FXBAP0130.*;

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
import java.util.stream.Collectors;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_IfCdRuleReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_IfCdRuleReg_MC extends MABCP_IfCdRuleReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static final String VH_KEY = "VH_KEY";
	protected static final String ELM = "ELM";
	protected String[] _elmCols;
	protected MCList<DtlR> _dtlL = MCList.create(DtlR.class);
	protected MCIndexKey _dtlKey;
	protected Map<MCColumnConfig, String> _typMap = new HashMap<MCColumnConfig, String>();
	protected Map<List, DtlR> _dtlMap = new HashMap<List, DtlR>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_IfCdRuleReg_MC() {
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
	public MABCP_IfCdRuleReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL1510_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1510_Srch01Caller<P extends MABCP_IfCdRuleReg, B extends MA_MABCL1510_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL1510_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getDispDtlL());
		}

		@Override
		protected void clear() {
			super.clear();
			getDtlL().clear();
			_dtlMap = new HashMap<List, DtlR>();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			DispDtlTable.selectLeftmostColumn(0);
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void show() {
			super.show();

			_dtlL.setAll(getDtlL());
			_dtlKey = _dtlL.createIndex(DtlR.$ext_sys_cd, DtlR.$bp_cd, DtlR.$if_col_typ);
			getDtlL().clear();

			// 縦横変換
			convertVH();

			if (isUpdOpe()) {
				DispDtlTable.fillSpace();
			}
		}

		protected void convertVH() {
			MCList<DispDtlR> newL = MCList.create(DispDtlR.class);
			for (MCList<DtlR> l : _dtlL.groupList(DtlR.$ext_sys_cd, DtlR.$bp_cd)) {
				DispDtlR newR = DispDtlR.create();
				newR.ext_sys_cd(l.get(0).ext_sys_cd());
				newR.ext_sys_nm(l.get(0).ext_sys_nm());
				newR.bp_cd(l.get(0).bp_cd());
				newR.bp_nm(l.get(0).bp_nm());
				newR.del_flg(l.get(0).del_flg());
				newR.upd_cntr(l.get(0).upd_cntr());
				newL.add(newR);

				for (DtlR r : l) {
					String[] cols = getElmCols(r.if_col_typ());
					if (cols != null) {
						newR.setString(cols[0], r.col_conv_typ());
						newR.setString(cols[1], r.col_conv_typ_nm());

						List<String> key = new ArrayList<String>();
						key.add(newR.ext_sys_cd());
						key.add(newR.bp_cd());
						key.add(r.if_col_typ());
						_dtlMap.put(key, r);
					}
				}
			}
			getDispDtlL().setAll(newL);
		}
		protected String[] getElmCols(String ifColTyp) {
			MAC_IF_COL_TYP[] typs = MAC_IF_COL_TYP.array();
			for (int i = 0; i < typs.length; i++) {
				MAC_IF_COL_TYP typ = typs[i];
				if (isSame(typ.value(), ifColTyp)) {
					String[] ret = new String[2];
					ret[0] = _elmCols[i*2];
					ret[1] = _elmCols[i*2+1];
					return ret;
				}
			}
			return null;
		}
	}

	/**
	 * [MA_MABCL1510_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1510_Upd01Caller<P extends MABCP_IfCdRuleReg, B extends MA_MABCL1510_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL1510_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			// リストをクローンしてBP_CDがnullならNULL文字に置き換えて重複チェック
			MCList<DispDtlR> l = exceptEmpty(DispDtlTable.getList()).clone();
			for (DispDtlR r : l) {
				if (isNull(r.bp_cd())) {
					r.bp_cd(MAC_STR.NULL_VAL.value());
				}
			}
			panel.checkDuplicate(msgList, l, DispDtlTable, new String[] {DispDtlR.$ext_sys_cd, DispDtlR.$bp_cd});
			// メッセージのCauseRowにセットされたクローンのRowを元のRowに置き換える
			for (MCMessage m : msgList) {
				if (isSame(m.getID(), FXUCC0031)) {
					if (!isNull(m.getCauseRow())) {
						int i = m.getCauseRow().getGUIIndex();
						String col = m.getCauseColumn();
						m.setCauseRow(DispDtlTable.getList().get(i), col);
					}
				}
			}

			MCColumnConfig[] ccs = new MCColumnConfig[MAC_IF_COL_TYP.array().length];
			for (int i = 0; i < MAC_IF_COL_TYP.array().length; i++) {
				ccs[i] = getColumnConfig(_elmCols[i*2]);
			}

			for (DispDtlR r : getDispDtlL()) {
				if (r.check()) {
					msgList.addAll(checkAtLeastOneInput(r.getGUIIndex(), ccs));
				}
			}
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);

			msgList.addAll(panel.checkReq(getDispDtlL().subList(getCheckColumn(), true)));
		}

		@Override
		protected boolean checkForCall() {
			MCList<DtlR> newL = MCList.create(DtlR.class);
			for (DispDtlR r : getDispDtlL().subList(getCheckColumn(), true)) {
				for (int i = 0; i < MAC_IF_COL_TYP.array().length; i++) {
					String colConvTyp = r.getString(_elmCols[i*2]);
					if (!isNull(colConvTyp)) {
						MAC_IF_COL_TYP typ = MAC_IF_COL_TYP.array()[i];
						DtlR dtlR = null;
						if (!isNull(r.upd_cntr()) && !_dtlL.isEmpty()) {
							dtlR = _dtlL.getFirst(_dtlKey, r.ext_sys_cd(), r.bp_cd(), typ.value());
						}
						if (dtlR == null) {
							DtlR newR = DtlR.create();
							newR.setStatus(MCRow.CREATE);
							newR.check(true);
							newR.del_flg(r.del_flg());
							newR.ext_sys_cd(r.ext_sys_cd());
							newR.bp_cd(r.bp_cd());
							newR.if_col_typ(typ.value());
							newR.col_conv_typ(colConvTyp);
							newL.add(newR);
						}
						else {
							dtlR.setStatus(MCRow.MODIFY);
							dtlR.check(true);
							dtlR.del_flg(r.del_flg());
							dtlR.col_conv_typ(colConvTyp);
							newL.add(dtlR);
						}
					}
				}
			}
			getDtlL().setAll(newL);

			return super.checkForCall();
		}
	}

	/**
	 * [MA_MABCL1510_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1510_Del01Caller<P extends MABCP_IfCdRuleReg, B extends MA_MABCL1510_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL1510_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkForCall() {
			MCList<DtlR> newL = MCList.create(DtlR.class);
			MCIndexKey idxkey = _dtlL.createIndex(DtlR.$ext_sys_cd, DtlR.$bp_cd);
			for (DispDtlR r : getDispDtlL().subList(getCheckColumn(), true)) {
				for (DtlR newR : _dtlL.subList(idxkey, r.ext_sys_cd(), r.bp_cd())) {
					newR.setStatus(MCRow.DELETE);
					newR.check(true);
					newL.add(newR);
				}
			}
			getDtlL().setAll(newL);

			return super.checkForCall();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL1510_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DispDtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DispDtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DispDtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DispDtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DispDtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABCL1510_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABCL1510_Del01();
	}

	@Override
	public void setSortColumn() {
		DispDtlTable.addSortColumn(columnDispDtl_ext_sys_cd);
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		DtlTable.setMode(MCMode.INVISIBLE);
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		// Rowコンテナの値の変更を検知するためRowListnerをセットする
		setListListener(DispDtlTable, createRLRowListener());
	}

	@Override
	protected void listInit() {
		super.listInit();

		_elmCols = getExtCols(DispDtlR.create(), VH_KEY, ELM);

		// カラムグループ名の設定
		MAC_IF_COL_TYP[] typs = MAC_IF_COL_TYP.array();
		for (int i = 0; i < typs.length; i++) {
			MAC_IF_COL_TYP typ = typs[i];
			MCColumnGroup cg = DispDtlTable.getAllColumnGroups()[i];
			cg.setHeaderName(typ.name(mcframe.clientCore.sys.MCSys.user.locale()));

			_typMap.put(getColumnConfig(_elmCols[i*2]), typ.value());
		}
	}

	@Override
	public void doDispDtl_NC(MCEventInfo info) {
		super.doDispDtl_NC(info);

		int idx = info.getEventIndex();
		if (idx >= 0) {
			setRDelBtnMode(getDispDtlL().get(idx));
		}
	}

	/**
	 * 登録・訂正モードかつ新規行のみ行削除可能
	 */
	protected void setRDelBtnMode(DispDtlR r) {
		if (isUpdOpe() && r != null && isNull(r.upd_cntr())) {
			setDefaultMode(DtlBtn_rdel);
		}
		else {
			DtlBtn_rdel.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setUnusedElmColumnModeInvisible();
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setUnusedElmColumnModeInvisible();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setUnusedElmColumnModeInvisible();
	}
	
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setUnusedElmColumnModeInvisible();
	}

	@Override
	public void fillSpace() {
		DispDtlTable.fillSpace();
	}

	@Override
	protected void clearAll() {
		super.clearAll();
		getDispDtlL().clear();
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_IF_CD_RULE));
	}

	// CellConfig 
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DispDtlTable.setCellConfig(createDispDtlConf());
	}
	
	protected MCCellConfig createDispDtlConf() {
		return new DispDtlConf(this);
	}
	
	public class DispDtlConf extends MAUDP_RLBaseCellConfig {

		public DispDtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DispDtlR row = (DispDtlR) table.getBaseTable().getRow(index);

			if (getStatus() == UPD && !isNull(row.upd_cntr())) {
				List<String> key = new ArrayList<String>();
				key.add(row.ext_sys_cd());
				key.add(row.bp_cd());
				key.add(_typMap.get(column));
				if (_dtlMap.containsKey(key)) {
					return MCMode.REQUIRED;
				}
			}
			if (column == columnDispDtl_ext_sys_cd || column == columnDispDtl_bp_cd) {
				if (!isNull(row.upd_cntr())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	/**
	 * 使用しないカラムを非表示
	 */
	protected void setUnusedElmColumnModeInvisible() {
		for (int i = MAC_IF_COL_TYP.array().length * 2; i < _elmCols.length ; i++) {
			getColumnConfig(_elmCols[i]).setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * カラム名からＩＦ項目区分の何番目の区分かを返す
	 */
	protected int getTypIdx(String colNm) {
		for (int i = 0; i < _elmCols.length; i++) {
			String col = _elmCols[i];
			if (colNm.endsWith(col)) {
				return i/2;
			}
		}
		return -1;
	}
	
	// 以下はVHMapperからコピー ///////////////////////////////////////////////
	
	protected MCColumnConfig getColumnConfig(String baseRowColumnName) {
		for (MCColumnConfig column : DispDtlTable.getColumnConfigs()) {
			if (baseRowColumnName.equals(column.getBaseRowColumnName())) {
				return column;
			}
		}
		return null;
	}
	protected String[] getExtCols(MCConstRow row, String grp, String val) {
		if (row.getExtGroups().contains(grp)) {
			Map<String, String> map = row.getExtMap(grp);
			return row.getKeys(grp).stream().filter(k -> val.equals(map.get(k)))
					.collect(Collectors.toList()).toArray(new String[0]);
		}
		return new String[0];
	}

}