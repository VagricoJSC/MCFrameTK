package mcframe.clientMABG.MABGP0060;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABGP_GrpCtgReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABGP_GrpCtgReg_MC extends MABGP_GrpCtgReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected static final String VH_KEY = "VH_KEY";
	protected static final String ELM = "ELM";
	protected String[] _elmCols;
	protected MCList<DtlR> _dtlL = MCList.create(DtlR.class);
	protected MCIndexKey _dtlKey;
	protected MCIndexKey _dtlPrioKey;
	protected Map<MCColumnConfig, String> _typMap = new HashMap<MCColumnConfig, String>();
	protected Map<List, DtlR> _dtlMap = new HashMap<List, DtlR>();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_GrpCtgReg_MC() {
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
	public MABGP_GrpCtgReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABGL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0060_Srch01Caller<P extends MABGP_GrpCtgReg, B extends MA_MABGL0060_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABGL0060_Srch01Caller(P p, B b) {
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
			_dtlKey = _dtlL.createIndex(DtlR.$calc_grp_cd, DtlR.$calc_ctg_typ, DtlR.$calc_ctg_cd);
			_dtlPrioKey = _dtlL.createIndex(DtlR.$calc_grp_cd, DtlR.$ctg_prio, DtlR.$calc_ctg_typ);
			getDtlL().clear();

			// 縦横変換
			convertVH();

			if (isUpdOpe()) {
				DispDtlTable.fillSpace();
			}
		}

		protected void convertVH() {
			MCList<DispDtlR> newL = MCList.create(DispDtlR.class);
			for (MCList<DtlR> l : _dtlL.groupList(DtlR.$calc_grp_cd, DtlR.$ctg_prio)) {
				DispDtlR newR = DispDtlR.create();
				newR.calc_grp_cd(l.get(0).calc_grp_cd());
				newR.calc_grp_nm(l.get(0).calc_grp_nm());
				newR.ctg_prio(l.get(0).ctg_prio());
				newR.del_flg(l.get(0).del_flg());
				newR.upd_cntr(l.get(0).upd_cntr());
				newL.add(newR);

				for (DtlR r : l) {
					String[] cols = getElmCols(r.calc_ctg_typ());
					if (cols != null) {
						newR.setString(cols[0], r.calc_ctg_cd());
						newR.setString(cols[1], r.calc_ctg_nm());

						List<Comparable<?>> key = new ArrayList<Comparable<?>>();
						key.add(newR.calc_grp_cd());
						key.add(newR.ctg_prio());
						key.add(r.calc_ctg_typ());
						_dtlMap.put(key, r);
					}
				}
			}
			getDispDtlL().setAll(newL);
		}
		protected String[] getElmCols(String calcCtgTyp) {
			MAC_CALC_CTG_TYP[] typs = MAC_CALC_CTG_TYP.array();
			for (int i = 0; i < typs.length; i++) {
				MAC_CALC_CTG_TYP typ = typs[i];
				if (isSame(typ.value(), calcCtgTyp)) {
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
	 * [MA_MABGL0060_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0060_Upd01Caller<P extends MABGP_GrpCtgReg, B extends MA_MABGL0060_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABGL0060_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			MCColumnConfig[] ccs = new MCColumnConfig[MAC_CALC_CTG_TYP.array().length];
			for (int i = 0; i < MAC_CALC_CTG_TYP.array().length; i++) {
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

			// 追加・更新レコードの作成
			MCList<DtlR> newL = MCList.create(DtlR.class);
			for (DispDtlR r : getDispDtlL().subList(getCheckColumn(), true)) {
				for (int i = 0; i < MAC_CALC_CTG_TYP.array().length; i++) {
					
					String clacCtgCd = r.getString(_elmCols[i*2]);
					MAC_CALC_CTG_TYP typ = MAC_CALC_CTG_TYP.array()[i];
					
					if (!isNull(clacCtgCd)) {
						DtlR dtlR;
						DtlR dtlPrioR;
						if (_dtlL.isEmpty()) {
							dtlR = null;
							dtlPrioR = null;
						}
						else {
							dtlR = _dtlL.getFirst(_dtlKey, r.calc_grp_cd(), typ.value(), clacCtgCd);
							dtlPrioR = _dtlL.getFirst(_dtlPrioKey, r.calc_grp_cd(), r.ctg_prio(), typ.value());
						}
						if (dtlR == null) {
							DtlR newR = DtlR.create();
							newR.setStatus(MCRow.CREATE);
							newR.check(true);
							newR.del_flg(r.del_flg());
							newR.calc_grp_cd(r.calc_grp_cd());
							newR.ctg_prio(r.ctg_prio());
							newR.calc_ctg_typ(typ.value());
							newR.calc_ctg_cd(clacCtgCd);
							newL.add(newR);
							if (dtlPrioR != null) {
								DtlR r2 = newL.getFirst(new String[] {
										DtlR.$calc_grp_cd, DtlR.$calc_ctg_typ,
										DtlR.$calc_ctg_cd
								}, new String[] {
										dtlPrioR.calc_grp_cd(), dtlPrioR.calc_ctg_typ(),
										dtlPrioR.calc_ctg_cd()
								});
								if (null == r2) {
									DtlR delR = dtlPrioR.clone();
									delR.setStatus(MCRow.DELETE);
									delR.check(true);
									newL.add(delR);
								}
							}
						}
						else {
							DtlR newR = dtlR.clone();
							newR.setStatus(MCRow.MODIFY);
							newR.check(true);
							newR.del_flg(r.del_flg());
							newR.ctg_prio(r.ctg_prio());
							DtlR r2 = newL.getFirst(new String[] {
									DtlR.$calc_grp_cd, DtlR.$calc_ctg_typ,
									DtlR.$calc_ctg_cd
							}, new String[] {
									newR.calc_grp_cd(), newR.calc_ctg_typ(),
									newR.calc_ctg_cd()
							});
							if (null != r2 && r2.isStatusDelete()) {
								newL.remove(r2);
							}
							if (!isNull(dtlPrioR) && !isSame(newR.calc_ctg_cd(), dtlPrioR.calc_ctg_cd())) {
								r2 = newL.getFirst(new String[] {
										DtlR.$calc_grp_cd, DtlR.$calc_ctg_typ,
										DtlR.$calc_ctg_cd
								}, new String[] {
										dtlPrioR.calc_grp_cd(), dtlPrioR.calc_ctg_typ(),
										dtlPrioR.calc_ctg_cd()
								});
								if (null == r2) {
									DtlR delR = dtlPrioR.clone();
									delR.setStatus(MCRow.DELETE);
									delR.check(true);
									newL.add(delR);
								}
							}
							newL.add(newR);
						}
					}
				}
			}

			// 削除レコードの作成
			MCList<DtlR> delL = MCList.create(DtlR.class);
			
			if (!_dtlL.isEmpty()) {
				MCIndexKey idxkey = newL.createIndex(DtlR.$calc_grp_cd, DtlR.$calc_ctg_typ, DtlR.$calc_ctg_cd);
				for (DispDtlR r : getDispDtlL().subList(getCheckColumn(), true)) {
					for (int i = 0; i < MAC_CALC_CTG_TYP.array().length; i++) {
						
						String clacCtgCd = r.getString(_elmCols[i*2]);
						MAC_CALC_CTG_TYP typ = MAC_CALC_CTG_TYP.array()[i];
	
						if (isNull(clacCtgCd)) {
							// 検索してきたレコードがあれば削除候補
							DtlR dtlR = _dtlL.getFirst(_dtlPrioKey, r.calc_grp_cd(), r.ctg_prio(), typ.value());
							if (dtlR != null) {
								// 削除候補が更新対象に存在しなければ削除対象
								DtlR r2 = newL.getFirst(idxkey, dtlR.calc_grp_cd(), dtlR.calc_ctg_typ(), dtlR.calc_ctg_cd());
								if (null == r2) {
									DtlR delR = dtlR.clone();
									delR.setStatus(MCRow.DELETE);
									delR.check(true);
									delL.add(delR);
								}
								else {
									DtlR r3 = _dtlL.getFirst(_dtlPrioKey, r2.calc_grp_cd(), r2.ctg_prio(), typ.value());
									if (null != r3 && null == newL.getFirst(idxkey, r3.calc_grp_cd(), r3.calc_ctg_typ(), r3.calc_ctg_cd())) {
										DtlR delR = r3.clone();
										delR.setStatus(MCRow.DELETE);
										delR.check(true);
										delL.add(delR);
									}
								}
							}
						}
					}
				}
			}

			getDtlL().setAll(newL);
			getDtlL().addAll(delL);
			resetGUIIndex();
			return super.checkForCall();
		}
	}
	protected void resetGUIIndex() {
		MCIndexKey idxkey = getDispDtlL().createIndex(DtlR.$calc_grp_cd, DtlR.$ctg_prio);
		for(DtlR r : getDtlL()) {
			DispDtlR tmpR = getDispDtlL().getFirst(idxkey, r.calc_grp_cd(), r.ctg_prio());
			if (tmpR != null) {
				r.setGUIIndex(tmpR.getGUIIndex());
			}
			else {
				r.setGUIIndex(-1);
			}
		}
	}
	/**
	 * [MA_MABGL0060_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0060_Del01Caller<P extends MABGP_GrpCtgReg, B extends MA_MABGL0060_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABGL0060_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkForCall() {
			MCList<DtlR> newL = MCList.create(DtlR.class);
			MCIndexKey idxkey = _dtlL.createIndex(DtlR.$calc_grp_cd, DtlR.$ctg_prio);
			for (DispDtlR r : getDispDtlL().subList(getCheckColumn(), true)) {
				for (DtlR newR : _dtlL.subList(idxkey, r.calc_grp_cd(), r.ctg_prio())) {
					newR.setStatus(MCRow.DELETE);
					newR.check(true);
					newL.add(newR);
				}
			}
			getDtlL().setAll(newL);
			resetGUIIndex();

			return super.checkForCall();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABGL0060_Srch01();
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
		DispDtlR r = copyRow(DispDtlTable);
		if (r != null) {
			r.calc_grp_cd(null);
			r.calc_grp_nm(null);
			r.ctg_prio(null);
		}
	}
	/**
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABGL0060_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABGL0060_Del01();
	}

	@Override
	public void setSortColumn() {
		DispDtlTable.addSortColumn(columnDispDtl_calc_grp_cd);
		DispDtlTable.addSortColumn(columnDispDtl_ctg_prio);
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
		MAC_CALC_CTG_TYP[] typs = MAC_CALC_CTG_TYP.array();
		for (int i = 0; i < typs.length; i++) {
			MAC_CALC_CTG_TYP typ = typs[i];
			MCColumnGroup cg = DispDtlTable.getAllColumnGroups()[i];
			cg.setHeaderName(typ.name(mcframe.clientCore.sys.MCSys.user.locale()));

			_typMap.put(getColumnConfig(_elmCols[i*2]), typ.value());
		}
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		MCBeansReader br = createAppBeansReader();
		DispDtlTable.setBeansReader(br);
	}

	protected MCBeansReader createAppBeansReader() {
		return new AppBeansReader();
	}
	
	public class AppBeansReader extends MCBeansReader {

		public AppBeansReader() {
			super();
		}

		@Override
		protected void init() {
			super.init();
			_dtlL.clear();
		}
	}

	/**
	 * ステータスによってステータスカラムの表示・非表示を制御する
	 */
	@Override
	protected void setStatusColumnVisibleByStatus() {
		super.setStatusColumnVisibleByStatus();

		if (isUpdOpe()) {
			DispDtlTable.setStatusColumnVisible(true);
		}
		else if (isDelOpe() || isRefOpe()) {
			DispDtlTable.setStatusColumnVisible(false);
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
		_dtlL.clear();
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

			if (column == columnDispDtl_calc_grp_cd || column == columnDispDtl_ctg_prio) {
				if (!isNull(row.upd_cntr())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDispDtl_ctg_prio) {
				if (isNull(row.calc_grp_cd())) {
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
		for (int i = MAC_CALC_CTG_TYP.array().length * 2; i < _elmCols.length ; i++) {
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

	@Override
	public void doDispDtl_calc_grp_cd_LC(MCEventInfo info) {
		super.doDispDtl_calc_grp_cd_LC(info);

		int i = info.getEventIndex();
		DispDtlR r = getDispDtlL().get(i);

		setValueEx(columnDispDtl_ctg_prio, i, null);

		if (isNull(r.calc_grp_cd())) {
			return ;
		}
		for (DispDtlR row : getDispDtlL().subList(DispDtlR.$calc_grp_cd, r.calc_grp_cd())) {
			if (isSame(row.getGUIIndex(), i)) {
				continue;
			}
			for (String c : _elmCols) {
				if (isSame(row.getString(c), r.getString(c))) {
					r.setString(c, null);
				}
			}
		}
	}

	@Override
	public boolean doDispDtl_ctg_prio_VC(MCEventInfo info) {
		int i = info.getEventIndex();
		DispDtlR r = getDispDtlL().get(i);
		MCNumber n = (MCNumber)info.getNewValue();

		for (DispDtlR row : getDispDtlL().subList(DispDtlR.$calc_grp_cd, r.calc_grp_cd())) {
			if (!isSame(row.getGUIIndex(), i) && isSame(row.ctg_prio(), n)) {
				return false;
			}
		}
		return super.doDispDtl_ctg_prio_VC(info);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc instanceof MCColumnConfig) {
			MCColumnConfig c = (MCColumnConfig)lc;
			if (isElmCol(c.getBaseRowColumnName())) {
				doDispDtl_calc_ctg_cd_LC((MCColumnConfig)lc, info);
			}
		}
	}
	protected boolean isElmCol(String col) {
		for (String c : _elmCols) {
			if (isSame(c, col)) {
				return true ;
			}
		}
		return false ;
	}
	protected void doDispDtl_calc_ctg_cd_LC(MCColumnConfig c, MCEventInfo info) {
		int i = info.getEventIndex();
		DispDtlR r = getDispDtlL().get(i);
		String calcCtgCd = r.getString(c.getBaseRowColumnName());

		if (isNull(calcCtgCd)) {
			return ;
		}

		for (DispDtlR row : getDispDtlL().subList(DispDtlR.$calc_grp_cd, r.calc_grp_cd())) {
			if (!isSame(row.getGUIIndex(), i) && isSame(row.getString(c.getBaseRowColumnName()), calcCtgCd)) {
				setValueEx(c, row.getGUIIndex(), null);
			}
		}
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
					.toArray(size -> new String[size]);
		}
		return new String[0];
	}

}