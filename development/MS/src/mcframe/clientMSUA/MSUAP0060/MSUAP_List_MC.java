package mcframe.clientMSUA.MSUAP0060;

import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMS.constant.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.commonMSUA.MSUAC0060.MSUAC_List.*;
import mcframe.clientCore.resource.MCConfig;

abstract public class MSUAP_List_MC extends MSUAP_List_MC_A {

	@Override
	protected MCList<MCRow> getStkIdTyp_GetList(MCRow row, MCEventInfo info) {
		String gi_sppl_cd = row.getStringNE(StkIdTypCols.$i_gi_sppl_cd);
		String gr_sppl_cd = row.getStringNE(StkIdTypCols.$i_gr_sppl_cd);
		boolean iv_trd_flg = row.getBooleanNE(StkIdTypCols.$i_iv_trd_flg);
		boolean xfr_act_flg = row.getBooleanNE(StkIdTypCols.$i_xfr_flg);
		boolean ship_act_flg = row.getBooleanNE(StkIdTypCols.$i_ship_flg);

		MCList<MCRow> list = MCList.create(MCRow.class);
		// インボイス取引対象である
		if (iv_trd_flg) {
			for (MCRow r : super.getStkIdTyp_GetList(row, info)) {
				String val = r.getStringNE(StkIdTypCols.$o_stk_id_typ);
				//　自社 to 自社
				if (isNull(gi_sppl_cd) && isNull(gr_sppl_cd)) {
					if (MSC_STK_ID_TYP.isCOSTK(val)
							|| MSC_STK_ID_TYP.isRNT_RCV(val)
							|| MSC_STK_ID_TYP.isACCPT_DFCT(val)
							|| MSC_STK_ID_TYP.isNCV_RCV(val)) {
						list.add(r);
					}
				}
				//　自社 to 外注
				else if (isNull(gi_sppl_cd) && !isNull(gr_sppl_cd)) {
					if (MSC_STK_ID_TYP.isCOSTK(val)
							|| MSC_STK_ID_TYP.isRNT_RCV(val)
							|| MSC_STK_ID_TYP.isNCV_RCV(val)) {
						list.add(r);
					}
				}
				// 外注 to 外注
				else if (!isNull(gi_sppl_cd) && !isNull(gr_sppl_cd)) {
					if (MSC_STK_ID_TYP.isCOSTK(val)
							|| MSC_STK_ID_TYP.isNCV_RCV(val)
							|| MSC_STK_ID_TYP.isONR_PROV(val)) {
						list.add(r);
					}
				}
			}
		}
		// インボイス取引対象でない
		else {
			for (MCRow r : super.getStkIdTyp_GetList(row, info)) {
				String val = r.getStringNE(StkIdTypCols.$o_stk_id_typ);
				// 自社 to 自社
				if (isNull(gi_sppl_cd) && isNull(gr_sppl_cd)) {
					if (MSC_STK_ID_TYP.isCOSTK(val)
							|| MSC_STK_ID_TYP.isRNT_RCV(val)
							|| MSC_STK_ID_TYP.isACCPT_DFCT(val)
							|| MSC_STK_ID_TYP.isNCV_RCV(val)) {
						list.add(r);
					}
					if (xfr_act_flg) {
						if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(val)) {
							list.add(r);
						}
						if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(val)) {
							list.add(r);
						}
					}
					if (ship_act_flg) {
						if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(val)) {
							list.add(r);
						}
						if (MSC_STK_ID_TYP.isCSTSTK(val)) {
							list.add(r);
						}
					}
				}
				// 自社 to 外注
				else if (isNull(gi_sppl_cd) && !isNull(gr_sppl_cd)) {
					if (MSC_STK_ID_TYP.isCOSTK(val)
							|| MSC_STK_ID_TYP.isRNT_RCV(val)
							|| MSC_STK_ID_TYP.isNCV_RCV(val)) {
						list.add(r);
					}
				}
				// 外注 to 自社
				else if (!isNull(gi_sppl_cd) && isNull(gr_sppl_cd)) {
					if (MSC_STK_ID_TYP.isCOSTK(val)
							|| MSC_STK_ID_TYP.isACCPT_DFCT(val)
							|| MSC_STK_ID_TYP.isNCV_RCV(val)
							|| MSC_STK_ID_TYP.isONR_PROV(val)) {
						list.add(r);
					}
				}
				// 外注 to 外注 (同一発注先かどうかによらず)
				else if (!isNull(gi_sppl_cd) && !isNull(gr_sppl_cd)) {
					if (MSC_STK_ID_TYP.isCOSTK(val)
							|| MSC_STK_ID_TYP.isNCV_RCV(val)
							|| MSC_STK_ID_TYP.isONR_PROV(val)) {
						list.add(r);
					}
				}
			}
		}
		return list;
	}

	@Override
	protected MCList<MCRow> getProvTyp_GetList(MCRow row, MCEventInfo info) {
		boolean onr_prsppl_flg = row.getBooleanNE(ProvTypCols.$i_onr_prsppl_flg);
		String asset_mng_typ = row.getStringNE(ProvTypCols.$i_asset_mng_typ);

		MCList<MCRow> list = MCList.create(MCRow.class);
		for (MCRow r : super.getProvTyp_GetList(row, info)) {
			String val = r.getStringNE(ProvTypCols.$o_prov_typ);
			if (MAC_PROV_TYP.isONR_PROV(val)
					&& onr_prsppl_flg
					&& MAC_ASSET_MNG_TYP.isMNG(asset_mng_typ)) {
				list.add(r);
			}
			else if (MAC_PROV_TYP.isFFR_PROV(val)) {
				list.add(r);
			}
		}
		return list;
	}

}
