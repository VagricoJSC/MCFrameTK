package mcframe.clientMAUA.MAUAP0010;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.MCListConfig;
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
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.clientCore.resource.MCConfig;
import mcframe.clientCore.resource.MCConst;
//import mcframe.clientCK.CKP9020.CKP_Util;
//import mcframe.clientMAUC.MAUCP0020.TermR;
import mcframe.commonCore.resource.MCFormatConst;
import mcframe.commonCore.resource.ctrl.MCResource;
import mcframe.commonFXBA.FXBAC0020.FXBAC_ListSortInfo;
import mcframe.commonFXUC.FXUCC0010.FXUCC_DataUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Locale;

import javax.imageio.ImageIO;

abstract public class MAUAP_List_MC extends MAUAP_List_MC_A {

	// -- LocaleEntry:ロケール (START)
	@Override
	protected MCList<MCRow> getLocaleEntry_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> down =  MCConfig.common.getEntryLocaleList(LocaleEntryCols.$o_lcl_cd, LocaleEntryCols.$o_lcl_nm );
		getLocaleEntry_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLocaleEntry_Sort(down, info);//ソート
		}
		return down;
	}
	// -- LocaleEntry:ロケール (END)
	// -- AcSlipTyp:会計伝票区分 (START)
	@Override
	protected MCList<MCRow> getAcSlipTyp_GetList(MCRow row, MCEventInfo info) {
		String atrCol = row.getStringNE(AcSlipTypCols.$i_ac_typ_atr);
		if (isNull(atrCol)) {
			return super.getAcSlipTyp_GetList(row, info);
		}
		// 指定された属性によって定数を制限
		MCList<MCRow> trueList = MAC_AC_SLIP_TYP.subList(new String[] {atrCol}, new Comparable<?>[] {true});
		// 全会計伝票区分の情報を取得
		Map<String, String> atrSet = new HashMap<String, String>();
		for (MAC_AC_SLIP_TYP me : MAC_AC_SLIP_TYP.array()) {
			atrSet.put(me.key(), me.value());
		}
		// Mapとして取得したいので、listメソッド（標準の制限機能）を使用せずに定数を制限
		Map<String, Boolean> atrBoolean = new HashMap<String, Boolean>();
		for (String clmNm : row.getColumnPathArray()) {
			if (atrSet.containsKey(clmNm)) {
				atrBoolean.put(clmNm, row.getBoolean(clmNm));
			}
		}
		
		if (atrBoolean.isEmpty()) {
			return trueList;
		}
		// 属性による制限と定数キーによる標準の制限との論理積（AND）を取得
		MCList<MCRow> subTrueList = MCList.create(MCRow.class);
		for (Map.Entry<String, Boolean> e : atrBoolean.entrySet()) {
			if (!e.getValue()){
				continue;
			}
			MCRow r = trueList.getFirst(MAC_AC_SLIP_TYP.$VALUE, atrSet.get(e.getKey()));
			if (r != null) {
				subTrueList.add(r);
			}
		}
		
		return subTrueList;
	}
	// -- AcSlipTyp:会計伝票区分 (END)
	// -- AcxferAcSlipTyp:会計伝票区分（他勘定） (START)
	@Override
	protected MCList<MCRow> getAcxferAcSlipTyp_GetList(MCRow row, MCEventInfo info) {
		row.setStringNE(AcSlipTypCols.$i_ac_typ_atr, MAC_AC_SLIP_TYP.$IS_ACXFER_TYP);
		return getAcSlipTyp_GetList(row, info);
	}
	// -- AcxferAcSlipTyp:会計伝票区分（他勘定） (END)
	// -- QualityTyp:在庫良品区分 (START)
	@Override
	protected MCList<MCRow> getQualityTyp_GetList(MCRow row, MCEventInfo info) {
		String typAtr = row.getStringNE(QualityTypCols.$i_typ_atr);
		if (isNull(typAtr)) {
			return super.getQualityTyp_GetList(row, info);
		}
		// 指定された属性によって定数を制限
		MCList<MCRow> trueListByAtr = MAC_QUALITY_TYP.subList(new String[] {typAtr}, new Comparable<?>[] {true});
		
		// 全在庫良品区分の情報を取得
		Map<String, String> allTypSet = new HashMap<String, String>();
		for (MAC_QUALITY_TYP me : MAC_QUALITY_TYP.array()) {
			allTypSet.put(me.key(), me.value());
		}
		
		// 標準制限のための定数キー情報を入力条件から取得
		Map<String, Boolean> cnstKeySet = new HashMap<String, Boolean>();
		for (String colNm : row.getColumnPathArray()) {
			if (allTypSet.containsKey(colNm)) {
				cnstKeySet.put(colNm, row.getBoolean(colNm));
			}
		}
		
		if (cnstKeySet.isEmpty()) {
			return trueListByAtr;
		}
		
		// 属性による制限と定数キーによる標準の制限との論理積（AND）を取得
		// listメソッド（標準の制限機能）は使用しない
		MCList<MCRow> trueListByAtrAndCnstKey = MCList.create(MCRow.class);
		for (Map.Entry<String, Boolean> e : cnstKeySet.entrySet()) {
			if (!e.getValue()){
				continue;
			}
			MCRow r = trueListByAtr.getFirst(MAC_QUALITY_TYP.$VALUE, allTypSet.get(e.getKey()));
			if (r != null) {
				trueListByAtrAndCnstKey.add(r);
			}
		}
		
		return trueListByAtrAndCnstKey;
	}
	// -- QualityTyp:在庫良品区分 (END)
	// -- SublotMngTyp:サブロット管理区分(START)
	@Override
	protected MCList<MCRow> getSublotMngTyp_GetList(MCRow row, MCEventInfo info) {
		if (isNull(row.getValueNE(SublotMngTypCols.$i_lot_mng_typ))) {
			return MAC_SUBLOT_MNG_TYP.list(row);
		}
		else if (MAC_LOT_MNG_TYP.isUNIQ(row.getStringNE(SublotMngTypCols.$i_lot_mng_typ))) {
			return MAC_SUBLOT_MNG_TYP.subList(new String[] {MAC_SUBLOT_MNG_TYP.$VLD_WHEN_LOT_UNIQ}, new Comparable[] {true});
		}
		else {
			return MAC_SUBLOT_MNG_TYP.list(row);
		}
	}
	// -- SublotMngTyp:サブロット管理区分(END)
	// -- AlcRuleTyp:配賦方法区分(START)
	@Override
	protected MCList<MCRow> getAlcRuleTyp_GetList(MCRow row, MCEventInfo info) {
		String alcTgtTypVal = row.getStringNE(AlcRuleTypCols.$i_alc_tgt_typ);
		if (isNull(alcTgtTypVal)) {
			return super.getAlcRuleTyp_GetList(row, info);
		}
		MAC_ALC_TGT_TYP alcTgtTyp = MAC_ALC_TGT_TYP.get(alcTgtTypVal);
		MCList<MCRow> tgt_RuleTyp = MCList.create(MCRow.class);
		for (MCRow listRow : super.getAlcRuleTyp_GetList(row, info)) {
			String alcRuleTypVal = listRow.getString(AlcRuleTypCols.$o_alc_rule_typ);
			MAC_ALC_RULE_TYP alcRuleTyp = MAC_ALC_RULE_TYP.get(alcRuleTypVal);
			if (MAC_ALC_TGT_TYP.isMFG(alcTgtTyp)) {
				if (alcRuleTyp.is_mfg()) {
					tgt_RuleTyp.add(listRow);
				}
			}
			else if (MAC_ALC_TGT_TYP.isPURC(alcTgtTyp)) {
				if (alcRuleTyp.is_purc()) {
					tgt_RuleTyp.add(listRow);
				}
			}
			else if (MAC_ALC_TGT_TYP.isMFG_PURC(alcTgtTyp)) {
				if (alcRuleTyp.is_mfg()) {
					tgt_RuleTyp.add(listRow);
				}
				else if (alcRuleTyp.is_purc()) {
					tgt_RuleTyp.add(listRow);
				}
			}
			else if (MAC_ALC_TGT_TYP.isSLS(alcTgtTyp)) {
				if (alcRuleTyp.is_sls()) {
					tgt_RuleTyp.add(listRow);
				}
			}
			else if (MAC_ALC_TGT_TYP.isALC(alcTgtTyp)) {
				if (alcRuleTyp.is_alc()) {
					tgt_RuleTyp.add(listRow);
				}
			}
		}
		return tgt_RuleTyp;
	}
	// -- AlcRuleTyp:配賦方法区分(END)
	// -- TgtColTyp:対象項目区分(START)
	@Override
	protected MCList<MCRow> getTgtColTyp_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> superList = super.getTgtColTyp_GetList(row, info);
		String costTableTypVal = row.getStringNE(TgtColTypCols.$i_cost_table_typ);
		// ソート用カラムを追加
		superList.addNumberColumn(TgtColTypCols.$o_list_sort);
		if (isNull(costTableTypVal)) {
			return superList;
		}
		for (MCRow listRow : superList) {
			MAC_TGT_COL_TYP t = MAC_TGT_COL_TYP.get(listRow.getString(TgtColTypCols.$o_tgt_col_typ));
			listRow.setNumberNE(TgtColTypCols.$o_list_sort, t.list_sort());
		}

		MAC_COST_TABLE_TYP costTableTyp = MAC_COST_TABLE_TYP.get(costTableTypVal);
		MCList<MCRow> costTable_TgtColTyp = MCList.create(MCRow.class);
		for (MCRow listRow : superList) {
			String tgtColTypVal = listRow.getString(TgtColTypCols.$o_tgt_col_typ);
			MAC_TGT_COL_TYP tgtColTyp = MAC_TGT_COL_TYP.get(tgtColTypVal);
			if (MAC_COST_TABLE_TYP.isITM_MFG_INST(costTableTyp)) {
				if (tgtColTyp.is_itm_mfg_inst()) {
					costTable_TgtColTyp.add(listRow);
				}
			}
			else if (MAC_COST_TABLE_TYP.isACT_PURC_IF(costTableTyp)) {
				if (tgtColTyp.is_act_purc_if()) {
					costTable_TgtColTyp.add(listRow);
				}
			}
			else if (MAC_COST_TABLE_TYP.isACT_SLS_IF(costTableTyp)) {
				if (tgtColTyp.is_act_sls_if()) {
					costTable_TgtColTyp.add(listRow);
				}
			}
		}
		return costTable_TgtColTyp;
	}
	// -- TgtColTyp:対象項目区分(END)
	// -- MultiMstNm:マスタ名（マルチマスタ）(START)
	@Override
	protected MCList<MCRow> getMultiMstNm_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> multiList = MAC_MST_NM.subList(new String[] {MAC_MST_NM.$IS_MULTI}, new Comparable<?>[] {true});
		// ソート用カラムを追加
		multiList.addNumberColumn(MultiMstNmCols.$o_multi_sort);
		for (MCRow listRow : multiList) {
			MAC_MST_NM t = MAC_MST_NM.get(listRow.getString(MultiMstNmCols.$o_mst_nm));
			listRow.setNumberNE(MultiMstNmCols.$o_multi_sort, t.multi_sort());
		}
		return multiList;
	}
	// -- MultiMstNm:マスタ名（マルチマスタ）(END)
	// -- BigNumRndTyp:数値丸め区分(START)
	@Override
	protected MCList<MCRow> getBigNumRndTyp_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> superList = super.getBigNumRndTyp_GetList(row, info);
		// ソート用カラムを追加
		superList.addNumberColumn(BigNumRndTypCols.$o_multiple);
		for (MCRow listRow :superList) {
			MAC_BIG_NUM_RND_TYP t = MAC_BIG_NUM_RND_TYP.get(listRow.getString(BigNumRndTypCols.$o_big_num_rnd_typ));
			listRow.setNumberNE(BigNumRndTypCols.$o_multiple, t.multiple());
		}
		return superList;
	}
	// -- BigNumRndTyp:数値丸め区分(END)
	// -- Tax:税(START)
	//税率に％を付けて表示させる
	@Override
	protected void getTax_SetViewCols(MCList<MCRow> down, MCEventInfo info) {
		String addViewCol = "tax_rate_percent";
		String[] viewCols = {TaxCols.$v_tax_cd, TaxCols.$v_tax_nm, addViewCol};

		for (MCRow downRow : down) {
			String taxRatePercent = toPercentString(downRow.getNumberNE(TaxCols.$v_tax_rate));
			downRow.setValueNE(addViewCol, taxRatePercent);
		}
		addDefDispColumn(viewCols, down, info);
	}
	// -- Tax:税(END)
	// -- SlsTax:売上税(START)
	//税率に％を付けて表示させる
	@Override
	protected void getSlsTax_SetViewCols(MCList<MCRow> down, MCEventInfo info) {
		String addViewCol = "tax_rate_percent";
		String[] viewCols = {TaxCols.$v_tax_cd, TaxCols.$v_tax_nm, addViewCol};

		for (MCRow downRow : down) {
			String taxRatePercent = toPercentString(downRow.getNumberNE(TaxCols.$v_tax_rate));
			downRow.setValueNE(addViewCol, taxRatePercent);
		}
		addDefDispColumn(viewCols, down, info);
	}
	// -- SlsTax:売上税(END)
	// -- PurcTax:仕入税(START)
	//税率に％を付けて表示させる
	@Override
	protected void getPurcTax_SetViewCols(MCList<MCRow> down, MCEventInfo info) {
		String addViewCol = "tax_rate_percent";
		String[] viewCols = {TaxCols.$v_tax_cd, TaxCols.$v_tax_nm, addViewCol};

		for (MCRow downRow : down) {
			String taxRatePercent = toPercentString(downRow.getNumberNE(TaxCols.$v_tax_rate));
			downRow.setValueNE(addViewCol, taxRatePercent);
		}
		addDefDispColumn(viewCols, down, info);
	}
	// -- PurcTax:仕入税(END)
	// -- ProvTax:支給税(START)
	//税率に％を付けて表示させる
	@Override
	protected void getProvTax_SetViewCols(MCList<MCRow> down, MCEventInfo info) {
		String addViewCol = "tax_rate_percent";
		String[] viewCols = {TaxCols.$v_tax_cd, TaxCols.$v_tax_nm, addViewCol};

		for (MCRow downRow : down) {
			String taxRatePercent = toPercentString(downRow.getNumberNE(TaxCols.$v_tax_rate));
			downRow.setValueNE(addViewCol, taxRatePercent);
		}
		addDefDispColumn(viewCols, down, info);
	}
	// -- ProvTax:支給税(END)
	// -- ItmVer:版 (START)
	@Override
	protected MCList<MCRow> getItmVer_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = super.getItmVer_GetList(row, info);
		down.forEach(r -> r.setStringNE(ItmVerCols.$o_disp_purc_st_dt, toYMDString(r.getDateNE(ItmVerCols.$o_purc_st_dt))));
		return down;
	}
	// -- ItmVer:版 (END)
	// -- CostIoConf:受払項目 (START)
	@Override
	public MCList<MCRow> getCostIoConf(MCRow row, MCEventInfo info) {
		MCNumber costIoId = row.getNumberNE(CostIoConfCols.$i_cost_io_id);
		if (costIoId == null) {
			return null;
		}
		return super.getCostIoConf(row, info);
	}
	// -- CostIoConf:受払項目 (END)
	// -- RptKeyWithTyp:原価レポートキー（区分も表示） (START)
	@Override
	public MCList<MCRow> getRptKeyWithTyp_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = super.getRptKeyWithTyp_GetList(row, info);
		MAC_RPT_KEY_TYP.putNameNE(list, RptKeyWithTypCols.$o_rpt_key_typ,
				RptKeyWithTypCols.$o_rpt_key_typ_nm);
		return list;
	}
	// -- RptKeyWithTyp:原価レポートキー（区分も表示） (END)
	// -- RptKeyWithTypNotInRptKeyConf:原価レポートキー（レポートキー構成未登録） (START)
	@Override
	public MCList<MCRow> getRptKeyWithTypNotInRptKeyConf_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = super.getRptKeyWithTypNotInRptKeyConf_GetList(row, info);
		MAC_RPT_KEY_TYP.putNameNE(list, RptKeyWithTypNotInRptKeyConfCols.$o_rpt_key_typ,
				RptKeyWithTypNotInRptKeyConfCols.$o_rpt_key_typ_nm);
		return list;
	}
	// -- RptKeyWithTypNotInRptKeyConf:原価レポートキー（レポートキー構成未登録） (END)
	// -- EvalAcSlipTyp:会計伝票区分（評価） (START)
	@Override
	protected MCList<MCRow> getEvalAcSlipTyp_GetList(MCRow row, MCEventInfo info) {
		row.setStringNE(AcSlipTypCols.$i_ac_typ_atr, MAC_AC_SLIP_TYP.$IS_EVAL_TYP);
		return getAcSlipTyp_GetList(row, info);
	}
	// -- EvalAcSlipTyp:会計伝票区分（評価） (END)
	// -- ItmOper:品目工程 (START)
	@Override
	public MCList<MCRow> getItmOper(MCRow row, MCEventInfo info) {
		MCList<MCRow> sl = super.getItmOper(row, info);
		// 工程パタンについて重複を解消する
		MCList<MCRow> l = sl.createInstance();
		for (MCRow r : sl) {
			if (isNull(l.getFirst(ItmOperCols.$o_oper_ptn, r.getStringNE(ItmOperCols.$o_oper_ptn)))) {
				l.add(r);
			}
		}
		return l;
	}
	// -- ItmOper:品目工程 (END)
	// -- AcDpt:会計部門 (START)
	@Override
	protected MCList<MCRow> getAcDpt_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getAcDpt_GetList(row, info);
		// リスト取得・手入力時のみ、nullを返す
		// 部門名を設定すると、組織改正で部門名が変わった場合に、部門名の違う過去データが検索できなくなる
		// そのため、dpt_nm_rem_flg見て部門名を消す場合は、下記の通り実装する
