package mcframe.serverMAUC.MAUCL0010;

import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;

abstract public class MAUCL_ItmUnitListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 品目単位マスタの情報を取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>unit_cd</td><td>単位ＣＤ</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 品目単位マスタの情報
	 */
	public MCRow _getItmUnit(MCRow up) {
		MAVM_ITM_UNIT_R dbc = MAVM_ITM_UNIT_R.create();
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MAM_UNIT_R m = MAM_UNIT_R.create("M");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

		dbc_bldr.setSelect(t.itm_cd);
		dbc_bldr.addSelect(t.itm_sub1);
		dbc_bldr.addSelect(t.itm_sub2);
		dbc_bldr.addSelect(t.itm_sub3);
		dbc_bldr.addSelect(t.unit_cd);
		dbc_bldr.addSelect(m.unit_nm);
		dbc_bldr.addSelect(t.conv_base_qty);
		dbc_bldr.addSelect(t.conv_qty);
		dbc_bldr.addSelect(t.dec_place);
		dbc_bldr.addSelect(t.rnd_typ);
		dbc_bldr.addSelect(t.pack_flg);
		dbc_bldr.addSelect(t.pckg_flg);
		dbc_bldr.addSelect(t.unit_dim);
		dbc_bldr.addSelect(t.unit_wt);
		dbc_bldr.addSelect(t.base_unit_flg);

		dbc_bldr.addLeftOuterJoin(m, m.unit_cd.eq(t.unit_cd));

		dbc_bldr.setWhere(t.itm_cd.eq(bind("1")), up.getString("itm_cd"));
		dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), up.getString("itm_sub1"));
		dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), up.getString("itm_sub2"));
		dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), up.getString("itm_sub3"));
		dbc_bldr.addWhereWithAnd(t.unit_cd.eq(bind("1")), up.getString("unit_cd"));

		dbSelect(createSqlId("MAUCL0010", t, "MAUCL_ItmUnitListLogic_S01"), dbc, dbc_bldr);

		String addUnitCd = up.getStringNE("add_unit_cd");
		if (!isNullOr(dbc.unit_cd(), addUnitCd)) {
			if (isSame(dbc.unit_cd(), addUnitCd)) {
				dbc.addNumberColumn("add_unit_dec_place", dbc.dec_place());
				dbc.addStringColumn("add_unit_rnd_typ", dbc.rnd_typ());
			}
			else {
				MAVM_ITM_UNIT_R addUnitDbc = MAVM_ITM_UNIT_R.create();
				MAVM_ITM_UNIT_R t2 = MAVM_ITM_UNIT_R.create("T2");
				MCQueryApiBuilder dbc_bldr2 = MCQueryApiBuilder.create(t2);
				
				dbc_bldr2.setSelect(t2.unit_cd);
				dbc_bldr2.addSelect(t2.dec_place);
				dbc_bldr2.addSelect(t2.rnd_typ);
				
				dbc_bldr2.setWhere(t2.itm_cd.eq(bind("1")), up.getString("itm_cd"));
				dbc_bldr2.addWhereWithAnd(t2.itm_sub1.eq(bind("1")), up.getString("itm_sub1"));
				dbc_bldr2.addWhereWithAnd(t2.itm_sub2.eq(bind("1")), up.getString("itm_sub2"));
				dbc_bldr2.addWhereWithAnd(t2.itm_sub3.eq(bind("1")), up.getString("itm_sub3"));
				dbc_bldr2.addWhereWithAnd(t2.unit_cd.eq(bind("1")), addUnitCd);
				
				dbSelect(createSqlId("MAUCL0010", t, "MAUCL_ItmUnitListLogic_S02"), addUnitDbc, dbc_bldr2);
				
				dbc.addNumberColumn("add_unit_dec_place", addUnitDbc.dec_place());
				dbc.addStringColumn("add_unit_rnd_typ", addUnitDbc.rnd_typ());
			}
		}

		return dbc;
	}

}
