package mcframe.clientMGBD.MGBDP0110;

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
import mcframe.clientMAUB.MAUBP0100.*;
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
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

import mcframe.clientMGUC.MGUCP0040.MGUCP_VHConverter;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_ExpOperSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_ExpOperSrch_MC extends MGBDP_ExpOperSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 可変カラム名称(col_xx)の桁数 */
	protected int _SCALE = 2;
	/** 可変カラムの数 */
	protected int _DTL_COL_NUM = 0;
	/** 可変カラムの開始位置 */
	protected int _DTL_COL_S = 0;
	/** 縦横変換ユーティリティ */
	protected MGUCP_VHConverter<RsltR, DispRsltR> _vh = new MGUCP_VHConverter<RsltR, DispRsltR>();
	/** 検索時の検索条件（画面遷移用に検索時点の条件を保持） */
	protected CndR _cndR = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_ExpOperSrch_MC() {
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
	public MGBDP_ExpOperSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0110_Srch01Caller<P extends MGBDP_ExpOperSrch, B extends MG_MGBDL0110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0110_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			addDownContainer(getDispRsltL());
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

			_vh.setInvisibleColumnAll();
			_vh.initColInfo(_SCALE, 0, null, _DTL_COL_S, _DTL_COL_NUM);
		}

		@Override
		protected void showReplaceSub() {
			_cndR = getCndR().clone();

			// 項目情報設定
			_vh.initColGroup(DispRsltTable, getRsltL());
			// 年月情報(横展開のキー)を作成
			MCList<RsltR> ymList = _vh.createElmListForYM(getHdrR().st_ym(), getHdrR().end_ym());
			// カラム情報作成
			_vh.initColInfo(_SCALE, ymList.size() * 2, ymList, _DTL_COL_S, _DTL_COL_NUM);
			setHeaderLabel(ymList);
			_vh.setReadOnlyStatus();
			// 縦横変換
			_vh.createHList(getRsltL());
			_vh.calcElmColTtlAll(DispRsltR.$base_ttl);

			setOperUnitQty();
		}

		protected void setOperUnitQty() {
			getDispRsltL().sort(DispRsltTable.getDefaultSortPolicy());

			DispRsltR tmp = null;
			String[] keys = DispRsltR.create().getKeys(DispRsltR.$$CLEAR)
					.toArray(new String[0]);
			for (DispRsltR r : getDispRsltL()) {
				// キー項目表示用設定
				if (isNull(tmp) || !tmp.equalColumns(r, keys)) {
					r.top_flg(true);
				}
				else {
					r.top_flg(false);
				}
				tmp = r;

				// 工程単位数量計算
				MCNumber operUnitQty = getOperUnitQty(r.base_ttl(), r.unit_cd(), r.oper_unit_cd(), r.oper_std_qty(),
						r.oper_conv_qty(), r.oper_dec_place(), r.unit_conv_rnd_typ());
				r.oper_ttl(operUnitQty);

				int idx = r.getGUIIndex();
				for (int i = 0; i < _vh.getViewSize(); i += 2) {
					operUnitQty = getOperUnitQty((MCNumber) _vh.getConfs()[i].getValue(idx), r.unit_cd(),
							r.oper_unit_cd(), r.oper_std_qty(), r.oper_conv_qty(), r.oper_dec_place(),
							r.unit_conv_rnd_typ());
					setValueEx(_vh.getConfs()[i + 1], idx, operUnitQty);
				}
			}
		}

		/**
		 * 基準単位数量を工程単位に換算する。
		 * 
		 * @param qty　基準単位数量
		 * @param baseUnitCd　基準単位ＣＤ
		 * @param operUnitCd　工程単位ＣＤ
		 * @param operBaseUnitQty　工程基準単位数
		 * @param operConvQty　工程換算単位数
		 * @param operDecPlace　工程小数部有効桁数
		 * @param unitConvRndTyp　換算端数処理区分
		 * @return 工程単位に換算された数量
		 */
		protected MCNumber getOperUnitQty(MCNumber qty, String baseUnitCd, String operUnitCd, MCNumber operBaseUnitQty,
				MCNumber operConvQty, MCNumber operDecPlace, String unitConvRndTyp) {
			if (isNull(qty) || isNull(operUnitCd)) {
				return qty;
			}

			if (!isNullOr(operBaseUnitQty, operConvQty)) {
				if (qty.isZero() || operBaseUnitQty.isZero() || operConvQty.isZero()) {
					return MCNumber.ZERO;
				}
				if (!isNull(operDecPlace) && MAC_RND_TYP.contains(unitConvRndTyp)) {
					return qty.multiply(operConvQty).divide(operBaseUnitQty, operDecPlace.intValue(),
							MAC_RND_TYP.toMC(unitConvRndTyp));
				}
			}

			// メモ：同じ単位でも換算が必要なパターンがあるため
			// 換算を行わなかった時だけ基準単位と同じ数量を返す。
			if (isSame(operUnitCd, baseUnitCd)) {
				return qty;
			}

			MCMessage msg = new MCMessage(MGBPP0001);
			msg.addBind(qty, operConvQty, operBaseUnitQty);
			msg.addBind(operDecPlace != null ? operDecPlace.intValue() : null);
			msg.addBind(unitConvRndTyp);
			MCLog.write(msg);

			return null;
		}

		protected void setHeaderLabel(MCList<RsltR> l) {
			MCColumnGroup[] cgs = DispRsltTable.getAllColumnGroups();
			for (int i = 0; i < l.size(); i++) {
				String lbl = toYMHeaderLabel(panel, l.get(i).ym());
				cgs[i + 3].setHeaderName(lbl);
				String msg = toYMHeaderMessage(panel, l.get(i).ym());
				cgs[i + 3].setHeaderMessage(msg);
			}
		}
	}


	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(TtlPanel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0110_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0130]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0130(MCEventInfo info) {
		DispRsltR r = DispRsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0130(r);
	}
	protected void doBtn_open_MGBDP0130(DispRsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0130");
		mcframe.clientMGBD.MGBDP0130.CndR to = mcframe.clientMGBD.MGBDP0130.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.asst_typ(r.asst_typ());
		to.oper_cd(r.oper_cd());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBDP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBDP0120(MCEventInfo info) {
		DispRsltR r = DispRsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBDP0120(r);
	}
	protected void doBtn_open_MGBDP0120(DispRsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBDP0120");
		mcframe.clientMGBD.MGBDP0120.CndR to = mcframe.clientMGBD.MGBDP0120.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.par_itm_cd(r.itm_cd());
		to.par_itm_sub1(r.itm_sub1());
		to.par_itm_sub2(r.itm_sub2());
		to.par_itm_sub3(r.itm_sub3());
		to.par_itm_nm(r.itm_nm());
		to.par_itm_typ(r.itm_typ());
		to.par_itm_typ_d_cd(r.itm_typ_d_cd());
		to.par_itm_jnl_cd(r.itm_jnl_cd());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.par_lot_no(r.lot_no());
		to.par_sublot_no(r.sublot_no());
		to.par_sno1(r.sno1());
		to.par_sno2(r.sno2());
		to.par_sno3(r.sno3());
		to.par_sno4(r.sno4());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.asst_typ(r.asst_typ());
		to.oper_cd(r.oper_cd());
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

		DispRslt_base_ttl_qty_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_00_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_02_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_04_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_06_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_08_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_10_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_12_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_14_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_16_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_18_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_20_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_22_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);

		DispRslt_oper_ttl_qty_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_01_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_03_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_05_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_07_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_09_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_11_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_13_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_15_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_17_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_19_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_21_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
		DispRslt_qty_23_p_PPanel.setRelateBeans(columnDispRslt_oper_unit_cd, columnDispRslt_oper_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initVhInfo();
	}

	/**
	 * VHConverterの初期化
	 */
	protected void initVhInfo() {
		if (_vh.getConfs() == null) {
			DispRsltR proto = DispRsltR.create();
			Map<String, String> map = proto.getExtMap(DispRsltR.$$ELM);
			ArrayList<MCColumnConfig> confs = new ArrayList<MCColumnConfig>();
			for (MCColumnConfig conf : DispRsltTable.getColumnConfigs()) {
				String val = map.get(conf.getBaseRowColumnName());
				if (val != null) {
					confs.add(conf);
					_DTL_COL_NUM = _DTL_COL_NUM + 1;
				}
			}
			_vh.setConfs(confs.toArray(new MCColumnConfig[0]));
		}
		_vh.initColInfo(_SCALE, 0, null, _DTL_COL_S, _DTL_COL_NUM);
		_vh.setInvisibleColumn();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) DispRsltTable.getCellConfig();
		cc.putColumnBG(DispRsltTable.getColumnConfigs(), getBgOtherColor(this));
		cc.putColumnBG(columnDispRslt_base_ttl, getYmTtlColor(this));
		cc.putColumnBG(columnDispRslt_oper_ttl, getYmTtlColor(this));
	}

	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl, String type) {
		if (tbl == DispRsltTable) {
			// 可変カラムは検索するごとに変わるのでキャッシュしない
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == DispRsltTable) {
			// 可変カラムの部分を再設定する
			confSet.removeAll(Arrays.asList(_vh.getConfs()));
			confSet.addAll(Arrays.asList(_vh.getConfs()).subList(0, _vh.getViewSize()));
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_loc_flg, true);
		setValueEx(Cnd_disp_seq_flg, true);

		setValueEx(LPnl_disp_base_unit, true);
		setValueEx(LPnl_disp_oper_unit, true);
		displayColumn();
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		DispRsltTable.addSortColumn(columnDispRslt_wg_cd);
		DispRsltTable.addSortColumn(columnDispRslt_mng_dpt_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ_d_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_jnl_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub1);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub2);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub3);
		DispRsltTable.addSortColumn(columnDispRslt_itm_mfg_inst_no);
		DispRsltTable.addSortColumn(columnDispRslt_mfg_act_no);
		DispRsltTable.addSortColumn(columnDispRslt_lot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sublot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sno1);
		DispRsltTable.addSortColumn(columnDispRslt_sno2);
		DispRsltTable.addSortColumn(columnDispRslt_sno3);
		DispRsltTable.addSortColumn(columnDispRslt_sno4);
		DispRsltTable.addSortColumn(columnDispRslt_site_cd);
		DispRsltTable.addSortColumn(columnDispRslt_loc_cd);
		DispRsltTable.addSortColumn(columnDispRslt_str_ln_cd);
		DispRsltTable.addSortColumn(columnDispRslt_asst_typ);
		DispRsltTable.addSortColumn(columnDispRslt_disp_seq);
		DispRsltTable.addSortColumn(columnDispRslt_oper_cd);
		DispRsltTable.addSortColumn(columnDispRslt_oper_seq);
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
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		setBtnMode();
		DispRsltTable.selectLeftmostColumn(0);
	}

	protected void setBtnMode() {
		DispRsltR r = DispRsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBDP0130, isEnableBtn_open_MGBDP0130(r));
		setBtnModeByFlg(Btn_open_MGBDP0120, isEnableBtn_open_MGBDP0120(r));
	}

	/**
	 * 工数展開結果一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0130(DispRsltR r) {
		if (r == null || _cndR == null) {
			return false;
		}
		return _cndR.wk_calc_flg();
	}

	/**
	 * 投入展開結果一覧照会画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MGBDP0120(DispRsltR r) {
		if (r == null || _cndR == null) {
			return false;
		}
		return _cndR.inpt_calc_flg();
	}

	// -----------------------------------------------
	// Event
	
	@Override
	public void doDispRslt_NC(MCEventInfo info) {
		super.doDispRslt_NC(info);
		setBtnMode();
	}

	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == DispRsltTable) {
			int index = info.getEventIndex();
			DispRsltR r = getDispRsltL().get(index);
			if (isEnableBtn_open_MGBDP0130(r)) {
				doBtn_open_MGBDP0130(r);
			}
			else if (isEnableBtn_open_MGBDP0120(r)) {
				doBtn_open_MGBDP0130(r);
			}
		}
	}

	@Override
	public void doCnd_loc_cd_LC(MCEventInfo info) {
		super.doCnd_loc_cd_LC(info);
		setValueEx(Cnd_str_ln_cd, null);
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
		super.doCnd_loc_flg_NC(info);
		if (!getCndR().loc_flg()) {
			getCndR().str_ln_flg(false);
		}
	}

	@Override
	public void doCnd_str_ln_flg_NC(MCEventInfo info) {
		super.doCnd_str_ln_flg_NC(info);
		if (getCndR().str_ln_flg()) {
			getCndR().loc_flg(true);
		}
	}

	@Override
	public boolean doLPnl_disp_base_unit_VC(MCEventInfo info) {
		if (!(boolean)info.getNewValue() && !getLPnlR().disp_oper_unit()) {
			return false;
		}
		return super.doLPnl_disp_base_unit_VC(info);
	}

	@Override
	public void doLPnl_disp_base_unit_NC(MCEventInfo info) {
		super.doLPnl_disp_base_unit_NC(info);
		displayUnitColumn();
	}

	@Override
	public boolean doLPnl_disp_oper_unit_VC(MCEventInfo info) {
		if (!(boolean)info.getNewValue() && !getLPnlR().disp_base_unit()) {
			return false;
		}
		return super.doLPnl_disp_oper_unit_VC(info);
	}

	@Override
	public void doLPnl_disp_oper_unit_NC(MCEventInfo info) {
		super.doLPnl_disp_oper_unit_NC(info);
		displayUnitColumn();
	}

	// -----------------------------------------------
	// Display

	protected void displayColumn() {
		changeColumnMode(DispRsltTable, getCndR(), RsltR.$$SHOW);
		displayUnitColumn();
		DispRsltTable.adjustWidth();
	}

	protected void displayUnitColumn() {
		for (MCColumnConfig cc : new MCColumnConfig[] { columnDispRslt_unit_cd, columnDispRslt_unit_nm,
				columnDispRslt_base_ttl}) {
			setColModeByFlg(cc, getLPnlR().disp_base_unit());
		}
		for (MCColumnConfig cc : new MCColumnConfig[] { columnDispRslt_oper_unit_cd, columnDispRslt_oper_unit_nm,
				columnDispRslt_oper_ttl }) {
			setColModeByFlg(cc, getLPnlR().disp_oper_unit());
		}
		if (_vh.getConfs() != null) {
			for (int i = 0; i < _vh.getConfs().length; i++) {
				if (i < _vh.getViewSize()) {
					if (i % 2 == 0) {
						setColModeByFlg(_vh.getConfs()[i], getLPnlR().disp_base_unit());
					}
					else {
						setColModeByFlg(_vh.getConfs()[i], getLPnlR().disp_oper_unit());
					}
				}
				else {
					setColModeByFlg(_vh.getConfs()[i], false);
				}
			}
		}
	}

	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DispRsltTable.setCellConfig(createDispRsltCellConfig());
	}

	protected DispRsltCellConfig createDispRsltCellConfig() {
		return new DispRsltCellConfig();
	}

	protected class DispRsltCellConfig extends MGUDP_CellConfig {
		@Override
		public Boolean getPriorReverseFG(
				int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			DispRsltR row = (DispRsltR) table.getBaseTable().getRow(index);
			if (!row.top_flg() && !getLPnlR().disp_key()) {
				if (getInvisibleColumnConfigs().contains(column)) {
					return true;
				}
			}
			return null;
		}

		protected ArrayList<MCColumnConfig> _invisibleColumnConfigs = null;

		protected ArrayList<MCColumnConfig> getInvisibleColumnConfigs() {
			if (_invisibleColumnConfigs == null) {
				_invisibleColumnConfigs = getGroupColumnConfigs(DispRsltTable,
						DispRsltR.$$CLEAR);
			}
			return _invisibleColumnConfigs;
		}
	}

}