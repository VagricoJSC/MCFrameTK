package mcframe.clientMGUA.MGUAP0010;

import mcframe.clientCore.event.MCEventInfo;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;

import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;
import static mcframe.commonFXUC.FXUCC0010.FXUCC_DataUtil.*;
import mcframe.commonMG.constant.*;

abstract public class MGUAP_List_MC extends MGUAP_List_MC_A {
	// -- Ym:年月(START)
	@Override
	protected MCList<MCRow> getYm_GetList(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = MCList.create(MCRow.class);
		list.addDateColumn(YmCols.$o_ym);
		MCDate stYm = row.getDateNE(YmCols.$i_st_ym);
		MCDate endYm = row.getDateNE(YmCols.$i_end_ym);
		MCNumber maxMons = row.getNumberNE(YmCols.$i_max_interval);
		if (isNullOr(stYm, endYm)) {
			return list;
		}
		if (row.getBooleanNE(YmCols.$i_inc_end_ym_flg)) {
			endYm = endYm.addMonth(1);
		}
		MCDate currentYm = stYm;
		while (true) {
			if (currentYm.gte(endYm)) {
				break;
			}
			MCRow tmp = list.createRow();
			tmp.setDate(YmCols.$o_ym, currentYm);
			list.add(tmp);
			if (isNull(maxMons) || maxMons.isZero()) {
				currentYm = currentYm.addMonth(1);
			}
			else {
				currentYm = currentYm.addMonth(maxMons.intValueExact());
			}
		}
		return list;
	}

	// -- Ym:年月(END)
	// -- CostCopyTyp:原価コピー対象区分(START)
		@Override
		protected MCList<MCRow>  getCostCopyTyp_GetList(MCRow row, MCEventInfo info){
			MCList<MCRow> list = MCList.create(MCRow.class);
			String tabCtgTyp = row.getStringNE(CostCopyTypCols.$i_tab_ctg_typ);
			String srchTyp = row.getStringNE(CostCopyTypCols.$i_tgt_typ);
			boolean tabCtg = !isNull(tabCtgTyp);
			boolean ctg = isSame(srchTyp, MGC_COST_COPY_TYP.$TGT_CTG);
			boolean term = isSame(srchTyp, MGC_COST_COPY_TYP.$TGT_TERM);
			boolean pln = isSame(srchTyp, MGC_COST_COPY_TYP.$TGT_PLN);
			boolean act = isSame(srchTyp, MGC_COST_COPY_TYP.$TGT_ACT);

			for (MGC_COST_COPY_TYP typ : MGC_COST_COPY_TYP.array()) {
				if(tabCtg){
					if(!isSame(tabCtgTyp, typ.tab_ctg_typ())){
						continue;
					}
				}
				if(ctg){
					if (!typ.tgt_ctg()) {
						continue;
					}
				}
				else if(term){
					if (!typ.tgt_term()) {
						continue;
					}
				}
				else if(pln){
					if (!typ.tgt_pln()) {
						continue;
					}
				}
				else if(act){
					if (!typ.tgt_act()) {
						continue;
					}
				}
				MCRow r = MCRow.create();
				r.addStringColumn(CostCopyTypCols.$o_cost_copy_typ, typ.value());
				r.addStringColumn(CostCopyTypCols.$o_cost_copy_typ_nm, typ.name());
				list.add(r);
			}

			return list;
		}
		// -- CostCopyTyp:原価コピー対象区分(END)
		// -- TabCtgTyp:テーブルカテゴリ区分(START)
		@Override
		protected void getTabCtgTyp_Sort(MCList<MCRow> down, MCEventInfo info) {
			for(MCRow r : down){
				r.setValueNE(TabCtgTypCols.$o_list_sort,
						MGC_TAB_CTG_TYP.list_sort(r.getStringNE(TabCtgTypCols.$o_tab_ctg_typ)));
			}
			down.sort(TabCtgTypCols.$o_list_sort);
		}
		// -- TabCtgTyp:テーブルカテゴリ区分(END)
}
