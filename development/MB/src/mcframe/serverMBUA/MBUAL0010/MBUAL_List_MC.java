package mcframe.serverMBUA.MBUAL0010;

import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonMA.constant.MAC_MST_NM;
import mcframe.commonMA.constant.MAC_MST_SET_TYP;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMAUD.MAUDL6010.MAUDL_RLUtil;
import mcframe.serverMB.dbc.MBC_BULK_IMP_CTG_R;
import mcframe.serverMB.dbc.MBC_BULK_IMP_CTL_R;

abstract public class MBUAL_List_MC extends MBUAL_List_MC_A {

	// -- BulkImpCtl:まとめ登録テーブルＩＤ (START)
	/** マスタ制御区分取得用 */
	protected String _bpMstSetTyp;
	@Override
	protected void getBulkImpCtl_Set(MCRow row, MCQueryApiBuilder builder, MBC_BULK_IMP_CTL_R t, MCList<?> result) {
		MBC_BULK_IMP_CTG_R ctg = MBC_BULK_IMP_CTG_R.create("CTG");

		super.getBulkImpCtl_Set(row, builder, t, result);
		builder.addLeftOuterJoin(ctg, ctg.table_ctg.eq(t.table_ctg));
		builder.addSelect(ctg.table_ctg_seq.as(BulkImpCtlCols.$o_table_ctg_seq));
		builder.addWhereWithCutOffAnd(t.table_ctg.like(bind("1")),
				row.getStringNE(BulkImpCtlCols.$i_table_ctg));
		builder.addWhereWithCutOffAnd(ctg.table_ctg_nm.like(bind("1")),
				row.getStringNE(BulkImpCtlCols.$i_table_ctg_nm));
		if(MAC_MST_SET_TYP.isALL_COM_COM(getBpMstSetTyp())) {
			builder.addWhereWithAnd(t.table_id.notLike(value("MAM_BP_")));
			builder.addWhereWithAnd(t.table_id.notLike(value("MAM_BP1_")));
		} else {
			builder.addWhereWithAnd(substr(t.table_id, value(0), value(10)).neq(value("MAM_BP_ALL")));
			builder.addWhereWithAnd(substr(t.table_id, value(0), value(10)).neq(value("MAM_BP_CMN")));
		}
	}
	/** 取引先マスタのマスタ制御区分を取得する*/
	protected String getBpMstSetTyp() {
		if (_bpMstSetTyp == null) {
			MAUDL_RLUtil.Srch01 o = MAUDL_RLUtil.crtSrch01();
			o.up0().mst_nm(MAC_MST_NM.MAM_BP.value());
			o.exec();
			_bpMstSetTyp = o.down0().mst_set_typ();
		}
		return _bpMstSetTyp;
	}
	// -- BulkImpCtl:まとめ登録テーブルＩＤ (END)
}
