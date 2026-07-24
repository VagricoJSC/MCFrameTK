package mcframe.serverMABS.MABSL0080;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABS.MABSL0080.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import java.util.List;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_AltItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_AltItmReg_MC extends MABSL_AltItmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AltItm_UpdChk01オペレーション.<p>
	 *
	 * 代替品目マスタの登録前のチェックを行います。<br>
	 */
	public class AltItm_UpdChk01 extends MABSL_AltItmReg_MC_A.AltItm_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					AltItm_UpdChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();
			
			// 代替グループマスタ取得
			initAltGrpCache(up0());
			
			for (AltItm_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}
				MAM_ALT_GRP__R altGrpR = getAltGrpR(r.wg_cd(), r.alt_grp_cd());
				if (altGrpR == null) {
					msgList.add(new MCMessage(r, AltItm_UpdChk01_DtlR.$alt_grp_cd, MABSL0063, r.wg_cd(), r.alt_grp_cd(), toDispGUIIndex(r)));
				}
				else {
					if (MAC_ALT_ITM_TYP.isMIX(altGrpR.alt_itm_typ()) && !r.fxd_chd_rqmt_qty().isZero()){
						msgList.add(new MCMessage(r, AltItm_UpdChk01_DtlR.$fxd_chd_rqmt_qty, MABSL0126, toDispGUIIndex(r)));
					}
				}
				
				if (r.chd_inpt_ratio().isZero() && r.fxd_chd_rqmt_qty().isZero()) {
					msgList.add(new MCMessage(r, AltItm_UpdChk01_DtlR.$chd_rqmt_ratio, MABSL0184, toDispGUIIndex(r)));
				}
				
				if (r.chd_rqmt_ratio().isZero() && r.fxd_chd_rqmt_qty().isZero()) {
					msgList.add(new MCMessage(r, AltItm_UpdChk01_DtlR.$chd_rqmt_ratio, MABSL0199, toDispGUIIndex(r)));
				}

				msgList.addAll(checkDecPlace(r, AltItm_UpdChk01_DtlR.$dec_place, AltItm_UpdChk01_DtlR.$fxd_chd_rqmt_qty));
			}
			return msgList;
		}
	}
	/**
	 * AltItm_Upd01オペレーション.<p>
	 *
	 * 代替品目マスタの登録を行います。<br>
	 */
	public class AltItm_Upd01 extends MABSL_AltItmReg_MC_A.AltItm_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbL) {
			super.afterUpdate(dbL);

			// 品目マスタ取得
			initItmCache(dbL);

			for (R r : dbL) {
				if (r instanceof MAM_ALT_ITM_R) {
					// 有効成分対象同値チェック
					checkContFctr((MAM_ALT_ITM_R) r);
				}
			}
		}

		/**
		 * 同一組み合わせで有効成分対象が同値であるかチェックします。
		 * 
		 * @param r ＤＢコンテナ
		 */
		protected <R extends MCRow> void checkContFctr(MAM_ALT_ITM_R r) {
			
			// 削除フラグがオンは対象外
			if (r.del_flg()) {
				return;
			}
			MAM_ITM__R itmR = getItmR(r.chd_itm_cd(), r.chd_itm_sub1(), r.chd_itm_sub2(), r.chd_itm_sub3());
			if (itmR != null) {
				// 有効成分対象の異なるレコードを検索
				r.setBooleanNE(MAM_ITM__R.$cont_fctr_flg, itmR.cont_fctr_flg());
				MAM_ITM_R S1W = MAM_ITM_R.create("W");
				MAM_ALT_ITM_R t = MAM_ALT_ITM_R.create("T");
				int i = execDbCount("MABSL0080_MAM_ALT_ITM_S01", t,
						t.wg_cd.eq(bind("wg_cd"))
						.and(t.alt_grp_cd.eq(bind("alt_grp_cd")))
						.and(t.st_dt.neq(bind("st_dt")))
						.and(t.st_dt.lte(bind("end_dt")))
						.and(t.end_dt.gte(bind("st_dt")))
						.and(t.del_flg.eq(value(false)))
						.and( exists( subQuery() .select(S1W.prAll()).from(S1W)
								.where( S1W.itm_cd.eq(t.chd_itm_cd)
										.and(S1W.itm_sub1.eq(t.chd_itm_sub1))
										.and(S1W.itm_sub2.eq(t.chd_itm_sub2))
										.and(S1W.itm_sub3.eq(t.chd_itm_sub3))
										.and(S1W.cont_fctr_flg.neq(bind("cont_fctr_flg"))) ) )), r);
				if (i > 0) {
					getMsgList().add(new MCMessage(r, MAM_ALT_ITM_R.$chd_itm_cd, MABSL0011, toDispGUIIndex(r)));
				}
			}
		}

	}
	/**
	 * AltGrp_DelChk01オペレーション.<p>
	 *
	 * 代替グループマスタの削除前のチェックを行います。<br>
	 */
	public class AltGrp_DelChk01 extends MABSL_AltItmReg_MC_A.AltGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					AltGrp_DelChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
	}
	/**
	 * AltGrp_Del01オペレーション.<p>
	 *
	 * 代替グループマスタの削除を行います。<br>
	 */
	public class AltGrp_Del01 extends MABSL_AltItmReg_MC_A.AltGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(
				MCQueryApiBuilder builder, MCList<R> list, boolean updChk) {
			
			if (list.createRow() instanceof MAM_ALT_ITM_R) {
				// MAM_ALT_ITM_に対しdelete を実行
				MAM_ALT_ITM_R S0T = MAM_ALT_ITM_R.create("T");
				MCDelete q = sql("MABSL0080_MAM_ALT_ITM_D01")
					.delete(S0T)
					.where(value(0).eq(value(0))
							.cutoff$and(S0T.alt_grp_cd.eq(bind("alt_grp_cd")))
							.cutoff$and(S0T.chd_itm_cd.eq(bind("chd_itm_cd")))
							.cutoff$and(S0T.chd_itm_sub1.eq(bind("chd_itm_sub1")))
							.cutoff$and(S0T.chd_itm_sub2.eq(bind("chd_itm_sub2")))
							.cutoff$and(S0T.chd_itm_sub3.eq(bind("chd_itm_sub3")))
							.cutoff$and(S0T.ver_no.eq(bind("ver_no")))
							.cutoff$and(S0T.wg_cd.eq(bind("wg_cd")))
							.cutoff$and(S0T.st_dt.eq(bind("st_dt")))
							.cutoff$and(S0T.end_dt.eq(bind("end_dt")))
							.cutoff$and(S0T.chd_inpt_ratio.eq(bind("chd_inpt_ratio")))
							.cutoff$and(S0T.chd_rqmt_ratio.eq(bind("chd_rqmt_ratio")))
							.cutoff$and(S0T.fxd_chd_rqmt_qty.eq(bind("fxd_chd_rqmt_qty")))
							.cutoff$and(S0T.alt_itm_ratio.eq(bind("alt_itm_ratio")))
							.cutoff$and(S0T.alt_alloc_prio.eq(bind("alt_alloc_prio")))
							.cutoff$and(S0T.memo1.eq(bind("memo1")))
							.cutoff$and(S0T.memo2.eq(bind("memo2")))
							.cutoff$and(S0T.memo3.eq(bind("memo3")))
							.cutoff$and(S0T.del_usr_id.eq(bind("del_usr_id")))
							.cutoff$and(S0T.del_usr_nm.eq(bind("del_usr_nm")))
							.cutoff$and(S0T.del_ts.eq(bind("del_ts")))
							.cutoff$and(S0T.ins_usr_id.eq(bind("ins_usr_id")))
							.cutoff$and(S0T.ins_usr_nm.eq(bind("ins_usr_nm")))
							.cutoff$and(S0T.ins_ts.eq(bind("ins_ts")))
							.cutoff$and(S0T.ins_func_id.eq(bind("ins_func_id")))
							.cutoff$and(S0T.upd_cntr.eq(bind("upd_cntr")))
							.cutoff$and(S0T.upd_usr_id.eq(bind("upd_usr_id")))
							.cutoff$and(S0T.upd_usr_nm.eq(bind("upd_usr_nm")))
							.cutoff$and(S0T.upd_ts.eq(bind("upd_ts")))
							.cutoff$and(S0T.upd_func_id.eq(bind("upd_func_id")))
							.cutoff$and(S0T.upd_srv_req_no.eq(bind("upd_srv_req_no")))
					);
				q.executeBatchUpdate(list);
			}
			else {
				super.dbLockDelUpdInsByStatusCheck(builder, list, updChk);
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 代替グループマスタ、代替品目マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_AltItmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ALT_GRP__R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder, MCList<R> rslt) {
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			MAM_ALT_GRP__R t = MAM_ALT_GRP__R.create(builder.getBaseDbcAlias());

			if (up0().cmn_flg() == up0().wg_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
						.or(exists(subQuery().select(S1WG2.prAll()).from(S1WG2)
								.where(value(0).eq(value(0))
										.and(t.wg_cd.eq(S1WG2.wg_cd))))));
			}
			else if (up0().cmn_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())));
			}
			else if (up0().wg_flg()) {
				builder.addWhereWithAnd(
						exists(subQuery().select(S1WG2.prAll()).from(S1WG2)
								.where(value(0).eq(value(0))
										.and(t.wg_cd.eq(S1WG2.wg_cd)))));
			}

			if (!isNullAnd(up0().chd_itm_cd(), up0().chd_itm_sub1(), up0().chd_itm_sub2(),
					up0().chd_itm_sub3(), up0().chd_itm_nm())) {

				MAM_ITM__R S1ITM1 = MAM_ITM__R.create("ITM1");
				MAM_ALT_ITM_R S1ALT_ITM1 = MAM_ALT_ITM_R.create("ALT_ITM1");
				builder.addWhereWithAnd(exists(subQuery()
						.select(S1ALT_ITM1.prAll(), S1ITM1.prAll())
						.from(S1ALT_ITM1.leftOuterJoin(S1ITM1)
								.on(bracket(S1ALT_ITM1.chd_itm_cd.eq(S1ITM1.itm_cd)
										.and(S1ALT_ITM1.chd_itm_sub1.eq(S1ITM1.itm_sub1))
										.and(S1ALT_ITM1.chd_itm_sub2.eq(S1ITM1.itm_sub2))
										.and(S1ALT_ITM1.chd_itm_sub3.eq(S1ITM1.itm_sub3)))))
						.where(S1ALT_ITM1.alt_grp_cd.eq(t.alt_grp_cd)
								.cutoff$and(
										S1ALT_ITM1.chd_itm_cd.like(bind("chd_itm_cd")))
								.cutoff$and(S1ALT_ITM1.chd_itm_sub1
										.like(bind("chd_itm_sub1")))
								.cutoff$and(S1ALT_ITM1.chd_itm_sub2
										.like(bind("chd_itm_sub2")))
								.cutoff$and(S1ALT_ITM1.chd_itm_sub3
										.like(bind("chd_itm_sub3")))
								.cutoff$and(S1ITM1.itm_nm.like(bind("chd_itm_nm"))))));
			}
		}

		@Override
		protected List<String> getSelectLclGrpNames() {
			List<String> l = new ArrayList<String>();
			l.add("SELECT_ITM");
			l.addAll(super.getSelectLclGrpNames());
			return l;
		}
		@Override
		protected List<String> getOtherSelectGrpNames() {
			return new ArrayList<String>();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomizeLcl(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomizeLcl(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ALT_ITM_R) {
				dbcCustomizeLclSub(builder, rslt);
			}
		}
		
		protected <R extends MCDBContainer> void dbcCustomizeLclSub(MCQueryApiBuilder builder, MCList<R> rslt) {
			
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ALT_ITM_R.$ITM1);
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			MAM_ALT_ITM_R t = MAM_ALT_ITM_R.create(builder.getBaseDbcAlias());

			builder.addLeftOuterJoin(itm1,
					t.chd_itm_cd.eq(itm1.itm_cd)
					.and(t.chd_itm_sub1.eq(itm1.itm_sub1))
					.and(t.chd_itm_sub2.eq(itm1.itm_sub2))
					.and(t.chd_itm_sub3.eq(itm1.itm_sub3)));
			builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
			builder.addSelect(itm1.itm_nm.as("chd_itm_nm"));
			builder.addSelect(itm1.unit_cd);
			builder.addSelect(itm1.dec_place);
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itmtypd1.itm_typ_d_nm);
			builder.addSelect(itm1.ver_flg);
			rslt.addBooleanColumn("ver_flg");
			builder.addSelect(itm1.cont_fctr_flg);
			rslt.addBooleanColumn("cont_fctr_flg");
		
		}
	
		@Override
		protected void down_SELECT_ITM_c1_0(Srch01_Rslt2R r_dest, MAM_ALT_ITM_R r_src) {
			super.down_SELECT_ITM_c1_0(r_dest, r_src);

			// 定数．ＩＦ処理区分名
			MAUCL_MCDataUtil.setConstNm(r_dest);
			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(r_dest);
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 代替グループマスタ、代替品目マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_AltItmReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AltGrp_UpdChk01オペレーション.<p>
	 *
	 * 代替グループマスタの登録前のチェックを行います。<br>
	 */
	public class AltGrp_UpdChk01 extends MABSL_AltItmReg_MC_A.AltGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					AltGrp_UpdChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			// 代替品目マスタ取得
			// 代替品目選択区分：混在可の代替グループに対する子固定必要数量＜＞０のレコードを取得
			initAltItmCache(up0());

			for (AltGrp_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}

				if (MAC_ALT_ITM_TYP.isMIX(r.alt_itm_typ())) {
					MAM_ALT_ITM_R altItmR = getAltItmR(r.wg_cd(), r.alt_grp_cd());
					if (altItmR != null) {
						msgList.add(new MCMessage(r, AltGrp_UpdChk01_DtlR.$alt_itm_typ, MABSL0077, toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
	}
	/**
	 * AltGrp_Upd01オペレーション.<p>
	 *
	 * 代替グループマスタの登録を行います。<br>
	 */
	public class AltGrp_Upd01 extends MABSL_AltItmReg_MC_A.AltGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 代替グループマスタ、代替品目マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_AltItmReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	
	// ///////////////////////////////////////////////
		// マスタ取得（ここから）
		// ///////////////////////////////////////////////
		protected static final Class<MABSL_AltItmReg> CLAZZ = MABSL_AltItmReg.class;

		/**
		 * 代替グループマスタの主キーワークテーブル作成
		 */
		protected void insAltGrpWk(MCList<? extends MCRow> bindL) {
			MAW_ALT_GRP_KEY_R S0T1 = MAW_ALT_GRP_KEY_R.create("T");

			dbWkDelete("MABSL0080_MAW_ALT_GRP_KEY_D01", MAM_ALT_GRP_R.create());
			
			MCInsert q1 = sql("MABSL0080_MAW_ALT_GRP_KEY_I01")
				.insert(S0T1)
				.columns(
					S0T1.alt_grp_cd,
					S0T1.wg_cd
				)
				.values(
					bind("alt_grp_cd"),
					bind("wg_cd")
				);
			q1.executeBatchUpdate(bindL);
		}
		/**
		 * 「MAM_ALT_GRP_」取得
		 */
		MCList<MAM_ALT_GRP__R> _altGrpL;
		MCIndexKey _altGrpKey;
		protected void initAltGrpCache(MCList<AltItm_UpdChk01_DtlR> dtlL) {
			// ワーク作成
			insAltGrpWk(dtlL);

			// 検索
			MAW_ALT_GRP_KEY_R S1W = MAW_ALT_GRP_KEY_R.create("W");
			MCList<MAM_ALT_GRP__R> dbc = MCList.create(MAM_ALT_GRP__R.class);
			MAM_ALT_GRP__R t = MAM_ALT_GRP__R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setSelect(t.wg_cd, t.alt_grp_cd, t.alt_itm_typ);
			builder.setWhere(value(0).eq(value(0)));
			builder.addWhereWithAnd(exists( subQuery().select(value("X")) .from(S1W)
					.where( S1W.wg_cd.eq(t.wg_cd)
							.and(S1W.alt_grp_cd.eq(t.alt_grp_cd)) )));
			dbSelect("MABSL0080_MAM_ALT_GRP__S01", dbc, builder);

			// インデックス作成
			object(CLAZZ)._altGrpL = dbc;
			object(CLAZZ)._altGrpKey = object(CLAZZ)._altGrpL.createIndex(
					MAM_ALT_GRP__R.$wg_cd,
					MAM_ALT_GRP__R.$alt_grp_cd
			);
		}

		protected MAM_ALT_GRP__R getAltGrpR(String wgCd, String altGrpCd) {
			return object(CLAZZ)._altGrpL.getFirst(object(CLAZZ)._altGrpKey, wgCd, altGrpCd);
		}

		/**
		 * 「MAM_ALT_ITM_」取得
		 * 代替品目選択区分：混在可の代替グループに対する代替品目の子固定必要数量＝０をチェックするために使用
		 */
		MCList<MAM_ALT_ITM_R> _altItmL;
		MCIndexKey _altItmKey;
		protected void initAltItmCache(MCList<AltGrp_UpdChk01_DtlR> dtlL) {
			// ワーク作成
			insAltGrpWk(dtlL.subList(r -> MAC_ALT_ITM_TYP.isMIX(r.alt_itm_typ())));

			// 検索
			MCList<MAM_ALT_ITM_R> dbc = MCList.create(MAM_ALT_ITM_R.class);
			MAM_ALT_ITM_R t = MAM_ALT_ITM_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			MAW_ALT_GRP_KEY_R S1W = MAW_ALT_GRP_KEY_R.create("W");
			
			builder.setGroupBy(t.wg_cd, t.alt_grp_cd);
			builder.setWhere(exists( subQuery() .select(value("X")) .from(S1W)
					.where( S1W.wg_cd.eq(t.wg_cd)
							.and(S1W.alt_grp_cd.eq(t.alt_grp_cd)) )));
			builder.addWhereWithAnd(t.fxd_chd_rqmt_qty.neq(value(0)));
			dbSelect("MABSL0080_MAM_ALT_ITM_S02", dbc, builder);

			// インデックス作成
			object(CLAZZ)._altItmL = dbc;
			object(CLAZZ)._altItmKey = object(CLAZZ)._altItmL.createIndex(
					MAM_ALT_ITM_R.$wg_cd, MAM_ALT_ITM_R.$alt_grp_cd
			);
		}

		protected MAM_ALT_ITM_R getAltItmR(String wgCd, String altGrpCd) {
			return object(CLAZZ)._altItmL.getFirst(object(CLAZZ)._altItmKey, wgCd, altGrpCd);
		}

		/**
		 * 品目マスタの主キーワークテーブル作成
		 */
		protected void insItmWk(MCList<? extends MCRow> bindL) {
			MAW_ITM_KEY_R S0T = MAW_ITM_KEY_R.create("T");

			dbWkDelete("MABSL0080_MAW_ITM_KEY_D01", MAM_ITM_R.create());
			MCInsert q1 = sql("MABSL0080_MAW_ITM_KEY_I01")
					.insert(S0T)
					.columns(
						S0T.itm_cd,
						S0T.itm_sub1,
						S0T.itm_sub2,
						S0T.itm_sub3
					)
					.values(
						bind("chd_itm_cd"),
						bind("chd_itm_sub1"),
						bind("chd_itm_sub2"),
						bind("chd_itm_sub3")
					);
			q1.executeBatchUpdate(bindL);
		}
		/**
		 * 「MAM_ITM_」取得（有効成分対象を取得）
		 */
		MCList<MAM_ITM__R> _itmL;
		MCIndexKey _itmKey;
		protected void initItmCache(MCList<? extends MCRow> dtlL) {
			// ワーク作成
			insItmWk(dtlL);
			
			// 検索
			MCList<MAM_ITM__R> dbc = MCList.create(MAM_ITM__R.class);
			MAM_ITM__R t = MAM_ITM__R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			MAW_ITM_KEY_R S1W = MAW_ITM_KEY_R.create("W");
			
			builder.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.cont_fctr_flg);
			builder.setWhere(exists(subQuery().select(value("X")).from(S1W)
					.where(S1W.itm_cd.eq(t.itm_cd)
							.and(S1W.itm_sub1.eq(t.itm_sub1))
							.and(S1W.itm_sub2.eq(t.itm_sub2))
							.and(S1W.itm_sub3.eq(t.itm_sub3)))));
			dbSelect("MABSL0080_MAM_ITM__S01", dbc, builder);
	
			// インデックス作成
			object(CLAZZ)._itmL = dbc;
			object(CLAZZ)._itmKey = object(CLAZZ)._itmL.createIndex(MAM_ITM__R.$itm_cd,
					MAM_ITM__R.$itm_sub1, MAM_ITM__R.$itm_sub2, MAM_ITM__R.$itm_sub3);
		}

		protected MAM_ITM__R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return object(CLAZZ)._itmL.getFirst(object(CLAZZ)._itmKey, itmCd, itmSub1, itmSub2, itmSub3);
		}
		// ///////////////////////////////////////////////
		// マスタ取得（ここまで）
		// ///////////////////////////////////////////////

	//FMCB CUSTOM END
}