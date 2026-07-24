package mcframe.serverMABC.MABCL0500;

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
import mcframe.serverMABC.MABCL0500.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverMAUD.MAUDL6010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_BpLclReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_BpLclReg_MC extends MABCL_BpLclReg_MC_A{
	//FMCB CUSTOM START

	protected String _mstSetTyp;

	protected String getMstSetTyp() {
		if (_mstSetTyp == null) {
			MAUDL_RLUtil.Srch01 o = MAUDL_RLUtil.crtSrch01();
			o.up0().mst_nm(MAC_MST_NM.MAM_BP.value());
			o.exec();
			_mstSetTyp = o.down0().mst_set_typ();
		}
		return _mstSetTyp;
	}

	protected boolean isAllComCom() {
		return MAC_MST_SET_TYP.isALL_COM_COM(getMstSetTyp());
	}
	/**
	 * BpLcl_UpdChk01オペレーション.<p>
	 *
	 * 取引先名称の登録前のチェックを行います。<br>
	 */
	public class BpLcl_UpdChk01 extends MABCL_BpLclReg_MC_A.BpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgList = super.doServerCheckSub();
			for(BpLcl_UpdChk01_DtlR row : up0()){
				// ローケル存在チェック
				msgList.addAll(checkLocaleEntry(row.lcl_cd()));
			}
			return msgList;
		}
	}
	/**
	 * BpLcl_Upd01オペレーション.<p>
	 *
	 * 取引先名称の登録を行います。<br>
	 */
	public class BpLcl_Upd01 extends MABCL_BpLclReg_MC_A.BpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpLcl_DelChk01オペレーション.<p>
	 *
	 * 取引先名称の削除前のチェックを行います。<br>
	 */
	public class BpLcl_DelChk01 extends MABCL_BpLclReg_MC_A.BpLcl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgList = super.doServerCheckSub();
			for(BpLcl_DelChk01_DtlR row : up0()){
				// ローケル存在チェック
				msgList.addAll(checkLocaleEntry(row.lcl_cd()));
			}
			return msgList;
		}
	}
	/**
	 * BpLcl_Del01オペレーション.<p>
	 *
	 * 取引先名称の削除を行います。<br>
	 */
	public class BpLcl_Del01 extends MABCL_BpLclReg_MC_A.BpLcl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 取引先名称の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_BpLclReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_BP_LCL_R) {
				if(isAllComCom()) {
					dbcCustomizeSubComCom(builder, rslt);
				}
				else {
					dbcCustomizeSub(builder, rslt);
				}
				
			}
		}
		
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder,
				MCList<R> rslt) {

			MAM_BP_LCL_R t = MAM_BP_LCL_R.create(builder.getBaseDbcAlias());
			MAM_BP_R bp1 = MAM_BP_R.create("BP1");

			builder.setWhere(value(0).eq(value(0)));
			if (up0().reg_flg() && !up0().yet_flg()) {
				builder.addInnerJoin(bp1, t.bp_cd.eq(bp1.bp_cd));
				
				builder.addWhereWithCutOffAnd(t.lcl_cd.like(bind(Srch01_CndR.$lcl_cd)));
			}
			else {
				MAM_BP_LCL_R S1M = MAM_BP_LCL_R.create("M");
				MCTempView bplcl1 = createTempView("BPLCL1");
				if (isNull(up0().lcl_cd())){
					builder.addInnerJoin(subQuery().select(S1M.prAll())
							.from(S1M).view(bplcl1),
							t.bp_cd.eq(bplcl1.pr("bp_cd"))
							.and(t.lcl_cd.eq(bplcl1.pr("lcl_cd"))));
				}
				else {
					builder.removeSelect(MAM_BP_LCL_R.$lcl_cd);
					builder.addSelect(nvl( t.lcl_cd, value(up0().lcl_cd())).as("lcl_cd"));
					builder.addInnerJoin(subQuery().select(S1M.prAll())
							.from(S1M).where( S1M.lcl_cd.eq(bind(Srch01_CndR.$lcl_cd)))
							.view(bplcl1), t.bp_cd.eq(bplcl1.pr("bp_cd"))
							.and(t.lcl_cd.eq(bplcl1.pr("lcl_cd"))));
				}
				builder.addFullOuterJoin(bp1, t.bp_cd.eq(bp1.bp_cd));
				
				if (!up0().reg_flg() && up0().yet_flg()){
					builder.addWhereWithAnd(t.lcl_cd.isNull()) ;
				}
				else {
					builder.addWhereWithAnd(bp1.bp_cd.isNotNull());	
				}
			}
				builder.addWhereWithCutOffAnd(bp1.bp_cd.like(bind(Srch01_CndR.$bp_cd)));
			builder.addWhereWithCutOffAnd(t.bp_nm.like(bind(Srch01_CndR.$bp_nm)));
			builder.addWhereWithCutOffAnd(t.memo1.like(bind(Srch01_CndR.$memo1)));
			builder.addWhereWithCutOffAnd(t.memo2.like(bind(Srch01_CndR.$memo2)));
			builder.addWhereWithCutOffAnd(t.memo3.like(bind(Srch01_CndR.$memo3)));
			builder.addWhereWithCutOffAnd(t.memo4.like(bind(Srch01_CndR.$memo4)));
			builder.addWhereWithCutOffAnd(t.memo5.like(bind(Srch01_CndR.$memo5)));
			builder.addWhereWithCutOffAnd(t.memo6.like(bind(Srch01_CndR.$memo6)));
			builder.addWhereWithCutOffAnd(t.memo7.like(bind(Srch01_CndR.$memo7)));
			builder.addWhereWithCutOffAnd(t.memo8.like(bind(Srch01_CndR.$memo8)));
			builder.addWhereWithCutOffAnd(t.memo9.like(bind(Srch01_CndR.$memo9)));
			builder.addWhereWithCutOffAnd(t.memo10.like(bind(Srch01_CndR.$memo10)));
			builder.addWhereWithCutOffAnd(t.memo11.like(bind(Srch01_CndR.$memo11)));
			builder.addWhereWithCutOffAnd(t.memo12.like(bind(Srch01_CndR.$memo12)));
			builder.addWhereWithCutOffAnd(t.memo13.like(bind(Srch01_CndR.$memo13)));
			builder.addWhereWithCutOffAnd(t.memo14.like(bind(Srch01_CndR.$memo14)));
			builder.addWhereWithCutOffAnd(t.memo15.like(bind(Srch01_CndR.$memo15)));
			builder.addWhereWithCutOffAnd(t.memo16.like(bind(Srch01_CndR.$memo16)));
			builder.addWhereWithCutOffAnd(t.memo17.like(bind(Srch01_CndR.$memo17)));
			builder.addWhereWithCutOffAnd(t.memo18.like(bind(Srch01_CndR.$memo18)));
			builder.addWhereWithCutOffAnd(t.memo19.like(bind(Srch01_CndR.$memo19)));
			builder.addWhereWithCutOffAnd(t.memo20.like(bind(Srch01_CndR.$memo20)));
			
			builder.addWhereWithCutOffAnd(bp1.base_bp_nm.like(bind(Srch01_CndR.$bp_nm_std)));
			
			builder.removeSelect(MAM_BP_LCL_R.$bp_cd);
			builder.addSelect(bp1.bp_cd);
			builder.addSelect(bp1.base_bp_nm.as("bp_nm_std"));
			
			builder.addSelect(decode( t.bp_cd, nullValue(), value(true), value(false)).as("yet_flg"));
			rslt.addBooleanColumn("yet_flg");
			
			if(!isNull(up0().bp_grp_nm1())) {
				MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
				builder.addLeftOuterJoin(bg1, bp1.bp_grp_cd1.eq(bg1.bp_grp_cd)
						.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(bg1.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm1)));
			}
			if(!isNull(up0().bp_grp_nm2())) {
				MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
				builder.addLeftOuterJoin(bg2, bp1.bp_grp_cd2.eq(bg2.bp_grp_cd)
						.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(bg2.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm2)));
			}
			if(!isNull(up0().bp_grp_nm3())) {
				MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
				builder.addLeftOuterJoin(bg3, bp1.bp_grp_cd3.eq(bg3.bp_grp_cd)
						.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(bg3.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm3)));
			}
			if(!isNull(up0().bp_grp_nm4())) {
				MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
				builder.addLeftOuterJoin(bg4, bp1.bp_grp_cd4.eq(bg4.bp_grp_cd)
						.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(bg4.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm4)));
			}
			if(!isNull(up0().bp_grp_nm5())) {
				MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
				builder.addLeftOuterJoin(bg5, bp1.bp_grp_cd5.eq(bg5.bp_grp_cd)
						.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(bg5.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm5)));
			}
			if(!isNull(up0().bp_grp_nm6())) {
				MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
				builder.addLeftOuterJoin(bg6, bp1.bp_grp_cd6.eq(bg6.bp_grp_cd)
						.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(bg6.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm6)));
			}
			if(!isNull(up0().bp_grp_nm7())) {
				MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
				builder.addLeftOuterJoin(bg7, bp1.bp_grp_cd7.eq(bg7.bp_grp_cd)
						.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(bg7.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm7)));
			}
			if(!isNull(up0().bp_grp_nm8())) {
				MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
				builder.addLeftOuterJoin(bg8, bp1.bp_grp_cd8.eq(bg8.bp_grp_cd)
						.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(bg8.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm8)));
			}
			if(!isNull(up0().bp_grp_nm9())) {
				MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
				builder.addLeftOuterJoin(bg9, bp1.bp_grp_cd9.eq(bg9.bp_grp_cd)
						.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(bg9.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm9)));
			}
			if(!isNull(up0().bp_grp_nm10())) {
				MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
				builder.addLeftOuterJoin(bg10, bp1.bp_grp_cd10.eq(bg10.bp_grp_cd)
						.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(bg10.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm10)));
			}
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd1.like(bind(Srch01_CndR.$bp_grp_cd1)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd2.like(bind(Srch01_CndR.$bp_grp_cd2)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd3.like(bind(Srch01_CndR.$bp_grp_cd3)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd4.like(bind(Srch01_CndR.$bp_grp_cd4)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd5.like(bind(Srch01_CndR.$bp_grp_cd5)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd6.like(bind(Srch01_CndR.$bp_grp_cd6)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd7.like(bind(Srch01_CndR.$bp_grp_cd7)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd8.like(bind(Srch01_CndR.$bp_grp_cd8)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd9.like(bind(Srch01_CndR.$bp_grp_cd9)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd10.like(bind(Srch01_CndR.$bp_grp_cd10)));
		}
		protected <R extends MCDBContainer> void dbcCustomizeSubComCom(MCQueryApiBuilder builder,
				MCList<R> rslt) {

			MAM_BP_LCL_R t = MAM_BP_LCL_R.create(builder.getBaseDbcAlias());
			MAVM_BP_R bp1 = MAVM_BP_R.create("BP1");

			builder.setWhere(value(0).eq(value(0)));
			if (up0().reg_flg() && !up0().yet_flg()) {
				builder.addInnerJoin(bp1, t.bp_cd.eq(bp1.bp_cd));

				builder.addWhereWithCutOffAnd(t.lcl_cd.like(bind(Srch01_CndR.$lcl_cd)));
			}
			else {
				MAM_BP_LCL_R S1M = MAM_BP_LCL_R.create("M");
				MCTempView bplcl1 = createTempView("BPLCL1");
				if (isNull(up0().lcl_cd())){
					builder.addInnerJoin(subQuery().select(S1M.prAll())
							.from(S1M).view(bplcl1),
							t.bp_cd.eq(bplcl1.pr("bp_cd"))
							.and(t.lcl_cd.eq(bplcl1.pr("lcl_cd"))));
				}
				else {
					builder.removeSelect(MAM_BP_LCL_R.$lcl_cd);
					builder.addSelect(nvl( t.lcl_cd, value(up0().lcl_cd())).as("lcl_cd"));
					builder.addInnerJoin(subQuery().select(S1M.prAll())
							.from(S1M).where( S1M.lcl_cd.eq(bind(Srch01_CndR.$lcl_cd)))
							.view(bplcl1), t.bp_cd.eq(bplcl1.pr("bp_cd"))
							.and(t.lcl_cd.eq(bplcl1.pr("lcl_cd"))));
				}
				builder.addFullOuterJoin(bp1, t.bp_cd.eq(bp1.bp_cd));

				if (!up0().reg_flg() && up0().yet_flg()){
					builder.addWhereWithAnd(t.lcl_cd.isNull()) ;
				}
				else {
					builder.addWhereWithAnd(bp1.bp_cd.isNotNull());	
				}
			}
			builder.addWhereWithCutOffAnd(bp1.bp_cd.like(bind(Srch01_CndR.$bp_cd)));
			builder.addWhereWithCutOffAnd(t.bp_nm.like(bind(Srch01_CndR.$bp_nm)));
			builder.addWhereWithCutOffAnd(t.memo1.like(bind(Srch01_CndR.$memo1)));
			builder.addWhereWithCutOffAnd(t.memo2.like(bind(Srch01_CndR.$memo2)));
			builder.addWhereWithCutOffAnd(t.memo3.like(bind(Srch01_CndR.$memo3)));
			builder.addWhereWithCutOffAnd(t.memo4.like(bind(Srch01_CndR.$memo4)));
			builder.addWhereWithCutOffAnd(t.memo5.like(bind(Srch01_CndR.$memo5)));
			builder.addWhereWithCutOffAnd(t.memo6.like(bind(Srch01_CndR.$memo6)));
			builder.addWhereWithCutOffAnd(t.memo7.like(bind(Srch01_CndR.$memo7)));
			builder.addWhereWithCutOffAnd(t.memo8.like(bind(Srch01_CndR.$memo8)));
			builder.addWhereWithCutOffAnd(t.memo9.like(bind(Srch01_CndR.$memo9)));
			builder.addWhereWithCutOffAnd(t.memo10.like(bind(Srch01_CndR.$memo10)));
			builder.addWhereWithCutOffAnd(t.memo11.like(bind(Srch01_CndR.$memo11)));
			builder.addWhereWithCutOffAnd(t.memo12.like(bind(Srch01_CndR.$memo12)));
			builder.addWhereWithCutOffAnd(t.memo13.like(bind(Srch01_CndR.$memo13)));
			builder.addWhereWithCutOffAnd(t.memo14.like(bind(Srch01_CndR.$memo14)));
			builder.addWhereWithCutOffAnd(t.memo15.like(bind(Srch01_CndR.$memo15)));
			builder.addWhereWithCutOffAnd(t.memo16.like(bind(Srch01_CndR.$memo16)));
			builder.addWhereWithCutOffAnd(t.memo17.like(bind(Srch01_CndR.$memo17)));
			builder.addWhereWithCutOffAnd(t.memo18.like(bind(Srch01_CndR.$memo18)));
			builder.addWhereWithCutOffAnd(t.memo19.like(bind(Srch01_CndR.$memo19)));
			builder.addWhereWithCutOffAnd(t.memo20.like(bind(Srch01_CndR.$memo20)));

			builder.addWhereWithCutOffAnd(bp1.base_bp_nm.like(bind(Srch01_CndR.$bp_nm_std)));

			builder.removeSelect(MAM_BP_LCL_R.$bp_cd);
			builder.addSelect(bp1.bp_cd);
			builder.addSelect(bp1.base_bp_nm.as("bp_nm_std"));

			builder.addSelect(decode( t.bp_cd, nullValue(), value(true), value(false)).as("yet_flg"));
			rslt.addBooleanColumn("yet_flg");

			if(!isNull(up0().bp_grp_nm1())) {
				MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
				builder.addLeftOuterJoin(bg1, bp1.bp_grp_cd1.eq(bg1.bp_grp_cd)
						.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(bg1.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm1)));
			}
			if(!isNull(up0().bp_grp_nm2())) {
				MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
				builder.addLeftOuterJoin(bg2, bp1.bp_grp_cd2.eq(bg2.bp_grp_cd)
						.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(bg2.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm2)));
			}
			if(!isNull(up0().bp_grp_nm3())) {
				MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
				builder.addLeftOuterJoin(bg3, bp1.bp_grp_cd3.eq(bg3.bp_grp_cd)
						.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(bg3.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm3)));
			}
			if(!isNull(up0().bp_grp_nm4())) {
				MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
				builder.addLeftOuterJoin(bg4, bp1.bp_grp_cd4.eq(bg4.bp_grp_cd)
						.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(bg4.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm4)));
			}
			if(!isNull(up0().bp_grp_nm5())) {
				MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
				builder.addLeftOuterJoin(bg5, bp1.bp_grp_cd5.eq(bg5.bp_grp_cd)
						.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(bg5.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm5)));
			}
			if(!isNull(up0().bp_grp_nm6())) {
				MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
				builder.addLeftOuterJoin(bg6, bp1.bp_grp_cd6.eq(bg6.bp_grp_cd)
						.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(bg6.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm6)));
			}
			if(!isNull(up0().bp_grp_nm7())) {
				MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
				builder.addLeftOuterJoin(bg7, bp1.bp_grp_cd7.eq(bg7.bp_grp_cd)
						.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(bg7.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm7)));
			}
			if(!isNull(up0().bp_grp_nm8())) {
				MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
				builder.addLeftOuterJoin(bg8, bp1.bp_grp_cd8.eq(bg8.bp_grp_cd)
						.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(bg8.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm8)));
			}
			if(!isNull(up0().bp_grp_nm9())) {
				MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
				builder.addLeftOuterJoin(bg9, bp1.bp_grp_cd9.eq(bg9.bp_grp_cd)
						.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(bg9.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm9)));
			}
			if(!isNull(up0().bp_grp_nm10())) {
				MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
				builder.addLeftOuterJoin(bg10, bp1.bp_grp_cd10.eq(bg10.bp_grp_cd)
						.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(bg10.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm10)));
			}
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd1.like(bind(Srch01_CndR.$bp_grp_cd1)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd2.like(bind(Srch01_CndR.$bp_grp_cd2)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd3.like(bind(Srch01_CndR.$bp_grp_cd3)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd4.like(bind(Srch01_CndR.$bp_grp_cd4)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd5.like(bind(Srch01_CndR.$bp_grp_cd5)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd6.like(bind(Srch01_CndR.$bp_grp_cd6)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd7.like(bind(Srch01_CndR.$bp_grp_cd7)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd8.like(bind(Srch01_CndR.$bp_grp_cd8)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd9.like(bind(Srch01_CndR.$bp_grp_cd9)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd10.like(bind(Srch01_CndR.$bp_grp_cd10)));
		}
		
		@Override
		protected void down_SELECT_c0_0(Srch01_RsltR r_dest, MAM_BP_LCL_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			// ロケール名
			if (!isNull(r_src.lcl_cd())) {
				MCList<MCRow> lclLst = MCConfig.common.getEntryLocaleList("lcl_cd", "lcl_nm");
				MCRow row = lclLst.getFirst("lcl_cd", r_src.lcl_cd());
				if (row != null) {
					r_dest.lcl_nm(row.getStringNE("lcl_nm"));
				}
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 取引先名称の登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_BpLclReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 取引先名称の削除を行います。<br>
	 */
	public class Del01 extends MABCL_BpLclReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}