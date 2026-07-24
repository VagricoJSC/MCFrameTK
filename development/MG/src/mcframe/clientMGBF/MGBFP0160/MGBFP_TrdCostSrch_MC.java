package mcframe.clientMGBF.MGBFP0160;

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

import mcframe.clientFSBA.FSBAP0020.*;
import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMGUB.MGUBP0010.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFSBA.FSBAP0000.IfSyncTableBase;
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_TrdCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_TrdCostSrch_MC extends MGBFP_TrdCostSrch_MC_A implements IfSyncTableBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _ccRslt = new MGUCP_CCtrl<>();

	protected MGUCP_CCtrl<OutDtlR> _ccOutDtl = new MGUCP_CCtrl<>();

	protected MGUCP_CCtrl<OutDtlR> _ccInDtl = new MGUCP_CCtrl<>();

	/** 合計行の色 */
	protected Color _ttlColor = getVTtlColor(this);

	/** 出庫情報のキャッシュ */
	protected MCList<OutDtlR> _cacheOutDtl = MCList.create(OutDtlR.class);

	/** 入庫情報のキャッシュ */
	protected MCList<OutDtlR> _cacheInDtl = MCList.create(OutDtlR.class);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_TrdCostSrch_MC() {
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
	public MGBFP_TrdCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0160_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0160_Srch01Caller<P extends MGBFP_TrdCostSrch, B extends MG_MGBFL0160_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0160_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void clear() {
			super.clear();

			OutDtlTable.clear();
			InDtlTable.clear();

			_cacheOutDtl.clear();
			_cacheInDtl.clear();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
	}

	/**
	 * [MG_MGBFL0160_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0160_Srch02Caller<P extends MGBFP_TrdCostSrch, B extends MG_MGBFL0160_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0160_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		public void setupParam() {
			super.setupParam();

			bridge.up0().clear();
			bridge.up0().add(RsltTable.getSelectedMCRow());
		}

		@Override
		protected void showNoDownDataMsg() {
			// 何もしない
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			setCache();
		}

		/**
		 * キャッシュに下り電文（合計行含む）を格納します。
		 */
		protected void setCache() {
			_cacheOutDtl.addAll(bridge.down0());
			_cacheInDtl.addAll(bridge.down1());
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0160_Srch01();
	}

	// ------------------------------------------------
	// イベント
	// ------------------------------------------------

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		OutDtlTable.clear();
		InDtlTable.clear();

		if (!isNull(RsltTable.getSelectedMCRow())
				&& !isSame(info.getEventIndex(), getRsltL().size() - 1)) {
			RsltR row = RsltTable.getSelectedMCRow();

			if (isAllExistCacheOutDtl(row) || row.srched_flg()) {
				dispOutDtl();
			}

			if (isAllExistCacheInDtl(row) || row.srched_flg()) {
				dispInDtl();
			}

			if (!row.srched_flg()) {
				callMG_MGBFL0160_Srch02();
				row.srched_flg(true);
			}
		}
	}

	// ------------------------------------------------
	// キャッシュ
	// ------------------------------------------------

	/**
	 * 引数の行の年月、振替Ｇ、計算グループＣＤ、原価計算ＮＯを保持する<br>
	 * レコードが出庫情報キャッシュにすべて存在するかチェックする<br>
	 * @return true：存在する / false：存在しない
	 */
	protected boolean isAllExistCacheOutDtl(RsltR selectedRow) {
		MCIndexKey idk = _cacheOutDtl.createIndex(OutDtlR.$ym, OutDtlR.$trd_grp,
				OutDtlR.$calc_grp_cd, OutDtlR.$calc_no);

		if (!isExistCacheOutDtl(idk, selectedRow.ym(), selectedRow.trd_grp(),
				selectedRow.calc_grp_cd(), selectedRow.calc_no())) {
			return false;
		}

		return true;
	}

	/**
	 * 引数の行の年月、振替Ｇ、計算グループＣＤ、原価計算ＮＯを保持する<br>
	 * レコードが入庫情報キャッシュにすべて存在するかチェックする<br>
	 * @return true：存在する / false：存在しない
	 */
	protected boolean isAllExistCacheInDtl(RsltR selectedRow) {
		MCIndexKey idk = _cacheInDtl.createIndex(OutDtlR.$ym, OutDtlR.$trd_grp,
				OutDtlR.$calc_grp_cd, OutDtlR.$calc_no);

		if (!isExistCacheInDtl(idk, selectedRow.ym(), selectedRow.trd_grp(),
				selectedRow.calc_grp_cd(), selectedRow.calc_no())) {
			return false;
		}

		return true;
	}

	/**
	 * 出庫情報キャッシュに引数の年月、振替Ｇ、計算グループＣＤ、原価計算ＮＯを<br>
	 * 保持するレコードが存在するかチェックする<br>
	 * @return true：存在する / false：存在しない
	 */
	protected boolean isExistCacheOutDtl(MCIndexKey idk, MCDate ym, String trdGrp,
			String calcGrpCd, String calcNo) {
		OutDtlR outDtlR = _cacheOutDtl.getFirst(idk, ym, trdGrp, calcGrpCd, calcNo);

		if (isNull(outDtlR)) {
			return false;
		}
		else {
			return true;
		}
	}

	/**
	 * 入庫情報キャッシュに引数の年月、振替Ｇ、計算グループＣＤ、原価計算ＮＯを<br>
	 * 保持するレコードが存在するかチェックする<br>
	 * @return true：存在する / false：存在しない
	 */
	protected boolean isExistCacheInDtl(MCIndexKey idk, MCDate ym, String trdGrp,
			String calcGrpCd, String calcNo) {
		OutDtlR inDtlR = _cacheInDtl.getFirst(idk, ym, trdGrp, calcGrpCd, calcNo);

		if (isNull(inDtlR)) {
			return false;
		}
		else {
			return true;
		}
	}

	/**
	 * RsltTable で選択している行に対応するレコードを OutDtlTable に表示する
	 */
	protected void dispOutDtl() {
		getOutDtlL().clear();

		MCIndexKey idk = _cacheOutDtl.createIndex(OutDtlR.$ym, OutDtlR.$trd_grp,
				OutDtlR.$calc_grp_cd, OutDtlR.$calc_no);
		RsltR row = RsltTable.getSelectedMCRow();

		getOutDtlL().addAll(_cacheOutDtl.subList(idk, row.ym(), row.trd_grp(),
				row.calc_grp_cd(), row.calc_no()));

		sort(OutDtlTable);
		OutDtlTable.adjustWidth();
	}

	/**
	 * RsltTable で選択している行に対応するレコードを InDtlTable に表示する
	 */
	protected void dispInDtl() {
		getInDtlL().clear();

		MCIndexKey idk = _cacheInDtl.createIndex(OutDtlR.$ym, OutDtlR.$trd_grp,
				OutDtlR.$calc_grp_cd, OutDtlR.$calc_no);
		RsltR row = RsltTable.getSelectedMCRow();

		getInDtlL().addAll(_cacheInDtl.subList(idk, row.ym(), row.trd_grp(),
				row.calc_grp_cd(), row.calc_no()));

		sort(InDtlTable);
		InDtlTable.adjustWidth();
	}

	// ------------------------------------------------
	// ステータスの設定
	// ------------------------------------------------

	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		RsltTable.selectLeftmostColumn(0);
	}

	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		changeColumnMode(OutDtlTable, getCndR(), OutDtlR.$$SHOW);
		changeColumnMode(InDtlTable, getCndR(), OutDtlR.$$SHOW);
		_ccRslt.displayColumn();
		_ccOutDtl.displayColumn();
		_ccInDtl.displayColumn();
	}

	// ------------------------------------------------
	// 値の設定
	// ------------------------------------------------

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);
		displayColumn();
	}

	// ------------------------------------------------
	// 画面の初期化
	// ------------------------------------------------

	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initCCInfo();
	}

	/**
	 * カラム制御クラスの初期化
	 */
	protected void initCCInfo() {
		_ccRslt.init(this, RsltTable);
		_ccOutDtl.init(this, OutDtlTable);
		_ccInDtl.init(this, InDtlTable);
		_ccRslt.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
		_ccOutDtl.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
		_ccInDtl.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
	}

	/**
	 * 表示する費目項目を返します。<p>
	 * @return 表示する費目項目
	 */
	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);
		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ())
					|| MAC_EXPNS_TYP.isSPPL(r.expns_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		return sortWithoutBottom(table, policy);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
		OutDtlTable.addHSyncTables(InDtlTable);
	}

	protected void setColorInfo() {
		MGUDP_CellConfig ccr = (MGUDP_CellConfig) RsltTable.getCellConfig();
		MGUDP_CellConfig ccod = (MGUDP_CellConfig) OutDtlTable.getCellConfig();
		MGUDP_CellConfig ccid = (MGUDP_CellConfig) InDtlTable.getCellConfig();

		Color rslt = getExpnsSrchRsltColor(this);
		for (MCColumnConfig c : RsltTable.getColumnConfigs()) {
			ccr.putColumnBG(c, rslt);
		}
		ccr.putColumnBG(_ccRslt.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));
		ccr.putColumnBG(columnRslt_ttl, getAllTtlColor(this));

		for (MCColumnConfig c : OutDtlTable.getColumnConfigs()) {
			ccod.putColumnBG(c, rslt);
		}
		ccod.putColumnBG(_ccOutDtl.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));
		ccod.putColumnBG(columnOutDtl_ttl, getAllTtlColor(this));

		for (MCColumnConfig c : InDtlTable.getColumnConfigs()) {
			ccid.putColumnBG(c, rslt);
		}
		ccid.putColumnBG(_ccInDtl.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));
		ccid.putColumnBG(columnInDtl_ttl, getAllTtlColor(this));
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		OutDtl_qty_p_PPanel.setRelateBeans(columnOutDtl_unit_cd, columnOutDtl_dec_place);
		InDtl_qty_p_PPanel.setRelateBeans(columnInDtl_unit_cd, columnInDtl_dec_place);
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();

		if (!isNull(_cacheOutDtl)) {
			_cacheOutDtl.clear();
		}

		if (!isNull(_cacheInDtl)) {
			_cacheInDtl.clear();
		}
	}

	// ------------------------------------------------
	// セルコンフィグ
	// ------------------------------------------------

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
		OutDtlTable.setCellConfig(createOutDtlCellConfig());
		InDtlTable.setCellConfig(createInDtlCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected OutDtlCellConfig createOutDtlCellConfig() {
		return new OutDtlCellConfig();
	}

	protected InDtlCellConfig createInDtlCellConfig() {
		return new InDtlCellConfig();
	}

	protected class RsltCellConfig extends MGUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (getRsltL().size() == index + 1) {
				return _ttlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

	protected class OutDtlCellConfig extends MGUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (getOutDtlL().size() == index + 1) {
				return _ttlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

	protected class InDtlCellConfig extends MGUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (getInDtlL().size() == index + 1) {
				return _ttlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

	// ------------------------------------------------
	// インタフェース（IfSyncTableBase）
	// ------------------------------------------------

	@Override
	public MCTable<?> getHSyncMainTable(MCRootPanel panel) {
		return OutDtlTable;
	}

}