package mcframe.serverMSUC.MSUCL0030;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;

abstract public class MSUCL_ProdListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 引数の品目で利用可能なロス理由のリストを取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return ロス理由のリスト　(値が格納されているカラム名：ross_rsn_cd, ross_rsn_nm, fxd_loss_flg, def_disp_flg)
	 */
	public MCList<MCRow> _getLossRsnList(MCRow up) {

		MCList<MCRow> ret = MCList.create(MCRow.class);
		ret.addBooleanColumn("fxd_loss_flg");
		ret.addBooleanColumn("def_disp_flg");

		MAM_LOSS_RSN_R t = MAM_LOSS_RSN_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		MAM_ITM_R t2 = MAM_ITM_R.create("T2");
		MAM_BIZ_RSN_R t3 = MAM_BIZ_RSN_R.create("T3");

		builder.setSelect(t.loss_rsn_cd);
		builder.addSelect(t3.biz_rsn_nm.as("loss_rsn_nm"));
		builder.addSelect(t.def_disp_flg);
		builder.addSelect(t3.fxd_loss_flg);
		builder.addInnerJoin(t2, t.itm_typ.eq(t2.itm_typ) .and(t.itm_typ_d_cd.eq(t2.itm_typ_d_cd)));
		builder.addInnerJoin(t3, t.loss_rsn_cd.eq(t3.biz_rsn_cd));
		builder.setWhere(t2.itm_cd.eq(bind("itm_cd")));
		builder.addWhereWithAnd(t2.itm_sub1.eq(bind("itm_sub1")));
		builder.addWhereWithAnd(t2.itm_sub2.eq(bind("itm_sub2")));
		builder.addWhereWithAnd(t2.itm_sub3.eq(bind("itm_sub3")));
		dbSelect(createSqlId("MSUCL0030", t, "MSUCL_ProdListLogic_S01"), ret, builder, up);

		return ret;
	}
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 引数の品目＋ＷＧから所要区分を取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>wg_cd</td><td>ワーキンググループＣＤ</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 所要区分　(値が格納されているカラム名：rqmt_typ)
	 */
	public MCRow _getRqmtTyp(MCRow up) {
		MCRow ret = MCRow.create();

		MAVM_ITM_WG_R t = MAVM_ITM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setSelect(t.rqmt_typ);
		dbSelectKey(createSqlId("MSUCL0030", t, "MSUCL_ProdListLogic_S02"), ret, builder, up);

		return ret;
	}
}