//		if (row.getBooleanNE(AcDptCols.$i_dpt_nm_rem_flg)) {
//			l.setStringNE(AcDptCols.$o_ac_dpt_nm, null);
//		}
		// 標準では検索枠の部門名に値が入らないと動作が他の項目と違い不自然なため、部面名を設定する
		return l;
	}
	// -- AcDpt:会計部門 (END)
	// -- Trd:取引 (START)
	@Override
	protected MCList<MCRow> getTrd_GetList(MCRow row, MCEventInfo info) {
		if (isNull(row.getStringNE(TrdCols.$i_func_id))) { 
			row.setStringNE(TrdCols.$i_func_id, getPanelScreenID());
		}
		return super.getTrd_GetList(row, info);
	}
	// -- Trd:取引 (END)
	// -- AcxfrGrAcxfrGiDispBizRsn:業務理由（他勘定入庫、他勘定出庫、廃棄） (START)
	@Override
	public MCList<MCRow> getAcxfrGrAcxfrGiDispBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> sl = super.getAcxfrGrAcxfrGiDispBizRsn(row, info);

		if (sl != null) {
			final MCNumber $sn_sort_seq = new MCNumber(10);
			FXBAC_ListSortInfo $sort_cols_MC = null;

			if (row.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gr_flg)) {
				$sort_cols_MC = new FXBAC_ListSortInfo() {{
					put($sn_sort_seq, AcxfrGrAcxfrGiDispBizRsnCols.$o_acxfr_gr_sort_seq, SortType.ASC);
				}};;
			}
			if (row.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_acxfr_gi_flg)) {
				$sort_cols_MC = new FXBAC_ListSortInfo() {{
					put($sn_sort_seq, AcxfrGrAcxfrGiDispBizRsnCols.$o_acxfr_gi_sort_seq, SortType.ASC);
				}};;
			}
			if (row.getBooleanNE(AcxfrGrAcxfrGiDispBizRsnCols.$i_disp_flg)) {
				$sort_cols_MC = new FXBAC_ListSortInfo() {{
					put($sn_sort_seq, AcxfrGrAcxfrGiDispBizRsnCols.$o_disp_sort_seq, SortType.ASC);
				}};;
			}

			if ($sort_cols_MC != null) {
				sl.sort($sort_cols_MC.createSortPolicy());
			}
		}
		return sl;
	}
	// -- AcxfrGrAcxfrGiDispBizRsn:業務理由（他勘定入庫、他勘定出庫、廃棄） (END)
	// -- ArrBizRsn:業務理由（仕入、経費購買、売上返品、販売他勘定、移送、他勘定出庫） (START)
	@Override
	public MCList<MCRow> getArrBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> sl = super.getArrBizRsn(row, info);

		if (sl != null) {
			final MCNumber $sn_sort_seq = new MCNumber(10);
			FXBAC_ListSortInfo $sort_cols_MC = null;

			if (row.getBooleanNE(ArrBizRsnCols.$i_purc_flg)) {
				$sort_cols_MC = new FXBAC_ListSortInfo() {{
					put($sn_sort_seq, ArrBizRsnCols.$o_purc_sort_seq, SortType.ASC);
				}};;
			}
			if (row.getBooleanNE(ArrBizRsnCols.$i_sls_rtn_flg)) {
				$sort_cols_MC = new FXBAC_ListSortInfo() {{
					put($sn_sort_seq, ArrBizRsnCols.$o_sls_rtn_sort_seq, SortType.ASC);
				}};;
			}
			if (row.getBooleanNE(ArrBizRsnCols.$i_xfr_flg)) {
				$sort_cols_MC = new FXBAC_ListSortInfo() {{
					put($sn_sort_seq, ArrBizRsnCols.$o_xfr_sort_seq, SortType.ASC);
				}};;
			}

			if ($sort_cols_MC != null) {
				sl.sort($sort_cols_MC.createSortPolicy());
			}
		}
		return sl;
	}
	// -- ArrBizRsn:業務理由（仕入、経費購買、売上返品、販売他勘定、移送、他勘定出庫） (END)
	// -- ShipBizRsn:業務理由（売上、販売他勘定、移送、他勘定出庫） (START)
	@Override
	public MCList<MCRow> getShipBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> sl = super.getShipBizRsn(row, info);

		if (sl != null) {
			final MCNumber $sn_sort_seq = new MCNumber(10);
			FXBAC_ListSortInfo $sort_cols_MC = null;

			if (row.getBooleanNE(ShipBizRsnCols.$i_sls_flg)) {
				$sort_cols_MC = new FXBAC_ListSortInfo() {{
					put($sn_sort_seq, ShipBizRsnCols.$o_sls_sort_seq, SortType.ASC);
				}};;
			}
			if (row.getBooleanNE(ShipBizRsnCols.$i_xfr_flg)) {
				$sort_cols_MC = new FXBAC_ListSortInfo() {{
					put($sn_sort_seq, ShipBizRsnCols.$o_xfr_sort_seq, SortType.ASC);
				}};;
			}

			if ($sort_cols_MC != null) {
				sl.sort($sort_cols_MC.createSortPolicy());
			}
		}
		return sl;
	}
	// -- ShipBizRsn:業務理由（売上、販売他勘定、移送、他勘定出庫） (END)
	// -- SlsAllBizRsn:業務理由（売上、売上返品、売上調整） (START)
	@Override
	public MCList<MCRow> getSlsAllBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> sl = super.getSlsAllBizRsn(row, info);

		if (sl != null) {
			final MCNumber $sn_sort_seq = new MCNumber(10);
			FXBAC_ListSortInfo $sort_cols_MC = null;
			boolean sls = row.getBooleanNE(SlsAllBizRsnCols.$i_sls_rtn_flg);
			boolean slsrtn = row.getBooleanNE(SlsAllBizRsnCols.$i_sls_rtn_flg);
			boolean slsdscnt = row.getBooleanNE(SlsAllBizRsnCols.$i_sls_dscnt_flg);

			if (sls && !(slsrtn || slsdscnt)) {
				$sort_cols_MC = new FXBAC_ListSortInfo() {{
					put($sn_sort_seq, SlsAllBizRsnCols.$o_sls_sort_seq, SortType.ASC);
				}};;
			}
			else if (slsrtn && !(sls || slsdscnt)) {
				$sort_cols_MC = new FXBAC_ListSortInfo() {{
					put($sn_sort_seq, SlsAllBizRsnCols.$o_sls_rtn_sort_seq, SortType.ASC);
				}};;
			}
			else if (slsdscnt && !(sls || slsrtn)) {
				$sort_cols_MC = new FXBAC_ListSortInfo() {{
					put($sn_sort_seq, SlsAllBizRsnCols.$o_sls_dscnt_sort_seq, SortType.ASC);
				}};;
			}

			if ($sort_cols_MC != null) {
				sl.sort($sort_cols_MC.createSortPolicy());
			}
		}
		return sl;
	}
	// -- SlsAllBizRsn:業務理由（売上、売上返品、売上調整） (END)
	// -- NumBizTyp:発番業務区分 (START)
	@Override
	protected MCList<MCRow> getNumBizTyp_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> sl = super.getNumBizTyp_GetList(row, info);
		sl.addNumberColumn(NumBizTypCols.$o_list_sort);
		for (MCRow r : sl) {
			MAC_NUM_BIZ_TYP t = MAC_NUM_BIZ_TYP.get(r.getString(NumBizTypCols.$o_num_biz_typ));
			r.setNumberNE(NumBizTypCols.$o_list_sort, t.list_sort());
		}
		return sl;
	}
	// -- NumBizTyp:発番業務区分 (END)
	// -- ElmTyp:要素区分 (START)
	@Override
	protected MCList<MCRow> getElmTyp_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> sl = super.getElmTyp_GetList(row, info);
		sl.addNumberColumn(ElmTypCols.$o_list_sort);
		for (MCRow r : sl) {
			MAC_ELM_TYP t = MAC_ELM_TYP.get(r.getString(ElmTypCols.$o_elm_typ));
			r.setNumberNE(ElmTypCols.$o_list_sort, t.list_sort());
		}
		return sl;
	}
	// -- ElmTyp:要素区分 (END)
	// -- BpProvBasisTyp:支給計上区分（取引先マスタ用） (START)
	@Override
	protected MCList<MCRow> getBpProvBasisTyp_GetList(MCRow row, MCEventInfo info) {

		Boolean onrPrsppl = row.getBooleanNE(BpProvBasisTypCols.$i_onr_prsppl_flg);
		Boolean subcon = row.getBooleanNE(BpProvBasisTypCols.$i_subcon_flg);
		String provrcvtyp = row.getStringNE(BpProvBasisTypCols.$i_prov_rcv_typ);

		// 指定された属性によって定数を制限
		MCList<MCRow> trueListByProv = MAC_PROV_BASIS_TYP.subList(new String[] {
			"not_onr_prsppl"
		}, new Comparable<?>[] {
			true
		});

		if (onrPrsppl) {
			if (subcon) {
				trueListByProv = MAC_PROV_BASIS_TYP.subList(new String[] {"is_subcon"}, new Comparable<?>[] {true});
			}
			else if (MAC_PROV_RCV_TYP.isNOT_ARR(provrcvtyp)) {
				trueListByProv = MAC_PROV_BASIS_TYP.subList(new String[] {"not_arr"}, new Comparable<?>[] {true});
			}
			else {
				trueListByProv = MAC_PROV_BASIS_TYP.subList(new String[] {"is_arr"}, new Comparable<?>[] {true});
			}
		}
		return trueListByProv;
	}

	// -- BpProvBasisTyp:支給計上区分（取引先マスタ用） (END)
	// -- AprvFuncTyp:承認機能区分 (START)
	@Override
	protected MCList<MCRow> getAprvFuncTyp_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> sL = super.getAprvFuncTyp_GetList(row, info);
		MCList<MCRow> sL2 = sL.shallowClone();
		sL2.clear();
		for (MCRow r : sL) {
			if (!MAC_APRV_FUNC_TYP.isSCRP(r.getString(AprvFuncTypCols.$o_aprv_func_typ))
					& !MAC_APRV_FUNC_TYP
							.isSTK_OTH_GI(r.getString(AprvFuncTypCols.$o_aprv_func_typ))
					& !MAC_APRV_FUNC_TYP.isSTK_OTH_GR(
							r.getString(AprvFuncTypCols.$o_aprv_func_typ))) {
				sL2.add(r);
			}
		}

		return sL2;
	}

	// -- AprvFuncTyp:承認機能区分 (END)
	// -- LotInhColTyp:継承項目区分 (START)
	@Override
	protected MCList<MCRow> getLotInhColTyp_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getLotInhColTyp_GetList(row, info);

		// システムパラメータマスタで有効成分管理機能（CONT_FCTR_ENABLE_FLG）を無効にしている場合は
		// 「ACT_CONT_FCTR：実際有効成分係数」を表示しない
		String flgStr = getSysParm("CONT_FCTR_ENABLE_FLG", info.getComponent().getRootPanel());
		if (!isSame(flgStr, "1")) {
			l.removeIf(r -> {return MAC_LOT_INH_COL_TYP.isACT_CONT_FCTR(r.getString(LotInhColTypCols.$o_lot_inh_col_typ));});
		}

		return l;
	}
	/**
	 * システムパラメータの値を取得する
	 */
	protected String getSysParm(String parm_key, MCRootPanel p) {
		if (p instanceof mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase) {
			mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase pb = (mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase) p;
			return pb.getSysParm(parm_key);
		}
		else if (p instanceof mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase) {
			mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase pb = (mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase) p;
			return pb.getSysParm(parm_key);
		}
		return null;
	}
	// -- LotInhColTyp:継承項目区分 (END)
	// -- AddConcatColTyp:追加結合項目区分 (START)
	@Override
	protected MCList<MCRow> getAddConcatColTyp_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getAddConcatColTyp_GetList(row, info);
		l.removeIf(r -> {return !MAC_LOT_INH_COL_TYP.is_enable_add(r.getString(AddConcatColTypCols.$o_lot_inh_col_typ));});
		return l;
	}
	// -- AddConcatColTyp:追加結合項目区分 (END)
	// ///////////////////////////////////////////////
	// ＮＵＬＬ文字対応項目 （ここから）
	// ///////////////////////////////////////////////

	// -- Oper:工程 (START)
	@Override
	protected void getOper_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- Oper:工程 (END)
	// -- Dpt:部門 (START)
	@Override
	protected MCList<MCRow> getDpt_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getDpt_GetList(row, info);
		// リスト取得・手入力時のみ、nullを返す
		// 部門名を設定すると、組織改正で部門名が変わった場合に、部門名の違う過去データが検索できなくなる
		// そのため、dpt_nm_rem_flg見て部門名を消す場合は、下記の通り実装する
