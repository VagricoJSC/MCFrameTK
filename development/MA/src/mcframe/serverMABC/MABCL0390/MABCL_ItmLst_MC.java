package mcframe.serverMABC.MABCL0390;

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
import mcframe.serverMABC.MABCL0390.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import java.util.List;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.sys.MCSys;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ItmLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ItmLst_MC extends MABCL_ItmLst_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmLst_UpdChk01オペレーション.<p>
	 *
	 * 品目マスタ（共通）の登録前のチェックを行います。<br>
	 */
	public class ItmLst_UpdChk01 extends MABCL_ItmLst_MC_A.ItmLst_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			// システムパラメータを取得
			int itmSubTyp = Integer.parseInt(getSysParm("ITM_SUB_TYP"));

			for(ItmLst_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.itm_cd())){
					msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$itm_cd, MABCL0306, 
									getLabel(row, ItmLst_UpdChk01_DtlR.$itm_cd), row.itm_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}

				if (itmSubTyp < 0 || itmSubTyp > 3) {
					itmSubTyp = 0;
				}
				
				if (itmSubTyp < 1 && !isNullOrNullVal(row.itm_sub1())) {
					msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$itm_sub1, MABCL0321, 
							getLabel(row, "ITM_SUB_TYP"), getLabel(row, ItmLst_UpdChk01_DtlR.$itm_sub1), toDispGUIIndex(row)));
				}
				if (itmSubTyp < 2 && !isNullOrNullVal(row.itm_sub2())) {
					msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$itm_sub2, MABCL0321, 
							getLabel(row, "ITM_SUB_TYP"), getLabel(row, ItmLst_UpdChk01_DtlR.$itm_sub2), toDispGUIIndex(row)));
				}
				if (itmSubTyp < 3 && !isNullOrNullVal(row.itm_sub3())) {
					msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$itm_sub3, MABCL0321, 
							getLabel(row, "ITM_SUB_TYP"), getLabel(row, ItmLst_UpdChk01_DtlR.$itm_sub3), toDispGUIIndex(row)));
				}

				// 条件付必須チェック
				if (!isNull(row.dim_unit_cd())) {
					msgList.addAll(check(row, ItmLst_UpdChk01_DtlR.$dim, new FXUCL_RequiredValidater()));
				}
				if (!isNull(row.wt_unit_cd())) {
					msgList.addAll(check(row, ItmLst_UpdChk01_DtlR.$wt, new FXUCL_RequiredValidater()));
				}
				if (!isNull(row.conts_unit_cd())) {
					msgList.addAll(check(row, ItmLst_UpdChk01_DtlR.$conts_qty, new FXUCL_RequiredValidater()));
				}
				if (!isNull(row.jan_cd())) {
					msgList.addAll(check(row, ItmLst_UpdChk01_DtlR.$jan_typ, new FXUCL_RequiredValidater()));
				}

				// 固有チェック
				if (MAC_STK_MNG_TYP.isPHANTOM(row.stk_mng_typ())) {
					if (!MAC_ASSET_MNG_TYP.isPHANTOM(row.asset_mng_typ())) {
						msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$asset_mng_typ, MABCL0048, toDispGUIIndex(row)));
					}
					if (row.sundry_itm_flg()) {
						msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$sundry_itm_flg, MABCL0050, toDispGUIIndex(row)));
					}
				}
				if (MAC_ASSET_MNG_TYP.isPHANTOM(row.asset_mng_typ())) {
					if (!MAC_STK_MNG_TYP.isPHANTOM(row.stk_mng_typ())) {
						msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$stk_mng_typ, MABCL0049, toDispGUIIndex(row)));
					}
				}
				if (!MAC_STK_MNG_TYP.isNOT_MNG(row.stk_mng_typ()) || !MAC_ASSET_MNG_TYP.isNOT_MNG(row.asset_mng_typ())) {
					if (row.dscnt_itm_flg()) {
						msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$sundry_itm_flg, MABCL0051, toDispGUIIndex(row)));
					}
				}
				if (MAC_STK_MNG_TYP.isNOT_MNG(row.stk_mng_typ()) && MAC_ASSET_MNG_TYP.isMNG(row.asset_mng_typ())) {
					msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$stk_mng_typ, MABCL0276, toDispGUIIndex(row)));
				}
				if (row.dec_place().gt(row.check_dec_place())) {
					msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$dec_place, MABCL0052, row.unit_cd(), row.dec_place(), row.check_dec_place()));
				}
				if (isNull(row.dim_unit_cd())) {
					if (!isNull(row.dim())) {
						msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$dim, MABCL0053, toDispGUIIndex(row)));
					}
				}
				if (isNull(row.wt_unit_cd())) {
					if (!isNull(row.wt())) {
						msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$wt, MABCL0054, toDispGUIIndex(row)));
					}
				}
				if (isNull(row.conts_unit_cd())) {
					if (!isNull(row.conts_qty())) {
						msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$conts_qty, MABCL0055, toDispGUIIndex(row)));
					}
				}
				if (!isNullOr(row.jan_typ(), row.jan_cd())) {
					if (MAC_JAN_TYP.isJAN(row.jan_typ())) {
						if (MCNumber.valueOf(13).lt(row.jan_cd().length())) {
							msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$jan_cd, MABCL0056, toDispGUIIndex(row)));
						}
					}
					else if (MAC_JAN_TYP.isSHORT_JAN(row.jan_typ())) {
						if (MCNumber.valueOf(8).lt(row.jan_cd().length())) {
							msgList.add(new MCMessage(row, ItmLst_UpdChk01_DtlR.$jan_cd, MABCL0057, toDispGUIIndex(row)));
						}
					}
				}
			}
			return msgList;
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目マスタ一覧の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_ItmLst_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		protected boolean _sundry_on;
		protected boolean _sundry_off;
		protected boolean _own_co_on;
		protected boolean _own_co_off;
		protected boolean _release_on;
		protected boolean _release_off;
		
		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);
			condCustomizeSub((Srch01_CndR) cond);
		}
		
		protected void condCustomizeSub(Srch01_CndR cond){
			_sundry_on = cond.sundry_itm_flg_on();
			_sundry_off = cond.sundry_itm_flg_off();
			_own_co_on = cond.own_co_flg_on();
			_own_co_off = cond.own_co_flg_off();
			_release_on = cond.release_flg_on();
			_release_off = cond.release_flg_off();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_ITM_SRCH_R){
				dbcCustomizeSub(builder, rslt);
			}
		}
		/** 型に対応するWhere句を返します。
		 * 品目マスタ登録画面から検索するSQLはイコール検索に変更する。
		 * */
		@Override
		protected MCPredicate getWhere(MCDataType typ, MCPermColumn col, String bindCol) {
			if (MCDataType.STRING.equals(typ)
					&& isSame(MCSys.request.reqSrcId(), "MABCP0310")) {
				return MCQueryApiBuilder.makeEq(col, bind(bindCol));
			}
			return super.getWhere(typ, col, bindCol);
		}
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			addSelect(builder, rslt);
			addJoinTable(builder);
			addFlgWhere(builder);
		}
		
		protected <R extends MCDBContainer> void addSelect(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			
			// 発番パタン名称の取得
			MAM_NUM_PTN_R num_ptn1 = MAM_NUM_PTN_R.create("NUM_PTN1");
			MAM_NUM_PTN_R num_ptn2 = MAM_NUM_PTN_R.create("NUM_PTN2");
			MAM_NUM_PTN_R num_ptn3 = MAM_NUM_PTN_R.create("NUM_PTN3");
			MAM_NUM_PTN_R num_ptn4 = MAM_NUM_PTN_R.create("NUM_PTN4");
			MAM_NUM_PTN_R num_ptn5 = MAM_NUM_PTN_R.create("NUM_PTN5");
			MAM_NUM_PTN_R num_ptn6 = MAM_NUM_PTN_R.create("NUM_PTN6");
			builder.addSelect(num_ptn1.num_ptn_nm.as("lot_no_ptn_nm"));
			builder.addSelect(num_ptn2.num_ptn_nm.as("sublot_no_ptn_nm"));
			builder.addSelect(num_ptn3.num_ptn_nm.as("sno1_ptn_nm"));
			builder.addSelect(num_ptn4.num_ptn_nm.as("sno2_ptn_nm"));
			builder.addSelect(num_ptn5.num_ptn_nm.as("sno3_ptn_nm"));
			builder.addSelect(num_ptn6.num_ptn_nm.as("sno4_ptn_nm"));
			rslt.addBooleanColumn(Srch01_Rslt1R.$th_image_flg);
			MAM_CNTRY_R cntry1 = MAM_CNTRY_R.create(MAM_ITM_SRCH_R.$CNTRY1);
			builder.addSelect(cntry1.cntry_nm.as("cntry_org_nm"));
			
			//分類名称の取得
			MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
			MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
			MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
			MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
			MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
			MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
			MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
			MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
			MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
			MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
			builder.addSelect(ig1.itm_grp_nm.as("itm_grp_nm1"));
			builder.addSelect(ig2.itm_grp_nm.as("itm_grp_nm2"));
			builder.addSelect(ig3.itm_grp_nm.as("itm_grp_nm3"));
			builder.addSelect(ig4.itm_grp_nm.as("itm_grp_nm4"));
			builder.addSelect(ig5.itm_grp_nm.as("itm_grp_nm5"));
			builder.addSelect(ig6.itm_grp_nm.as("itm_grp_nm6"));
			builder.addSelect(ig7.itm_grp_nm.as("itm_grp_nm7"));
			builder.addSelect(ig8.itm_grp_nm.as("itm_grp_nm8"));
			builder.addSelect(ig9.itm_grp_nm.as("itm_grp_nm9"));
			builder.addSelect(ig10.itm_grp_nm.as("itm_grp_nm10"));
			
			// 画像検索
			if(!up0().th_image_flg()){
				builder.removeSelect(MAM_ITM_SRCH_R.$th_image);
				builder.addSelect(value(false).as(Srch01_Rslt1R.$th_image_flg));
			}
			else {
				builder.addSelect(value(true).as(Srch01_Rslt1R.$th_image_flg));
			}
		}

		protected void addJoinTable(MCQueryApiBuilder builder) {

			MAM_ITM_SRCH_R t = MAM_ITM_SRCH_R.create(builder.getBaseDbcAlias());
			MAM_NUM_PTN_R num_ptn1 = MAM_NUM_PTN_R.create("NUM_PTN1");
			MAM_NUM_PTN_R num_ptn2 = MAM_NUM_PTN_R.create("NUM_PTN2");
			MAM_NUM_PTN_R num_ptn3 = MAM_NUM_PTN_R.create("NUM_PTN3");
			MAM_NUM_PTN_R num_ptn4 = MAM_NUM_PTN_R.create("NUM_PTN4");
			MAM_NUM_PTN_R num_ptn5 = MAM_NUM_PTN_R.create("NUM_PTN5");
			MAM_NUM_PTN_R num_ptn6 = MAM_NUM_PTN_R.create("NUM_PTN6");
			MAM_CNTRY_R cntry1 = MAM_CNTRY_R.create("CNTRY1");
			builder.addLeftOuterJoin(num_ptn1, t.lot_no_ptn_cd.eq(num_ptn1.num_ptn_cd)
					.and(num_ptn1.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.LOT.value()))));
			builder.addLeftOuterJoin(num_ptn2, t.sublot_no_ptn_cd.eq(num_ptn2.num_ptn_cd)
					.and(num_ptn2.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SUBLOT.value()))));
			builder.addLeftOuterJoin(num_ptn3, t.sno1_ptn_cd.eq(num_ptn3.num_ptn_cd)
					.and(num_ptn3.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SNO.value()))));
			builder.addLeftOuterJoin(num_ptn4, t.sno2_ptn_cd.eq(num_ptn4.num_ptn_cd)
					.and(num_ptn4.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SNO.value()))));
			builder.addLeftOuterJoin(num_ptn5, t.sno3_ptn_cd.eq(num_ptn5.num_ptn_cd)
					.and(num_ptn5.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SNO.value()))));
			builder.addLeftOuterJoin(num_ptn6, t.sno4_ptn_cd.eq(num_ptn6.num_ptn_cd)
					.and(num_ptn6.num_biz_typ.eq(value(MAC_NUM_BIZ_TYP.SNO.value()))));
			builder.addLeftOuterJoin(cntry1, t.cntry_org_cd.eq(cntry1.cntry_cd));
			
			MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
			MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
			MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
			MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
			MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
			MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
			MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
			MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
			MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
			MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
			builder.addLeftOuterJoin(ig1, t.itm_grp_cd1.eq(ig1.itm_grp_cd)
					.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
			builder.addWhereWithCutOffAnd(ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			
			builder.addLeftOuterJoin(ig2, t.itm_grp_cd2.eq(ig2.itm_grp_cd)
					.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
			builder.addWhereWithCutOffAnd(ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			
			builder.addLeftOuterJoin(ig3, t.itm_grp_cd3.eq(ig3.itm_grp_cd)
					.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
			builder.addWhereWithCutOffAnd(ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			
			builder.addLeftOuterJoin(ig4, t.itm_grp_cd4.eq(ig4.itm_grp_cd)
					.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
			builder.addWhereWithCutOffAnd(ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
				
			builder.addLeftOuterJoin(ig5, t.itm_grp_cd5.eq(ig5.itm_grp_cd)
					.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
			builder.addWhereWithCutOffAnd(ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			
			builder.addLeftOuterJoin(ig6, t.itm_grp_cd6.eq(ig6.itm_grp_cd)
					.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
			builder.addWhereWithCutOffAnd(ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			
			builder.addLeftOuterJoin(ig7, t.itm_grp_cd7.eq(ig7.itm_grp_cd)
					.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
			builder.addWhereWithCutOffAnd(ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			
			builder.addLeftOuterJoin(ig8, t.itm_grp_cd8.eq(ig8.itm_grp_cd)
					.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
			builder.addWhereWithCutOffAnd(ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			
			builder.addLeftOuterJoin(ig9, t.itm_grp_cd9.eq(ig9.itm_grp_cd)
					.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
			builder.addWhereWithCutOffAnd(ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));

			builder.addLeftOuterJoin(ig10, t.itm_grp_cd10.eq(ig10.itm_grp_cd)
					.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
			builder.addWhereWithCutOffAnd(ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
		}

		protected void addFlgWhere(MCQueryApiBuilder builder) {
			MAM_ITM_SRCH_R t= MAM_ITM_SRCH_R.create(builder.getBaseDbcAlias());
			
			String _co_cd = getCo().co_cd() ;
			
			if (!_own_co_on && _own_co_off) { //登録済オフ　未登録オン
				builder.addWhereWithAnd(t.co_cd.isNull());
			}
			if (_own_co_on && !_own_co_off) { //登録済オン　未登録オフ
				builder.addWhereWithAnd(t.co_cd.eq(bind("1")), _co_cd);
			}
			if (_sundry_on && !_sundry_off) { 
				builder.addWhereWithAnd(t.sundry_itm_flg.eq(value(true)));
			}
			if (_sundry_off && !_sundry_on) {
				builder.addWhereWithAnd(t.sundry_itm_flg.eq(value(false)));
			}
			if (_release_on && !_release_off) { 
				builder.addWhereWithAnd(t.release_flg.eq(value(true)));
			}
			if (_release_off && !_release_on) {
				builder.addWhereWithAnd(t.release_flg.eq(value(false)));
			}
		}

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_ITM_SRCH_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			r_dest.th_image_flg(r_src.getBooleanNE(Srch01_Rslt1R.$th_image_flg));

			putFuncName(r_dest, "ins_func_id_c", "ins_func_nm_c") ;
			putFuncName(r_dest, "upd_func_id_c", "upd_func_nm_c") ;
		}
		@Override
		protected void doIt() {

			callProc();

			super.doIt();
		}
		/**
		 * 品目マスタを会社共通（別データベース）で管理する場合にサムネイル画像を同期する（共通ＤＢからの取得）
		 * 
		 */
		protected void callProc() {
			execProc(createSqlId(LOGIC_ID, "MAPA_MASTER$P_GET_BINARY", "01"), "MAPA_MASTER$P_GET_BINARY");
		}
	}
	/**
	 * ItmLst_Upd01オペレーション.<p>
	 *
	 * 品目マスタ（共通）の登録を行います。<br>
	 */	public class ItmLst_Upd01 extends MABCL_ItmLst_MC_A.ItmLst_Upd01 {
		@Override
		protected void call() {
			super.call();

		}

		@Override
		protected void up() {
			setItmSub();
			super.up();
		}

		protected void setItmSub() {
			for (ItmLst_UpdChk01_DtlR r : up0()) {
				if (isNull(r.itm_sub1())) {
					r.itm_sub1(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.itm_sub2())) {
					r.itm_sub2(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.itm_sub3())) {
					r.itm_sub3(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		@Override
		protected <R extends MCDBContainer> void updDbcCustomize(
				MCQueryApiBuilder builder, MCList<R> list) {
			super.updDbcCustomize(builder, list);
			if(builder.getBaseDbc() instanceof MAM_ITM_CMN_UPD_R){
				dbcCustomizeUpdSub(builder);
			}
		}

		protected void dbcCustomizeUpdSub(MCQueryApiBuilder builder) {
			boolean imageFlg = false;
			
			ItmLst_UpdChk01_DtlR row = up0().get(0);
			if (!isNull(row)) {
				if (row.th_image_flg()) {
					imageFlg = true;
				}
			}
			if(!imageFlg){
				builder.removeSet(MAM_USR_R.$th_image);
			}
		}
		
		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);
			for (R r : dbc) {
				if (r instanceof MAM_ITM_CMN_UPD_R) {
					insBinary((MAM_ITM_CMN_UPD_R) r);
				}
			}
		}
		
		/**
		 * 品目マスタを会社共通（別データベース）で管理する場合にサムネイル画像を同期する（共通ＤＢへの反映）
		 * 
		 * @param r ＤＢコンテナ
		 */
		protected <R extends MCRow> void insBinary(MAM_ITM_CMN_UPD_R r) {
			if (!isNull((r.th_image()))) {
				String procId = "MAPA_MASTER$P_INS_BINARY";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null, ":th_image");
			}
		}
	}
	/**
	 * ItmLst_UpdChk02オペレーション.<p>
	 *
	 * 品目マスタ（会社）の登録前のチェックを行います。<br>
	 */
	public class ItmLst_UpdChk02 extends MABCL_ItmLst_MC_A.ItmLst_UpdChk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			// 品目マスタ（共通）、品目マスタからデータを取得
			initItmCmnCache(up0());
			initItmCache(up0());

			// システムパラメータを取得
			boolean ver_enable_flg = isSame(getSysParm("VER_ENABLE_FLG"), "1");
			boolean mfg_aprv_enable_flg = isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1");
			boolean cont_fctr_enable_flg = isSame(getSysParm("CONT_FCTR_ENABLE_FLG"), "1");
			int snoTyp = Integer.parseInt(getSysParm("SNO_TYP"));

			for (ItmLst_UpdChk02_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}

				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				if (!ver_enable_flg) {
					if (r.ver_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$ver_flg, MABCL0321, 
								getLabel(r, "VER_ENABLE_FLG"), getLabel(r, ItmLst_UpdChk02_DtlR.$ver_flg), toDispGUIIndex(r)));
					}
				}
				if (!mfg_aprv_enable_flg) {
					if (r.mrkt_judg_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$mrkt_judg_flg, MABCL0321, 
								getLabel(r, "MFG_APRV_ENABLE_FLG"), getLabel(r, ItmLst_UpdChk02_DtlR.$mrkt_judg_flg), toDispGUIIndex(r)));
					}
					if (!isNull(r.mrkt_judg_role_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$mrkt_judg_role_cd, MABCL0321, 
								getLabel(r, "MFG_APRV_ENABLE_FLG"), getLabel(r, ItmLst_UpdChk02_DtlR.$mrkt_judg_role_cd), toDispGUIIndex(r)));
					}
					if (!isNull(r.mrkt_judg_upd_role_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$mrkt_judg_upd_role_cd, MABCL0321, 
								getLabel(r, "MFG_APRV_ENABLE_FLG"), getLabel(r, ItmLst_UpdChk02_DtlR.$mrkt_judg_upd_role_cd), toDispGUIIndex(r)));
					}
				}
				if (!cont_fctr_enable_flg) {
					if (r.cont_fctr_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$cont_fctr_flg, MABCL0321, 
								getLabel(r, "CONT_FCTR_ENABLE_FLG"), getLabel(r, ItmLst_UpdChk02_DtlR.$cont_fctr_flg), toDispGUIIndex(r)));
					}
					if (!isNull(r.std_cont_fctr())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$std_cont_fctr, MABCL0321, 
								getLabel(r, "CONT_FCTR_ENABLE_FLG"), getLabel(r, ItmLst_UpdChk02_DtlR.$std_cont_fctr), toDispGUIIndex(r)));
					}
					if (!isNull(r.cont_fctr_unit_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$cont_fctr_unit_cd, MABCL0321, 
								getLabel(r, "CONT_FCTR_ENABLE_FLG"), getLabel(r, ItmLst_UpdChk02_DtlR.$cont_fctr_unit_cd), toDispGUIIndex(r)));
					}
					if (!isNull(r.cont_fctr_dec_place())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$cont_fctr_dec_place, MABCL0321, 
								getLabel(r, "CONT_FCTR_ENABLE_FLG"), getLabel(r, ItmLst_UpdChk02_DtlR.$cont_fctr_dec_place), toDispGUIIndex(r)));
					}
					if (!isNull(r.cont_fctr_rnd_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$cont_fctr_rnd_typ, MABCL0321, 
								getLabel(r, "CONT_FCTR_ENABLE_FLG"), getLabel(r, ItmLst_UpdChk02_DtlR.$cont_fctr_rnd_typ), toDispGUIIndex(r)));
					}
				}
				if (snoTyp < 0 || snoTyp > 4) {
					snoTyp = 0;
				}
				
				if (snoTyp < 1) {
					if (!isNull(r.sno1_mng_typ()) && !MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno1_mng_typ, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno1_mng_typ), toDispGUIIndex(r)));
					}
					if (r.slo_sno1_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$slo_sno1_flg, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$slo_sno1_flg), toDispGUIIndex(r)));
					}
					if (r.rqmt_sno1_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$rqmt_sno1_flg, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$rqmt_sno1_flg), toDispGUIIndex(r)));
					}
					if (!isNull(r.sno1_num_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno1_num_typ, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno1_num_typ), toDispGUIIndex(r)));
					}
					if (!isNull(r.sno1_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno1_ptn_cd, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno1_ptn_cd), toDispGUIIndex(r)));
					}
				}
				if (snoTyp < 2) {
					if (!isNull(r.sno2_mng_typ()) && !MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno2_mng_typ, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno2_mng_typ), toDispGUIIndex(r)));
					}
					if (r.slo_sno2_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$slo_sno2_flg, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$slo_sno2_flg), toDispGUIIndex(r)));
					}
					if (r.rqmt_sno2_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$rqmt_sno2_flg, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$rqmt_sno2_flg), toDispGUIIndex(r)));
					}
					if (!isNull(r.sno2_num_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno2_num_typ, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno2_num_typ), toDispGUIIndex(r)));
					}
					if (!isNull(r.sno2_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno2_ptn_cd, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno2_ptn_cd), toDispGUIIndex(r)));
					}
				}
				if (snoTyp < 3) {
					if (!isNull(r.sno3_mng_typ()) && !MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno3_mng_typ, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno3_mng_typ), toDispGUIIndex(r)));
					}
					if (r.slo_sno3_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$slo_sno3_flg, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$slo_sno3_flg), toDispGUIIndex(r)));
					}
					if (r.rqmt_sno3_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$rqmt_sno3_flg, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$rqmt_sno3_flg), toDispGUIIndex(r)));
					}
					if (!isNull(r.sno3_num_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno3_num_typ, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno3_num_typ), toDispGUIIndex(r)));
					}
					if (!isNull(r.sno3_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno3_ptn_cd, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno3_ptn_cd), toDispGUIIndex(r)));
					}
				}
				if (snoTyp < 4) {
					if (!isNull(r.sno4_mng_typ()) && !MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno4_mng_typ, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno4_mng_typ), toDispGUIIndex(r)));
					}
					if (r.slo_sno4_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$slo_sno4_flg, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$slo_sno4_flg), toDispGUIIndex(r)));
					}
					if (r.rqmt_sno4_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$rqmt_sno4_flg, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$rqmt_sno4_flg), toDispGUIIndex(r)));
					}
					if (!isNull(r.sno4_num_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno4_num_typ, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno4_num_typ), toDispGUIIndex(r)));
					}
					if (!isNull(r.sno4_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno4_ptn_cd, MABCL0321, 
								getLabel(r, "SNO_TYP"), getLabel(r, ItmLst_UpdChk02_DtlR.$sno4_ptn_cd), toDispGUIIndex(r)));
					}
				}
				if (!isNull(r.ref_itm_cd()) || !isNull(r.ref_itm_sub1()) 
						|| !isNull(r.ref_itm_sub2()) || !isNull(r.ref_itm_sub3())) {
					if (isNull(r.ref_itm_cd()) || isNull(r.ref_itm_sub1()) 
							|| isNull(r.ref_itm_sub2()) || isNull(r.ref_itm_sub3())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$ref_itm_cd,
								MABCL0322, getLabel(r, ItmLst_UpdChk02_DtlR.$ref_itm_cd), toDispGUIIndex(r)));
					}
				}

				// キャッシュから品目マスタ（共通）データの取得
				MAM_ITM_CMN__R itmCmnR = getItmCmnR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (itmCmnR == null) {
					msgList.add(new MCMessage(r, null, MABCL0293, toDispGUIIndex(r)));
					continue;
				}
				
				// 補完
				if (isNull(r.lot_mng_typ())) {
					r.lot_mng_typ(MAC_LOT_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sublot_mng_typ())) {
					r.sublot_mng_typ(MAC_SUBLOT_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sno1_mng_typ())) {
					r.sno1_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sno2_mng_typ())) {
					r.sno2_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sno3_mng_typ())) {
					r.sno3_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sno4_mng_typ())) {
					r.sno4_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}

				// 条件付必須チェック
				if (MAC_LOT_MNG_TYP.isDUPL_ABL(r.lot_mng_typ()) || MAC_LOT_MNG_TYP.isUNIQ(r.lot_mng_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$lot_no_typ, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.lot_no_typ()) && !MAC_LOT_NO_TYP.isMANUAL(r.lot_no_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$lot_no_ptn_cd, new FXUCL_RequiredValidater()));
				}
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$sublot_no_typ, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.sublot_no_typ()) && !MAC_LOT_NO_TYP.isMANUAL(r.sublot_no_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$sublot_no_ptn_cd, new FXUCL_RequiredValidater()));
				}
				if (r.mrkt_judg_flg()) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$mrkt_judg_role_cd, new FXUCL_RequiredValidater()));
				}
				if (r.lmt_ctl_flg()) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$lmt_ctl_categ, new FXUCL_RequiredValidater()));
				}
				if (r.cont_fctr_flg()) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$std_cont_fctr, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$cont_fctr_unit_cd, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$cont_fctr_rnd_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$cont_fctr_dec_place, new FXUCL_RequiredValidater()));
				}
				if (!MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$sno1_num_typ, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.sno1_num_typ()) && !MAC_SNO_NO_TYP.isMANUAL(r.sno1_num_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$sno1_ptn_cd, new FXUCL_RequiredValidater()));
				}
				if (!MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$sno2_num_typ, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.sno2_num_typ()) && !MAC_SNO_NO_TYP.isMANUAL(r.sno2_num_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$sno2_ptn_cd, new FXUCL_RequiredValidater()));
				}
				if (!MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$sno3_num_typ, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.sno3_num_typ()) && !MAC_SNO_NO_TYP.isMANUAL(r.sno3_num_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$sno3_ptn_cd, new FXUCL_RequiredValidater()));
				}
				if (!MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$sno4_num_typ, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.sno4_num_typ()) && !MAC_SNO_NO_TYP.isMANUAL(r.sno4_num_typ())) {
					msgList.addAll(check(r, ItmLst_UpdChk02_DtlR.$sno4_ptn_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (MAC_STK_MNG_TYP.isPHANTOM(itmCmnR.stk_mng_typ())) {
					if (!MAC_ITM_TYP.isPHANTOM(r.itm_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$itm_typ, MABCL0058, toDispGUIIndex(r)));
					}
				}
				else if (MAC_ITM_TYP.isPHANTOM(r.itm_typ())) {
					msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$itm_typ, MABCL0323, toDispGUIIndex(r)));
				}

				if (!MAC_STK_MNG_TYP.isMNG(itmCmnR.stk_mng_typ())) {
					if (r.minus_stk_flg()) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$minus_stk_flg, MABCL0059));
					}
					if (r.gi_alloc_flg()) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$gi_alloc_flg, MABCL0059));
					}
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$lot_mng_typ, MABCL0069, toDispGUIIndex(r)));
					}
					if (r.stk_lst_flg()) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$stk_lst_flg, MABCL0059));
					}
					if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())){
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sublot_mng_typ, MABCL0278, toDispGUIIndex(r)));
					}
				}
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					if (!isNull(r.lot_no_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$lot_no_typ, MABCL0070, toDispGUIIndex(r)));
					}
					if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sublot_mng_typ, MABCL0072, toDispGUIIndex(r)));
					}
					if (r.ver_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$ver_flg, MABCL0085, toDispGUIIndex(r)));
					}
					if (r.lmt_ctl_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$lmt_ctl_flg, MABCL0703, toDispGUIIndex(r)));
					}
				}
				if (MAC_LOT_NO_TYP.isMANUAL(r.lot_no_typ())) {
					if (!isNull(r.lot_no_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$lot_no_ptn_cd, MABCL0071, toDispGUIIndex(r)));
					}
				}
				else if (isNull(r.lot_no_typ())) {
					if (!isNull(r.lot_no_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$lot_no_ptn_cd, MABCL0186, toDispGUIIndex(r)));
					}
				}
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					if (!isNull(r.sublot_no_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sublot_no_typ, MABCL0073, toDispGUIIndex(r)));
					}
				}
				if (MAC_LOT_NO_TYP.isMANUAL(r.sublot_no_typ())) {
					if (!isNull(r.sublot_no_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sublot_no_ptn_cd, MABCL0074, toDispGUIIndex(r)));
					}
				}
				else if (isNull(r.sublot_no_typ())) {
					if (!isNull(r.sublot_no_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sublot_no_ptn_cd, MABCL0190, toDispGUIIndex(r)));
					}
				}
				if (!MAC_LOT_MNG_TYP.isUNIQ(r.lot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isUNIQ(r.sublot_mng_typ())) {
					if (!isNull(r.insp_bind_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$insp_bind_typ, MABCL0075, toDispGUIIndex(r)));
					}
					if (r.mrkt_judg_flg()) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$mrkt_judg_flg, MABCL0061));
					}
					if (r.cont_fctr_flg()) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$cont_fctr_flg, MABCL0061));
					}
				}
				if (r.not_new_lot_flg()
				 && MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) 
				 && MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$not_new_lot_flg, MABCL0232, toDispGUIIndex(r)));
				}
				if (!r.mrkt_judg_flg()) {
					if (!isNull(r.mrkt_judg_role_cd())) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$mrkt_judg_role_cd, MABCL0060));
					}
					if (!isNull(r.mrkt_judg_upd_role_cd())) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$mrkt_judg_upd_role_cd, MABCL0060));
					}
				}
				if (!r.lmt_ctl_flg()) {
					if (!isNull(r.lmt_ctl_categ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$lmt_ctl_categ, MABCL0062, toDispGUIIndex(r)));
					}
					if (r.ship_lot_back_stop_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$ship_lot_back_stop_flg, MABCL0142, toDispGUIIndex(r)));
					}
					if (!isNull(r.ship_valid_grp_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$ship_valid_grp_cd, MABCL0260, toDispGUIIndex(r)));
					}
				}
				if (!r.cont_fctr_flg()) {
					if (!isNull(r.std_cont_fctr())) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$std_cont_fctr, MABCL0063));
					}
					if (!isNull(r.cont_fctr_unit_cd())) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$cont_fctr_unit_cd, MABCL0063));
					}
					if (!isNull(r.cont_fctr_rnd_typ())) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$cont_fctr_rnd_typ, MABCL0063));
					}
					if (!isNull(r.cont_fctr_dec_place())) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$cont_fctr_dec_place, MABCL0063));
					}
				}
				if (MAC_STK_MNG_TYP.isMNG(itmCmnR.stk_mng_typ()) && itmCmnR.sundry_itm_flg()) {
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno1_mng_typ())) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sno1_mng_typ, MABCL0176));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno2_mng_typ())) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sno2_mng_typ, MABCL0176));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno3_mng_typ())) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sno3_mng_typ, MABCL0176));
					}
					if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno4_mng_typ())) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sno4_mng_typ, MABCL0176));
					}
					if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ()) && !MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())
							&& !MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ()) && !MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno1_mng_typ, MABCL0177));
					}
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					if (r.slo_sno1_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$slo_sno1_flg, ItmLst_UpdChk02_DtlR.$sno1_mng_typ, MABCL0065));
					}
					if (r.rqmt_sno1_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$rqmt_sno1_flg, ItmLst_UpdChk02_DtlR.$sno1_mng_typ, MABCL0065));
					}
					if (!isNull(r.sno1_num_typ())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno1_num_typ, ItmLst_UpdChk02_DtlR.$sno1_mng_typ, MABCL0067));
					}
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					if (!r.slo_sno1_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$slo_sno1_flg, ItmLst_UpdChk02_DtlR.$sno1_mng_typ, MABCL0066));
					}
					if (!r.rqmt_sno1_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$rqmt_sno1_flg, ItmLst_UpdChk02_DtlR.$sno1_mng_typ, MABCL0066));
					}
				}
				if (MAC_SNO_NO_TYP.isMANUAL(r.sno1_num_typ())) {
					if (!isNull(r.sno1_ptn_cd())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno1_ptn_cd, ItmLst_UpdChk02_DtlR.$sno1_num_typ, MABCL0068));
					}
				}
				else if (isNull(r.sno1_num_typ())) {
					if (!isNull(r.sno1_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno1_ptn_cd, MABCL0199, toDispGUIIndex(r)));
					}
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					if (r.slo_sno2_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$slo_sno2_flg, ItmLst_UpdChk02_DtlR.$sno2_mng_typ, MABCL0065));
					}
					if (r.rqmt_sno2_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$rqmt_sno2_flg, ItmLst_UpdChk02_DtlR.$sno2_mng_typ, MABCL0065));
					}
					if (!isNull(r.sno2_num_typ())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno2_num_typ, ItmLst_UpdChk02_DtlR.$sno2_mng_typ, MABCL0067));
					}
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					if (!r.slo_sno2_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$slo_sno2_flg, ItmLst_UpdChk02_DtlR.$sno2_mng_typ, MABCL0066));
					}
					if (!r.rqmt_sno2_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$rqmt_sno2_flg, ItmLst_UpdChk02_DtlR.$sno2_mng_typ, MABCL0066));
					}
				}
				if (MAC_SNO_NO_TYP.isMANUAL(r.sno2_num_typ())) {
					if (!isNull(r.sno2_ptn_cd())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno2_ptn_cd, ItmLst_UpdChk02_DtlR.$sno2_num_typ, MABCL0068));
					}
				}
				else if (isNull(r.sno2_num_typ())) {
					if (!isNull(r.sno2_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno2_ptn_cd, MABCL0207, toDispGUIIndex(r)));
					}
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					if (r.slo_sno3_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$slo_sno3_flg, ItmLst_UpdChk02_DtlR.$sno3_mng_typ, MABCL0065));
					}
					if (r.rqmt_sno3_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$rqmt_sno3_flg, ItmLst_UpdChk02_DtlR.$sno3_mng_typ, MABCL0065));
					}
					if (!isNull(r.sno3_num_typ())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno3_num_typ, ItmLst_UpdChk02_DtlR.$sno3_mng_typ, MABCL0067));
					}
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					if (!r.slo_sno3_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$slo_sno3_flg, ItmLst_UpdChk02_DtlR.$sno3_mng_typ, MABCL0066));
					}
					if (!r.rqmt_sno3_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$rqmt_sno3_flg, ItmLst_UpdChk02_DtlR.$sno3_mng_typ, MABCL0066));
					}
				}
				if (MAC_SNO_NO_TYP.isMANUAL(r.sno3_num_typ())) {
					if (!isNull(r.sno3_ptn_cd())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno3_ptn_cd, ItmLst_UpdChk02_DtlR.$sno3_num_typ, MABCL0068));
					}
				}
				else if (isNull(r.sno3_num_typ())) {
					if (!isNull(r.sno3_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno3_ptn_cd, MABCL0215, toDispGUIIndex(r)));
					}
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					if (r.slo_sno4_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$slo_sno4_flg, ItmLst_UpdChk02_DtlR.$sno4_mng_typ, MABCL0065));
					}
					if (r.rqmt_sno4_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$rqmt_sno4_flg, ItmLst_UpdChk02_DtlR.$sno4_mng_typ, MABCL0065));
					}
					if (!isNull(r.sno4_num_typ())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno4_num_typ, ItmLst_UpdChk02_DtlR.$sno4_mng_typ, MABCL0067));
					}
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					if (!r.slo_sno4_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$slo_sno4_flg, ItmLst_UpdChk02_DtlR.$sno4_mng_typ, MABCL0066));
					}
					if (!r.rqmt_sno4_flg()) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$rqmt_sno4_flg, ItmLst_UpdChk02_DtlR.$sno4_mng_typ, MABCL0066));
					}
				}
				if (MAC_SNO_NO_TYP.isMANUAL(r.sno4_num_typ())) {
					if (!isNull(r.sno4_ptn_cd())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno4_ptn_cd, ItmLst_UpdChk02_DtlR.$sno4_num_typ, MABCL0068));
					}
				}
				else if (isNull(r.sno4_num_typ())) {
					if (!isNull(r.sno4_ptn_cd())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno4_ptn_cd, MABCL0223, toDispGUIIndex(r)));
					}
				}

				if (MAC_STK_MNG_TYP.isNOT_MNG(itmCmnR.stk_mng_typ()) && MAC_ASSET_MNG_TYP.isMNG(itmCmnR.asset_mng_typ())) {
					if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ()) && !MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())
							&& !MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ()) && !MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$sno1_mng_typ, MABCL0032, toDispGUIIndex(r)));
					}
				}
				if (r.rqmt_sno1_flg()) {
					if (!MAC_SNO_NO_TYP.isAUTO(r.sno1_num_typ()) && !MAC_SNO_NO_TYP.isAUTO_MANU(r.sno1_num_typ())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno1_num_typ, ItmLst_UpdChk02_DtlR.$rqmt_sno1_flg, MABCL0077));
					}
				}
				if (r.rqmt_sno2_flg()) {
					if (!MAC_SNO_NO_TYP.isAUTO(r.sno2_num_typ()) && !MAC_SNO_NO_TYP.isAUTO_MANU(r.sno2_num_typ())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno2_num_typ, ItmLst_UpdChk02_DtlR.$rqmt_sno2_flg, MABCL0077));
					}
				}
				if (r.rqmt_sno3_flg()) {
					if (!MAC_SNO_NO_TYP.isAUTO(r.sno3_num_typ()) && !MAC_SNO_NO_TYP.isAUTO_MANU(r.sno3_num_typ())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno3_num_typ, ItmLst_UpdChk02_DtlR.$rqmt_sno3_flg, MABCL0077));
					}
				}
				if (r.rqmt_sno4_flg()) {
					if (!MAC_SNO_NO_TYP.isAUTO(r.sno4_num_typ()) && !MAC_SNO_NO_TYP.isAUTO_MANU(r.sno4_num_typ())) {
						msgList.add(getMsg2(r, ItmLst_UpdChk02_DtlR.$sno4_num_typ, ItmLst_UpdChk02_DtlR.$rqmt_sno4_flg, MABCL0077));
					}
				}
				if (MAC_STK_MNG_TYP.isNOT_MNG(itmCmnR.stk_mng_typ())) {
					if (!isNull(r.slo_proc_typ()) && !MAC_SLO_PROC_TYP.isPURC_DDLV(r.slo_proc_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$slo_proc_typ, MABCL0174, toDispGUIIndex(r)));
					}
				}
				if (MAC_STK_MNG_TYP.isMNG(itmCmnR.stk_mng_typ())) {
					if (!isNull(r.ship_inst_typ()) && !MAC_SHIP_INST_TYP.isPICK(r.ship_inst_typ()) && !MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$ship_inst_typ, MABCL0175, toDispGUIIndex(r)));
					}
				}
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.slo_proc_typ())) {
					if (!MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$ship_inst_typ, MABCL0179, toDispGUIIndex(r)));
					}
				}
				if (MAC_STK_MNG_TYP.isMNG(itmCmnR.stk_mng_typ()) || MAC_STK_MNG_TYP.isPHANTOM(itmCmnR.stk_mng_typ())) {
					if (r.arr_skip_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$arr_skip_flg, MABCL0144, toDispGUIIndex(r)));
					}
				}
				if (!MAC_STK_MNG_TYP.isNOT_MNG(itmCmnR.stk_mng_typ())) {
					if (!isNull(r.exim_xpns_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$exim_xpns_typ, MABCL0076, toDispGUIIndex(r)));
					}
				}
				if (itmCmnR.dscnt_itm_flg()) {
					if (!r.sls_upri_cng_flg()) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sls_upri_cng_flg, MABCL0145));
					}
					if (!r.purc_upri_cng_flg()) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$purc_upri_cng_flg, MABCL0145));
					}
					if (!isNull(r.exim_xpns_typ())) {
						msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$exim_xpns_typ, MABCL0183));
					}
				}
				if (!MAC_ASSET_MNG_TYP.isMNG(itmCmnR.asset_mng_typ())) {
					if (r.prov_upri_cng_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$prov_upri_cng_flg, MABCL0173, toDispGUIIndex(r)));
					}
				}
				if (!r.arr_skip_flg()) {
					if (r.purc_dlv_slip_flg()) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$purc_dlv_slip_flg, MABCL0652, toDispGUIIndex(r)));
					}
				}
				if (isSame(r.itm_cd(), r.ref_itm_cd())
				 && isSame(r.itm_sub1(), r.ref_itm_sub1())
				 && isSame(r.itm_sub2(), r.ref_itm_sub2())
				 && isSame(r.itm_sub3(), r.ref_itm_sub3())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$ref_itm_cd, MABCL0303, toDispGUIIndex(r)));
				}

				if (MAC_STK_MNG_TYP.isPHANTOM(itmCmnR.stk_mng_typ())) {
					if (!isNull(r.sls_tax_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sls_tax_cd, MABCL0079));
					if (!isNull(r.purc_tax_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$purc_tax_cd, MABCL0079));
					if (!isNull(r.prov_tax_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$prov_tax_cd, MABCL0079));
					if (!isNull(r.ship_unit_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$ship_unit_cd, MABCL0079));
					if (!isNull(r.mfg_unit_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$mfg_unit_cd, MABCL0079));
					if (!isNull(r.purc_unit_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$purc_unit_cd, MABCL0079));
					if (!isNull(r.pckg_unit_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$pckg_unit_cd, MABCL0079));
					if (!isNull(r.rqmt_rstr_qty())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$rqmt_rstr_qty, MABCL0079));

					if (!MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sno1_mng_typ, MABCL0064));
					if (!MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sno2_mng_typ, MABCL0064));
					if (!MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sno3_mng_typ, MABCL0064));
					if (!MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sno4_mng_typ, MABCL0064));

					if (!isNull(r.mfg_inst_unit_typ())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$mfg_inst_unit_typ, MABCL0079));
					if (!isNull(r.mrp_proc_typ())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$mrp_proc_typ, MABCL0079));
					if (!isNull(r.rqmt_typ())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$rqmt_typ, MABCL0079));
					if (!isNull(r.prod_pln_typ())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$prod_pln_typ, MABCL0079));
					if (!isNull(r.dmnd_date_div_mons())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$dmnd_date_div_mons, MABCL0079));
					if (!isNull(r.alloc_margin_days())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$alloc_margin_days, MABCL0079));
					if (!isNull(r.mrp_alloc_margin_days())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$mrp_alloc_margin_days, MABCL0079));
					if (!isNull(r.mrp_opn_xfr_days())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$mrp_opn_xfr_days, MABCL0079));
					if (r.inpt_itm_add_flg()) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$inpt_itm_add_flg, MABCL0078));
					if (r.inpt_itm_del_flg()) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$inpt_itm_del_flg, MABCL0078));
					if (r.sch_flg()) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sch_flg, MABCL0078));
					if (!isNull(r.cntry_org_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$cntry_org_cd, MABCL0079));
					if (!MAC_COMP_SPEC_TYP.isNO(r.comp_spec_typ()) && !isNull(r.comp_spec_typ())) {
						msgList.add(new MCMessage(r, ItmLst_UpdChk02_DtlR.$comp_spec_typ, MABCL0141, toDispGUIIndex(r)));
					}
					if (r.comp_core_itm_flg()) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$comp_core_itm_flg, MABCL0078));
					if (!isNull(r.itm_spec_grp_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$itm_spec_grp_cd, MABCL0079));
					if (!isNull(r.sls_upri_grp_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sls_upri_grp_cd, MABCL0079));
					if (!isNull(r.bill_crryovr_times())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$bill_crryovr_times, MABCL0079));
					if (!isNull(r.pay_crryovr_times())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$pay_crryovr_times, MABCL0079));
					if (r.slo_proc_flg()) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$slo_proc_flg, MABCL0078));
					if (!isNull(r.slo_proc_typ())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$slo_proc_typ, MABCL0079));
					if (!isNull(r.ship_inst_typ())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$ship_inst_typ, MABCL0079));
					if (!isNull(r.itm_ship_grp_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$itm_ship_grp_cd, MABCL0079));
					if (!isNull(r.ship_term_cd())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$ship_term_cd, MABCL0079));
					if (r.sls_upri_cng_flg()) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sls_upri_cng_flg, MABCL0078));
					if (r.purc_upri_cng_flg()) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$purc_upri_cng_flg, MABCL0078));
					if (!isNull(r.cost_std_qty())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$cost_std_qty, MABCL0079));
					if (!isNull(r.itm_alc_grp())) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$itm_alc_grp, MABCL0079));
					if (r.sls_flg()) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$sls_flg, MABCL0078));
					if (r.mfg_flg()) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$mfg_flg, MABCL0078));
					if (r.purc_flg()) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$purc_flg, MABCL0078));
					if (r.insp_flg()) msgList.add(getMsg(r, ItmLst_UpdChk02_DtlR.$insp_flg, MABCL0078));
				}
				int decPlace = itmCmnR.dec_place().intValue();
				msgList.addAll(checkDecPlace(r, decPlace, ItmLst_UpdChk02_DtlR.$rqmt_rstr_qty));
				msgList.addAll(checkDecPlace(r, decPlace, ItmLst_UpdChk02_DtlR.$cost_std_qty));
			}
			return msgList;
		}
		/** 項目名、行番号を引数に持つメッセージ */
		protected MCMessage getMsg(ItmLst_UpdChk02_DtlR r, String col, String id) {
			return new MCMessage(r, col, id, getLabel(r, col), toDispGUIIndex(r));
		}
		/** 項目名、制御項目名、行番号を引数に持つメッセージ（主に手配ＮＯ用） */
		protected MCMessage getMsg2(ItmLst_UpdChk02_DtlR r, String col, String ctrl, String id) {
			return new MCMessage(r, col, id, getLabel(r, col), getLabel(r, ctrl), toDispGUIIndex(r));
		}
	}
	/**
	 * ItmLst_Upd02オペレーション.<p>
	 *
	 * 品目マスタ（会社）の登録を行います。<br>
	 */
	public class ItmLst_Upd02 extends MABCL_ItmLst_MC_A.ItmLst_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			setComp();
			super.up();
		}

		/**
		 * 補完
		 */
		protected void setComp() {
			for (ItmLst_UpdChk02_DtlR r : up0()) {
				if (isNull(r.itm_sub1())) {
					r.itm_sub1(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.itm_sub2())) {
					r.itm_sub2(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.itm_sub3())) {
					r.itm_sub3(MAC_STR.NULL_VAL.value());
				}

				if (isNull(r.lot_mng_typ())) {
					r.lot_mng_typ(MAC_LOT_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sublot_mng_typ())) {
					r.sublot_mng_typ(MAC_SUBLOT_MNG_TYP.NOT_MNG.value());
				}

				if (isNull(r.sno1_mng_typ())) {
					r.sno1_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sno2_mng_typ())) {
					r.sno2_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sno3_mng_typ())) {
					r.sno3_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sno4_mng_typ())) {
					r.sno4_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}

				if (r.getStatus() == MCRow.MODIFY && isNull(r.upd_cntr())) {
					r.setStatus(MCRow.CREATE);
				}
			}
		}

		@Override
		protected <R extends MCDBContainer> void updDbcCustomize(
				MCQueryApiBuilder builder, MCList<R> list) {
			super.updDbcCustomize(builder, list);

			// リリース関連は更新しない
			builder.removeSet(MAM_ITM_COM_R.$release_flg);
			builder.removeSet(MAM_ITM_COM_R.$release_tm);
			builder.removeSet(MAM_ITM_COM_R.$release_usr_cd);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目マスタ一覧の登録を行います。<br>
	 */
	public class Upd01 extends MABCL_ItmLst_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			editUp();
			super.up();
		}

		protected void editUp() {
			for (Upd01_Dtl1R r : up0()) {
				// 会社ＣＤの設定
				r.co_cd(getCo().co_cd());
				// 手配ＮＯ管理区分（nullのとき「1.管理しない」を設定）
				if (isNull(r.sno1_mng_typ())) {
					r.sno1_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sno2_mng_typ())) {
					r.sno2_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sno3_mng_typ())) {
					r.sno3_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
				if (isNull(r.sno4_mng_typ())) {
					r.sno4_mng_typ(MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
			}
		}

		@Override
		protected List<String> getSortedCallOpeGrpNms() {
			List<String> opeL = super.getSortedCallOpeGrpNms();
			if (up1().upd_only_com_flg()) {
				opeL.remove("CALL_OPE01");
			}
			return opeL;
		}
	}


	// ///////////////////////////////////////////////
	// マスタ取得（ここから）
	// ///////////////////////////////////////////////
	protected static final Class<MABCL_ItmLst> CLAZZ = MABCL_ItmLst.class;

	/**
	 * 品目マスタの主キーワークテーブル作成
	 */
	protected void insItmWk(MCList<ItmLst_UpdChk02_DtlR> dtlL) {
		MAW_ITM_KEY_R S0T = MAW_ITM_KEY_R.create("T");

		dbWkDelete("MABCL0390_MAW_ITM_KEY_D01", MAM_ITM_R.create());

		MCInsert q1 = sql("MABCL0390_MAW_ITM_KEY_I01")
			.insert(S0T)
			.columns(
				S0T.itm_cd,
				S0T.itm_sub1,
				S0T.itm_sub2,
				S0T.itm_sub3
			)
			.values(
				bind("itm_cd"),
				bind("itm_sub1"),
				bind("itm_sub2"),
				bind("itm_sub3")
			);
		q1.executeBatchUpdate(dtlL);
	}

	/**
	 * 「MAM_ITM_CMN_」取得
	 */
	MCList<MAM_ITM_CMN__R> _itmCmnL;
	MCIndexKey _itmCmnKey;
	protected void initItmCmnCache(MCList<ItmLst_UpdChk02_DtlR> dtlL) {
		// ワーク作成
		insItmWk(dtlL);

		// 検索
		MCList<MAM_ITM_CMN__R> dbc = MCList.create(MAM_ITM_CMN__R.class);
		MAM_ITM_CMN__R t = MAM_ITM_CMN__R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAW_ITM_KEY_R w = MAW_ITM_KEY_R.create("W");
		dbc_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
				t.stk_mng_typ, t.asset_mng_typ, t.dscnt_itm_flg, t.sundry_itm_flg, t.dec_place);
		dbc_bldr.addInnerJoin(w, w.itm_cd.eq(t.itm_cd)
				.and(w.itm_sub1.eq(t.itm_sub1))
				.and(w.itm_sub2.eq(t.itm_sub2))
				.and(w.itm_sub3.eq(t.itm_sub3)));
		dbSelect("MABCL0390_MAM_ITM_CMN__S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._itmCmnL = dbc;
		object(CLAZZ)._itmCmnKey = object(CLAZZ)._itmCmnL.createIndex(
				MAM_ITM_CMN__R.$itm_cd,
				MAM_ITM_CMN__R.$itm_sub1,
				MAM_ITM_CMN__R.$itm_sub2,
				MAM_ITM_CMN__R.$itm_sub3
		);
	}

	protected MAM_ITM_CMN__R getItmCmnR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._itmCmnL.getFirst(object(CLAZZ)._itmCmnKey, itmCd, itmSub1, itmSub2, itmSub3);
	}

	/**
	 * 「MAM_ITM_」取得
	 */

	MCList<MAM_ITM__R> _itmL;
	MCIndexKey _itmKey;
	protected void initItmCache(MCList<ItmLst_UpdChk02_DtlR> dtlL) {
		// ワーク作成
		insItmWk(dtlL);

		// 検索
		MCList<MAM_ITM__R> dbc = MCList.create(MAM_ITM__R.class);
		MAM_ITM__R t = MAM_ITM__R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAW_ITM_KEY_R w = MAW_ITM_KEY_R.create("W");
		dbc_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.release_flg);
		dbc_bldr.addInnerJoin(w, w.itm_cd.eq(t.itm_cd)
				.and(w.itm_sub1.eq(t.itm_sub1))
				.and(w.itm_sub2.eq(t.itm_sub2))
				.and(w.itm_sub3.eq(t.itm_sub3)));
		dbSelect("MABCL0390_MAM_ITM__S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._itmL = dbc;
		object(CLAZZ)._itmKey = object(CLAZZ)._itmL.createIndex(
				MAM_ITM__R.$itm_cd,
				MAM_ITM__R.$itm_sub1,
				MAM_ITM__R.$itm_sub2,
				MAM_ITM__R.$itm_sub3
		);
	}

	protected MAM_ITM__R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._itmL.getFirst(object(CLAZZ)._itmKey, itmCd, itmSub1, itmSub2, itmSub3);
	}
	// ///////////////////////////////////////////////
	// マスタ取得（ここまで）
	// ///////////////////////////////////////////////

	//FMCB CUSTOM END
}