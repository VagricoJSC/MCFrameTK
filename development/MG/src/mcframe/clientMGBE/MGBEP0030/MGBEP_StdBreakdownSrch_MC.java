package mcframe.clientMGBE.MGBEP0030;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5210.*;
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
import java.util.Set;
import java.util.Arrays;

import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMAUD.MAUDP0080.IfViewScale;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBEP_StdBreakdownSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBEP_StdBreakdownSrch_MC extends MGBEP_StdBreakdownSrch_MC_A implements IfHrrchyBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();

	/**費目構成比行index番号*/
	protected int _XPNS_RATE_ROW_INDEX = 0;
	/**合計行index番号*/
	protected int _SUM_ROW_INDEX = 1;
	/** 小数部有効桁のデフォルト値*/
	protected int _defAddDispDigit = 2;
	/** 全展開フラグ*/
	protected boolean _expandFlg = false;
	/** 検索条件キャッシュ*/
	protected CndR _cndR;
	/** 検索結果キャッシュ*/
	protected MCList<RsltR> _list;
	/** 集計対象のカラム名*/
	protected String[] _sumColNames;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBEP_StdBreakdownSrch_MC() {
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
	public MGBEP_StdBreakdownSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBEL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBEL0030_Srch01Caller<P extends MGBEP_StdBreakdownSrch, B extends MG_MGBEL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBEL0030_Srch01Caller(P p, B b) {
			super(p, b);
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

		@Override
		protected void show() {
			super.show();

			_cndR = getCndR().clone();

			setHiddenList();
			Rslt_hrrchy_p_PPanel.showCollapseAll(getRsltL());
			if (_expandFlg) {
				Rslt_hrrchy_p_PPanel.expandAll();
			}
			setAddDigit();
		}

		protected void setHiddenList() {
			clearHiddenList();
			for (RsltR r : getRsltL()) {
				if (r.getGUIIndex() == _XPNS_RATE_ROW_INDEX || r.getGUIIndex() == _SUM_ROW_INDEX) {
					r.bottom_flg(false);
					r.ext(false);
				}
				_list.add(r.clone());
			}
		}

		@Override
		protected void clear() {
			super.clear();

			clearHiddenList();
			Rslt_hrrchy_p_PPanel.screenClearBody();
		}

		protected void clearHiddenList() {
			_list = MCList.create(RsltR.class);
		}
	}


	/**
	 * Panel[LPnl]のボタン[redisplay]の押下時の処理
	 */
	@Override
	public void doLPnl_redisplay(MCEventInfo info) {
		setAddDigit();
		RsltTable.adjustWidth();
	}
	protected void setAddDigit() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();
		cc.setAddDigit(getLPnlR().add_disp_digit());
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		_expandFlg = false;
		callMG_MGBEL0030_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[srch_all]の押下時の処理
	 */
	@Override
	public void doRPnl_srch_all(MCEventInfo info) {
		_expandFlg = true;
		callMG_MGBEL0030_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBEP0020]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0020(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0020(r);
	}
	protected void doBtn_open_MGBEP0020(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0020");
		mcframe.clientMGBE.MGBEP0020.CndR to = mcframe.clientMGBE.MGBEP0020.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBEP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBEP0010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBEP0010(r);
	}
	protected void doBtn_open_MGBEP0010(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBEP0010");
		mcframe.clientMGBE.MGBEP0010.CndR to = mcframe.clientMGBE.MGBEP0010.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);

		Rslt_std_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_the_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initCCInfo();
	}

	/**
	 * カラム制御クラスの初期化
	 */
	protected void initCCInfo() {
		_cc.init(this, RsltTable);
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
	}

	/**
	 * 表示する費目項目を返します。<p>
	 * @return 表示する費目項目
	 */
	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);
		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		RsltTable.moveColumns(columnRslt_ext, columnRslt_hrrchy_str, columnRslt_bottom_flg);

		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();

		Color expnsSrchRsltColor = getExpnsSrchRsltColor(this);
		Color expnsGSubTtlColor = getExpnsGSubTtlColor(this);
		Color allTtlColor = getAllTtlColor(this);
		Color theoryColor = getTheoryColor(this);
		Color varFxdColor = getProfitColor(this);

		for (MCColumnConfig c : RsltTable.getColumnConfigs()) {
			if (c != columnRslt_ext) {
				cc.putColumnBG(c, expnsSrchRsltColor);
			}
		}
		for (MCColumnConfig c : _cc.getExpnsGColumnConfigs()) {
			cc.putColumnBG(c, expnsGSubTtlColor);
		}
		cc.putColumnBG(columnRslt_ttl, allTtlColor);
		cc.putColumnBG(columnRslt_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt_the_qty, theoryColor);
		cc.putColumnBG(columnRslt_the_upri, theoryColor);
		cc.putColumnBG(columnRslt_the_cost, theoryColor);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == RsltTable) {
			confSet.removeAll(Arrays.asList(RsltTable.getAllColumnConfigs()));
			confSet.addAll(Arrays.asList(RsltTable.getViewColumnConfigs()));
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);
		setValueEx(LPnl_add_disp_digit, MCNumber.valueOf(_defAddDispDigit));
		displayColumn();
	}

	// -----------------------------------------------
	// status
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
		setBtnMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		setBtnMode();
		RsltTable.selectLeftmostColumn(0);
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBEP0020, isEnableBtn_open_MGBEP0020(r));
		setBtnModeByFlg(Btn_open_MGBEP0010, isEnableBtn_open_MGBEP0010(r));
	}

	/**
	 * 標準品目工程原価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0020(RsltR r) {
		if (r == null || isNull(r.itm_cd())) {
			return false;
		}
		return true;
	}

	/**
	 * 標準単価一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBEP0010(RsltR r) {
		if (r == null || isNull(r.itm_cd())) {
			return false;
		}
		return true;
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doLPnl_disp_the_NC(MCEventInfo info) {
		super.doLPnl_disp_the_NC(info);
		displayTheColumn();
	}

	@Override
	public void doLPnl_add_disp_digit_LC(MCEventInfo info) {
		super.doLPnl_add_disp_digit_LC(info);

		MCNumber n = (MCNumber) info.getNewValue();
		if (isNull(n)) {
			LPnl_add_disp_digit.setValue(MCNumber.ZERO);
		}
	}

	@Override
	public boolean doLPnl_add_disp_digit_VC(MCEventInfo info) {
		MCNumber n = (MCNumber) info.getNewValue();
		if (!isDecPlace(n)) {
			return false;
		}
		return super.doLPnl_add_disp_digit_VC(info);
	}

	protected boolean isDecPlace(MCNumber n) {
		return MCNumber.ZERO.lte(n) && new MCNumber(8).gte(n);
	}

	// -----------------------------------------------
	// Display

	protected void displayColumn() {
		_cc.displayColumn();
		displayTheColumn();
	}

	protected void displayTheColumn() {
		for (MCColumnConfig cc : new MCColumnConfig[] { columnRslt_the_upri, columnRslt_the_qty,
				columnRslt_the_cost }) {
			setColModeByFlg(cc, getLPnlR().disp_the());
		}
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected Color _vTtlColor = getVTtlColor(this);

	protected class RsltCellConfig extends MGUDP_CellConfig {

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			if (isSame(index, _SUM_ROW_INDEX)) {
				return _vTtlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}

		protected int _add_digit = _defAddDispDigit;

		public void setAddDigit(MCNumber digit) {
			if (isNull(digit)) {
				_add_digit = 0;
			}
			else {
				_add_digit = digit.intValueExact();
			}
		}

		@Override
		public int getPriorViewScale(int index, MCColumnConfig column, MCTable<?> table) {
			int vs = super.getPriorViewScale(index, column, table);
			String type = getPriorViewScaleType(index, column, table);
			if (type != null) {
				if (isSame(index, _XPNS_RATE_ROW_INDEX)) {
					return super.getPriorViewScale(index, columnRslt_rate, table);
				}

				if (isSame(type, IfViewScale.STD)) {
					vs = vs + _add_digit;
				}
				else if (!isSame(type, IfViewScale.RATE)) {
					RsltR r = RsltTable.getRow(index);
					if (isNull(r.dec_place())) {
						vs = vs + _add_digit;
					}
					else {
						vs = r.dec_place().intValueExact() + _add_digit;
					}
				}
			}
			return vs;
		}

		@Override
		protected boolean isPercentColumn(int index, MCColumnConfig column,
				MCTable table) {
			//費目構成比行をパーセント表記する。
			if (index == _XPNS_RATE_ROW_INDEX || column == columnRslt_rate) {
				return true;
			}
			return false;
		}
	}

	// -----------------------------------------------
	// IfHrrchyBase
	@Override
	public void afterSetViewList() {
		recalc();
	}

	@Override
	public MCList<MCConstRow> hndlCollapseList(MCList<MCConstRow> rmL) {
		return null;
	}

	@Override
	public void hndlExpandList(MCList<MCConstRow> addL) {
	}

	@Override
	public boolean setHrrchyStr() {
		return false;
	}

	@Override
	public boolean setLeafStr() {
		return false;
	}

	// -----------------------------------------------
	// other(recalc)
	protected void recalc() {
		for (RsltR r : getRsltL()) {
			if (r.getGUIIndex() == _XPNS_RATE_ROW_INDEX) {
				continue;
			}
			recalcInit(r);
			if (r.ext()) {
				recalcMain(r, r.extno());
			}
		}
	}

	protected void recalcInit(RsltR row) {
		// rowを初期化（開いている状態）
		for (RsltR r : _list.subList(HrrchyR.$extno, row.extno())) {
			for (String cname : getSumColNames()) {
				row.setValueNE(cname, (MCNumber) r.getValueNE(cname));
			}
			row.ttl(r.ttl());
			calcUnitAndRate(row, getRsltL().get(_SUM_ROW_INDEX));
		}
	}

	protected void recalcMain(RsltR row, MCNumber extno) {
		// チェックが付いていたら子供を加算
		for (RsltR r : _list.subList(HrrchyR.$par_extno, extno)) {
			for (String cname : getSumColNames()) {
				row.setValueNE(
						cname,
						MCNumber.sum((MCNumber) row.getValueNE(cname),
								(MCNumber) r.getValueNE(cname)));
			}
			recalcMain(row, r.extno());
		}
		calcUnitAndRate(row, getRsltL().get(_SUM_ROW_INDEX));
	}

	protected void calcUnitAndRate(RsltR row, RsltR sumRow) {
		if (nvl(row.std_qty(), MCNumber.ZERO).isZero() == false) {
			row.std_upri(row.ttl().divide(row.std_qty(),
					16, MAC_RND_TYP.RNDOFF.toMC()));
		}
		else {
			row.std_upri(0);
		}
		if (isNull(row.the_cost())) {
			row.the_cost(0);
		}
		if (nvl(row.the_qty(), MCNumber.ZERO).isZero() == false) {
			row.the_upri(row.the_cost().divide(row.the_qty(),
					16, MAC_RND_TYP.RNDOFF.toMC()));
		}
		else {
			row.the_upri(0);
		}
		if (sumRow.ttl().isZero()) {
			row.rate(0);
		}
		else {
			row.rate(calcRate(sumRow.ttl(), row.ttl(), 16));
		}
	}

	protected String[] getSumColNames() {
		if (_sumColNames == null) {
			List<String> l = new ArrayList<String>();
			l.addAll(Arrays.asList(_cc.getViewColumns()));
			l.add(RsltR.$ttl);
			l.add(RsltR.$var_cost);
			l.add(RsltR.$fxd_cost);
			l.add(RsltR.$the_cost);
			_sumColNames = l.toArray(new String[]{});
		}
		return _sumColNames;
	}

}