//		if (row.getBooleanNE(DptCols.$i_dpt_nm_rem_flg)) {
//			l.setStringNE(DptCols.$o_dpt_nm, null);
//		}
		// 標準では検索枠の部門名に値が入らないと動作が他の項目と違い不自然なため、部面名を設定する		
		return l;
	}
	@Override
	protected void getDpt_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- Dpt:部門 (END)
	// -- Site:工場・物流倉庫 (START)
	@Override
	protected void getSite_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- Site:工場・物流倉庫 (END)
	// -- StrLn:棚・ライン (START)
	@Override
	protected void getStrLn_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- StrLn:棚・ライン (END)
	// -- Bp:取引先 (START)
	@Override
	protected MCList<MCRow> getBp_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getBp_GetList(row, info);
		// リスト取得・手入力時のみ、nullを返す
		if (row.getBooleanNE(BpCols.$i_sundry_bp_nm_rem_flg)) {
			MCList<MCRow> sundryList = MCList.create(MCRow.class);
			// 重複は考慮していない
			sundryList.addAll(l.subList(BpCols.$o_cst_sundry_flg, true));
			sundryList.addAll(l.subList(BpCols.$o_dlv_sundry_flg, true));
			for (MCRow r : sundryList) {
				l.setStringNE(l.indexOf(r), BpCols.$o_bp_nm, null);
			}
		}
		return l;
	}
	@Override
	protected void getBp_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要（コンボで使用された場合用）
	}
	// -- Bp:取引先 (END)
	// -- Loc:場所 (START)
	@Override
	protected void getLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要（コンボで使用された場合用）
	}
	// -- Loc:場所 (END)
	// -- ShipTerm:出荷条件 (START)
	@Override
	protected void getShipTerm_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ShipTerm:出荷条件 (END)
	// -- LgGrp:物流グループ (START)
	@Override
	protected void getLgGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- LgGrp:物流グループ (END)
	// -- ItmShipGrp:品目出荷グループ (START)
	@Override
	protected void getItmShipGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmShipGrp:品目出荷グループ (END)
	// -- SplnItm:販売計画品目 (START)
	@Override
	protected void getSplnItm_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- SplnItm:販売計画品目 (END)
	// -- Wg:ＷＧ (START)
	@Override
	protected void getWg_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- Wg:ＷＧ (END)
	// -- LgOrMfgOrSlsWg:ＷＧ（物流または製造または販売） (START)
	@Override
	protected void getLgOrMfgOrSlsWg_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- LgOrMfgOrSlsWg:ＷＧ（物流または製造または販売） (END)
	// -- LgOrMfgWg:ＷＧ（物流または製造） (START)
	@Override
	protected void getLgOrMfgWg_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- LgOrMfgWg:ＷＧ（物流または製造） (END)
	// -- SlsWg:ＷＧ（販売） (START)
	@Override
	protected void getSlsWg_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- SlsWg:ＷＧ（販売） (END)
	// -- LgWg:ＷＧ（物流） (START)
	@Override
	protected void getLgWg_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- LgWg:ＷＧ（物流） (END)
	// -- MfgWg:ＷＧ（製造） (START)
	@Override
	protected void getMfgWg_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- MfgWg:ＷＧ（製造） (END)
	// -- PurcWg:ＷＧ（購買） (START)
	@Override
	protected void getPurcWg_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- PurcWg:ＷＧ（購買） (END)
	// -- ArWg:ＷＧ（債権） (START)
	@Override
	protected void getArWg_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ArWg:ＷＧ（債権） (END)
	// -- ApWg:ＷＧ（債務） (START)
	@Override
	protected void getApWg_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ApWg:ＷＧ（債務） (END)
	// -- SdWg:ＷＧ（需給） (START)
	@Override
	protected void getSdWg_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- SdWg:ＷＧ（需給） (END)
	// -- PlmWg:ＷＧ（ＰＬＭ） (START)
	@Override
	protected void getPlmWg_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- PlmWg:ＷＧ（ＰＬＭ） (END)
	// -- ExtSys:外部システム (START)
	@Override
	protected void getExtSys_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ExtSys:外部システム (END)
	// -- Usr:担当者 (START)
	@Override
	protected void getUsr_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要（コンボで使用された場合用）
	}
	// -- Usr:担当者 (END)
	//
	// -- Itm:品目 (START)
	@Override
	protected MCList<MCRow> getItm_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getItm_GetList(row, info);
		// リスト取得・手入力時のみ、nullを返す
		if (row.getBooleanNE(ItmCols.$i_sundry_itm_nm_rem_flg)) {
			MCList<MCRow> sundryList = l.subList(ItmCols.$o_sundry_itm_flg, true);
			for (MCRow r : sundryList) {
				l.setStringNE(l.indexOf(r), ItmCols.$o_itm_nm, null);
			}
		}
		return l;
	}
	@Override
	protected void getItm_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- Itm:品目 (END)
	// -- ItmSub1:枝番１ (START)
	@Override
	protected MCList<MCRow> getItmSub1_GetList(MCRow row, MCEventInfo info) {
		if (!isInput(row)) {
			setComboIdentifier(row);
		}
		MCList<MCRow> l = super.getItmSub1_GetList(row, info);
		// リスト取得・手入力時のみ、nullを返す
		if (row.getBooleanNE(ItmSub1Cols.$i_sundry_itm_nm_rem_flg)) {
			MCList<MCRow> sundryList = l.subList(ItmSub1Cols.$o_sundry_itm_flg, true);
			for (MCRow r : sundryList) {
				l.setStringNE(l.indexOf(r), ItmSub1Cols.$o_itm_nm, null);
			}
		}
		return l;
	}
	@Override
	protected void getItmSub1_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmSub1:枝番１ (END)
	// -- ItmSub2:枝番２ (START)
	@Override
	protected MCList<MCRow> getItmSub2_GetList(MCRow row, MCEventInfo info) {
		if (!isInput(row)) {
			setComboIdentifier(row);
		}
		MCList<MCRow> l = super.getItmSub2_GetList(row, info);
		// リスト取得・手入力時のみ、nullを返す
		if (row.getBooleanNE(ItmSub2Cols.$i_sundry_itm_nm_rem_flg)) {
			MCList<MCRow> sundryList = l.subList(ItmSub2Cols.$o_sundry_itm_flg, true);
			for (MCRow r : sundryList) {
				l.setStringNE(l.indexOf(r), ItmSub2Cols.$o_itm_nm, null);
			}
		}
		return l;
	}
	@Override
	protected void getItmSub2_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmSub2:枝番２ (END)
	// -- ItmSub3:枝番３ (START)
	@Override
	protected MCList<MCRow> getItmSub3_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> l = super.getItmSub3_GetList(row, info);
		// リスト取得・手入力時のみ、nullを返す
		if (row.getBooleanNE(ItmSub3Cols.$i_sundry_itm_nm_rem_flg)) {
			MCList<MCRow> sundryList = l.subList(ItmSub3Cols.$o_sundry_itm_flg, true);
			for (MCRow r : sundryList) {
				l.setStringNE(l.indexOf(r), ItmSub3Cols.$o_itm_nm, null);
			}
		}
		return l;
	}
	@Override
	protected void getItmSub3_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmSub3:枝番３ (END)
	// -- SlsUpriGrp:販売単価分類 (START)
	@Override
	protected void getSlsUpriGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- SlsUpriGrp:販売単価分類 (END)
	// -- SlsUpriRank:販売単価ランク (START)
	@Override
	protected void getSlsUpriRank_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- SlsUpriRank:販売単価ランク (END)
	// -- ItmDtl:品目詳細 (START)
	@Override
	protected void getItmDtl_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmDtl:品目詳細 (END)
	// -- ItmDtlSub1:品目詳細（枝番１） (START)
	@Override
	protected MCList<MCRow> getItmDtlSub1_GetList(MCRow row, MCEventInfo info) {
		if (!isInput(row)) {
			setComboIdentifier(row);
		}
		return super.getItmDtlSub1_GetList(row, info);
	}
	@Override
	protected void getItmDtlSub1_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmDtlSub1:品目詳細（枝番１） (END)
	// -- ItmDtlSub2:品目詳細（枝番２） (START)
	@Override
	protected MCList<MCRow> getItmDtlSub2_GetList(MCRow row, MCEventInfo info) {
		if (!isInput(row)) {
			setComboIdentifier(row);
		}
		return super.getItmDtlSub2_GetList(row, info);
	}
	@Override
	protected void getItmDtlSub2_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmDtlSub2:品目詳細（枝番２） (END)
	// -- ItmDtlSub3:品目詳細（枝番３） (START)
	@Override
	protected MCList<MCRow> getItmDtlSub3_GetList(MCRow row, MCEventInfo info) {
		if (!isInput(row)) {
			setComboIdentifier(row);
		}
		return super.getItmDtlSub3_GetList(row, info);
	}
	@Override
	protected void getItmDtlSub3_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- ItmDtlSub3:品目詳細（枝番３） (END)
	// -- CostDpt:原価部門 (START)
	@Override
	protected void getCostDpt_Sort(MCList<MCRow> down, MCEventInfo info){
		// NULL文字が含まれるので、ソート処理不要
	}
	// -- CostDpt:原価部門 (END)
	// -- MstSetTyp：マスタ制御区分 (START)
	@Override
	protected mcframe.commonCore.container.MCList<mcframe.commonCore.container.MCRow> getMstSetTyp_GetList(
			mcframe.commonCore.container.MCRow row,
			mcframe.clientCore.event.MCEventInfo info) {
		if(MAC_MST_NM.isMAM_BP(row.getStringNE(MstSetTypCols.$i_mst_nm))) {
			return super.getMstSetTyp_GetList(row, info);
		}
		// 取引先マスタ以外は、「★共通・会社別」は除外
		Comparable<?>[] vals = new Comparable<?>[] {
			MAC_MST_SET_TYP.ALL_COM_COM.value()
		};
		return MAC_MST_SET_TYP.exptSubList(MAC_MST_SET_TYP.$VALUE, vals);
	}
	// -- MstSetTyp：マスタ制御区分 (END)
	// -- ExtMasterTyp：外部マスタ連携区分 (START)
	@Override
	protected MCList<MCRow> getExtMasterTyp_GetList(MCRow row, MCEventInfo info) {

		boolean recv = row.getBooleanNE(ExtMasterTypCols.$i_recv_flg);
		MCList<MCRow> extMasterTypList;

			if (recv) {
				extMasterTypList = super.getExtMasterTyp_GetList(row, info);
			}
			else {
				extMasterTypList = MAC_EXT_MASTER_TYP.subList(new String[] {"is_recv"}, new Comparable<?>[] {false});
			}
		return extMasterTypList;
		
	}

	// -- ExtMasterTyp：外部マスタ連携区分 (END)
	// -- ApTyp：債務区分 (START)
	@Override
	public MCList<MCRow> getApTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> apTypList = MAC_AP_TYP.subList(new String[] {"is_default"}, new Comparable<?>[] {true});
		// 「暫定買掛ＦＬＧ」がオンの場合、暫定買掛を表示する
		if (row.getBooleanNE(ApTypCols.$i_accrued_flg)) {
			MCRow r = MCRow.create();
			r.addStringColumn(MAC_AP_TYP.$VALUE, MAC_AP_TYP.TEMP_AP.value());
			r.addStringColumn(MAC_AP_TYP.$NAME, MAC_AP_TYP.TEMP_AP.name());
			apTypList.add(r);
		}
		getApTyp_SetViewCols(apTypList, info);//表示用カラムの追加
		return apTypList;
	}
	// -- ApTyp：債務区分 (END)

	// ///////////////////////////////////////////////
	// ＮＵＬＬ文字対応項目 （ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 共通処理 （ここから）
	// ///////////////////////////////////////////////

	protected boolean isInput(MCRow row) {
		return row.contains($INPUT_VAL) || row.contains($INPUT_REQ_PLURAL_VAL);
	}

	/**
	 * コンボボックスからの入力かどうかを識別するためのカラムを追加します。
	 */
	protected void setComboIdentifier(MCRow row) {
		row.setBooleanNE($COMBO_MODE, true);
	}

	// ///////////////////////////////////////////////
	// 共通処理 （ここまで）
	// ///////////////////////////////////////////////

}
