package mcframe.serverMABC.MABCL0400;

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
import mcframe.serverMABC.MABCL0400.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.sys.MCSys;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMABC.MABCL0400.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ItmRlsReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ItmRlsReg_MC extends MABCL_ItmRlsReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmRls_UpdChk01オペレーション.<p>
	 *
	 * 品目リリースの登録前のチェックを行います。<br>
	 */
	public class ItmRls_UpdChk01 extends MABCL_ItmRlsReg_MC_A.ItmRls_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();
			
			// 品目単位マスタからデータを取得
			initItmUnitCache(up0());

			for (ItmRls_UpdChk01_DtlR r : up0()) {
				if (r.getBooleanNE("err_flg")) {
					continue;
				}
				
				MAVM_ITM_UNIT_R itmUnitR ;
				if (!isNull(r.ship_unit_cd())) {
					itmUnitR = getItmUnitR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.ship_unit_cd());
					if (itmUnitR == null) {
						msgList.add(new MCMessage(r, ItmRls_UpdChk01_DtlR.$itm_cd, MABCL0305, 
								getLabel(r, ItmRls_UpdChk01_DtlR.$ship_unit_cd),
								r.ship_unit_cd(),
								toDispGUIIndex(r)));
					}
				}
				if (!isNull(r.mfg_unit_cd())) {
					itmUnitR = getItmUnitR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.mfg_unit_cd());
					if (itmUnitR == null) {
						msgList.add(new MCMessage(r, ItmRls_UpdChk01_DtlR.$itm_cd, MABCL0305, 
								getLabel(r, ItmRls_UpdChk01_DtlR.$mfg_unit_cd),
								r.mfg_unit_cd(),
								toDispGUIIndex(r)));
					}
				}
				if (!isNull(r.purc_unit_cd())) {
					itmUnitR = getItmUnitR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.purc_unit_cd());
					if (itmUnitR == null) {
						msgList.add(new MCMessage(r, ItmRls_UpdChk01_DtlR.$itm_cd, MABCL0305, 
								getLabel(r, ItmRls_UpdChk01_DtlR.$purc_unit_cd),
								r.purc_unit_cd(),
								toDispGUIIndex(r)));
					}
				}
				if (!isNull(r.pckg_unit_cd())) {
					itmUnitR = getItmUnitR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.pckg_unit_cd());
					if (itmUnitR == null) {
						msgList.add(new MCMessage(r, ItmRls_UpdChk01_DtlR.$itm_cd, MABCL0305, 
								getLabel(r, ItmRls_UpdChk01_DtlR.$pckg_unit_cd),
								r.pckg_unit_cd(),
								toDispGUIIndex(r)));
					}
				}
			}
			
			return msgList;
		}
	}
	/**
	 * ItmRls_Upd01オペレーション.<p>
	 *
	 * 品目リリースの登録を行います。<br>
	 */
	public class ItmRls_Upd01 extends MABCL_ItmRlsReg_MC_A.ItmRls_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			setItmRlsSub();
			super.up();
		}

		protected void setItmRlsSub() {
			for (ItmRls_UpdChk01_DtlR r : up0()) {
				r.co_cd(getCo().co_cd());
				r.release_flg(true);
				r.release_usr_cd(MCSys.user.ID());
				r.release_tm(MCDate.now());
			}
		}
		
		@Override
		protected <R extends MCDBContainer> void updDbcCustomize(
				MCQueryApiBuilder builder, MCList<R> list) {
			super.updDbcCustomize(builder, list);
			if(builder.getBaseDbc() instanceof MAM_ITM_COM_R){
				dbcCustomizeSet(builder);
			}
		}

		// 上り電文だけを更新する
		protected void dbcCustomizeSet(MCQueryApiBuilder builder) {
			MAM_ITM_COM_R t = MAM_ITM_COM_R.create(builder.getBaseDbcAlias());
			builder.setSet(t.memo1) ;
			builder.addSet(t.memo2) ;
			builder.addSet(t.memo3) ;
			builder.addSet(t.release_flg) ;
			builder.addSet(t.release_usr_cd) ;
			builder.addSet(t.release_tm) ;
		}

		@Override
		protected <R extends MCDBContainer> void updateMain(MCQueryApiBuilder builder,
				MCList<R> list) {
			updateCustom(builder, list);
		}
	}
	/**
	 * ItmRls_DelChk01オペレーション.<p>
	 *
	 * 品目リリースの取消前のチェックを行います。<br>
	 */
	public class ItmRls_DelChk01 extends MABCL_ItmRlsReg_MC_A.ItmRls_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmRls_Del01オペレーション.<p>
	 *
	 * 品目リリースの取消を行います。<br>
	 */
	public class ItmRls_Del01 extends MABCL_ItmRlsReg_MC_A.ItmRls_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void up() {
			setItmRlsSub();
			super.up();
		}

		protected void setItmRlsSub() {
			for (ItmRls_DelChk01_DtlR r : up0()) {
				r.co_cd(getCo().co_cd());
				r.release_flg(false);
				r.release_usr_cd(null);
				r.release_tm(null);
			}
		}

		@Override
		protected <R extends MCDBContainer> void updDbcCustomize(
				MCQueryApiBuilder builder, MCList<R> list) {
			super.updDbcCustomize(builder, list);
			if(builder.getBaseDbc() instanceof MAM_ITM_COM_R){
				dbcCustomizeSet(builder);
			}
		}
		
		protected void dbcCustomizeSet(MCQueryApiBuilder builder) {
			MAM_ITM_COM_R t = MAM_ITM_COM_R.create(builder.getBaseDbcAlias());

			builder.setSet(t.memo1) ;
			builder.addSet(t.memo2) ;
			builder.addSet(t.memo3) ;
			builder.addSet(t.release_flg) ;
			builder.addSet(t.release_usr_cd) ;
			builder.addSet(t.release_tm) ;
		}

		@Override
		protected <R extends MCDBContainer> void updateMain(MCQueryApiBuilder builder,
				MCList<R> list) {
			updateCustom(builder, list);
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目リリースの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_ItmRlsReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}
		
		protected boolean _sls_tar_out;
		protected boolean _sls_tar;
		protected boolean _sls_no_input;
		protected boolean _sls_input;
		protected boolean _mfg_tar_out;
		protected boolean _mfg_tar;
		protected boolean _mfg_no_input;
		protected boolean _mfg_input;
		protected boolean _purc_tar_out;
		protected boolean _purc_tar;
		protected boolean _purc_no_input;
		protected boolean _purc_input;
		protected boolean _insp_tar_out;
		protected boolean _insp_tar;
		protected boolean _insp_no_input;
		protected boolean _insp_input;
		protected boolean _release_on;
		protected boolean _release_off;
		
		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);
			condCustomizeSub((Srch01_CndR) cond);
		}
		
		protected void condCustomizeSub(Srch01_CndR cond){
			// 販売
			_sls_tar_out = cond.sls_tar_out_flg();
			_sls_tar = cond.sls_tar_flg();
			_sls_no_input = cond.sls_no_input_flg();
			_sls_input = cond.sls_input_flg();
			// 製造
			_mfg_tar_out = cond.mfg_tar_out_flg();
			_mfg_tar = cond.mfg_tar_flg();
			_mfg_no_input = cond.mfg_no_input_flg();
			_mfg_input = cond.mfg_input_flg();
			// 購買
			_purc_tar_out = cond.purc_tar_out_flg();
			_purc_tar = cond.purc_tar_flg();
			_purc_no_input = cond.purc_no_input_flg();
			_purc_input = cond.purc_input_flg();
			// 検査
			_insp_tar_out = cond.insp_tar_out_flg();
			_insp_tar = cond.insp_tar_flg();
			_insp_no_input = cond.insp_no_input_flg();
			_insp_input = cond.insp_input_flg();
			
			_release_on = cond.release_flg_on();
			_release_off = cond.release_flg_off();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_ITM__R){
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			addSelect(builder);
			addJoinTable(builder);
			addFlgWhere(builder);
		}
		
		protected void addSelect(MCQueryApiBuilder builder) {
			MAM_ITM__R t = MAM_ITM__R.create(builder.getBaseDbcAlias());
			
			// 名称の取得
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			MAM_USR_R usr1 = MAM_USR_R.create("USR1");
			builder.addSelect(itmtypd1.itm_typ_d_nm);
			builder.addSelect(usr1.usr_nm.as("release_usr_nm"));
			// 購買単価マスタの件数
			MAM_PURC_UPRI__R S1PURC1 = MAM_PURC_UPRI__R.create("PURC1");
			builder.addSelect(bracket( subQuery() .select(countAll())
					.from(S1PURC1) .where( S1PURC1.itm_cd.eq(t.itm_cd)
							.and(S1PURC1.itm_sub1.eq(t.itm_sub1))
							.and(S1PURC1.itm_sub2.eq(t.itm_sub2))
							.and(S1PURC1.itm_sub3.eq(t.itm_sub3))
							.and(S1PURC1.del_flg.eq(value(false))) )).as("purc_upri"));
			// 得意先販売単価マスタの件数
			MAM_CST_SLS_UPRI__R S1CST1 = MAM_CST_SLS_UPRI__R.create("CST1");
			builder.addSelect(bracket( subQuery() .select(countAll())
					.from(S1CST1) .where( S1CST1.itm_cd.eq(t.itm_cd)
							.and(S1CST1.itm_sub1.eq(t.itm_sub1))
							.and(S1CST1.itm_sub2.eq(t.itm_sub2))
							.and(S1CST1.itm_sub3.eq(t.itm_sub3))
							.and(S1CST1.del_flg.eq(value(false))) )).as("cst_upri"));
			// 品目販売単価マスタの件数
			MAM_ITM_SLS_UPRI__R S1ITM1 = MAM_ITM_SLS_UPRI__R.create("ITM1");
			builder.addSelect(bracket( subQuery() .select(countAll())
					.from(S1ITM1) .where( S1ITM1.itm_cd.eq(t.itm_cd)
							.and(S1ITM1.itm_sub1.eq(t.itm_sub1))
							.and(S1ITM1.itm_sub2.eq(t.itm_sub2))
							.and(S1ITM1.itm_sub3.eq(t.itm_sub3))
							.and(S1ITM1.del_flg.eq(value(false))) )).as("itm_upri"));
			// 標準販売単価マスタの件数
			MAM_STD_SLS_UPRI__R S1STD1 = MAM_STD_SLS_UPRI__R.create("STD1");
			builder.addSelect(bracket( subQuery() .select(countAll())
					.from(S1STD1) .where( S1STD1.itm_cd.eq(t.itm_cd)
							.and(S1STD1.itm_sub1.eq(t.itm_sub1))
							.and(S1STD1.itm_sub2.eq(t.itm_sub2))
							.and(S1STD1.itm_sub3.eq(t.itm_sub3))
							.and(S1STD1.del_flg.eq(value(false))) )).as("std_upri"));
			// 支給単価マスタの件数
			MAM_PROV_UPRI__R S1PROV1 = MAM_PROV_UPRI__R.create("PROV1");
			builder.addSelect(bracket( subQuery() .select(countAll())
					.from(S1PROV1) .where( S1PROV1.itm_cd.eq(t.itm_cd)
							.and(S1PROV1.itm_sub1.eq(t.itm_sub1))
							.and(S1PROV1.itm_sub2.eq(t.itm_sub2))
							.and(S1PROV1.itm_sub3.eq(t.itm_sub3))
							.and(S1PROV1.del_flg.eq(value(false))) )).as("prov_upri"));
			// 加工単価マスタの件数
			MAM_PROC_UPRI__R S1PROC1 = MAM_PROC_UPRI__R.create("PROC1");
			builder.addSelect(bracket( subQuery() .select(countAll())
					.from(S1PROC1) .where( S1PROC1.itm_cd.eq(t.itm_cd)
							.and(S1PROC1.itm_sub1.eq(t.itm_sub1))
							.and(S1PROC1.itm_sub2.eq(t.itm_sub2))
							.and(S1PROC1.itm_sub3.eq(t.itm_sub3))
							.and(S1PROC1.del_flg.eq(value(false))) )).as("proc_upri"));
		}

		protected void addJoinTable(MCQueryApiBuilder builder) {

			MAM_ITM__R t = MAM_ITM__R.create(builder.getBaseDbcAlias());
			builder.addWhereWithAnd(t.del_flg.eq(value(false)));
			
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			builder.addLeftOuterJoin(itmtypd1, t.itm_typ.eq(itmtypd1.itm_typ)
					.and(t.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));	
			builder.addWhereWithCutOffAnd(itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));
			
			MAM_USR_R usr1 = MAM_USR_R.create("USR1");
			builder.addLeftOuterJoin(usr1, t.release_usr_cd.eq(usr1.usr_cd));
			
			if(!isNull(up0().itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
				builder.addLeftOuterJoin(ig1, t.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			}
			if(!isNull(up0().itm_grp_nm2())) {
				MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
				builder.addLeftOuterJoin(ig2, t.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			}
			if(!isNull(up0().itm_grp_nm3())) {
				MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
				builder.addLeftOuterJoin(ig3, t.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			}
			if(!isNull(up0().itm_grp_nm4())) {
				MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
				builder.addLeftOuterJoin(ig4, t.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			}
			if(!isNull(up0().itm_grp_nm5())) {
				MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
				builder.addLeftOuterJoin(ig5, t.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			}
			if(!isNull(up0().itm_grp_nm6())) {
				MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
				builder.addLeftOuterJoin(ig6, t.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			}
			if(!isNull(up0().itm_grp_nm7())) {
				MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
				builder.addLeftOuterJoin(ig7, t.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			}
			if(!isNull(up0().itm_grp_nm8())) {
				MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
				builder.addLeftOuterJoin(ig8, t.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			}
			if(!isNull(up0().itm_grp_nm9())) {
				MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
				builder.addLeftOuterJoin(ig9, t.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			}
			if(!isNull(up0().itm_grp_nm10())) {
				MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
				builder.addLeftOuterJoin(ig10, t.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
			}
		}

		protected void addFlgWhere(MCQueryApiBuilder builder) {
			MAM_ITM__R t= MAM_ITM__R.create(builder.getBaseDbcAlias());
			// 販売
			if (_sls_tar_out && !_sls_tar) {
				builder.addWhereWithAnd(t.sls_flg.eq(value(false)));
			}
			if (!_sls_tar_out && _sls_tar) {
				builder.addWhereWithAnd(t.sls_flg.eq(value(true)));
			}
			if (_sls_no_input && !_sls_input) {
				builder.addWhereWithAnd(t.sls_input_flg.eq(value(false)));
			}
			if (!_sls_no_input && _sls_input) {
				builder.addWhereWithAnd(t.sls_input_flg.eq(value(true)));
			}
			// 製造
			if (_mfg_tar_out && !_mfg_tar) {
				builder.addWhereWithAnd(t.mfg_flg.eq(value(false)));
			}
			if (!_mfg_tar_out && _mfg_tar) {
				builder.addWhereWithAnd(t.mfg_flg.eq(value(true)));
			}
			if (_mfg_no_input && !_mfg_input) {
				builder.addWhereWithAnd(t.mfg_input_flg.eq(value(false)));
			}
			if (!_mfg_no_input && _mfg_input) {
				builder.addWhereWithAnd(t.mfg_input_flg.eq(value(true)));
			}
			// 購買
			if (_purc_tar_out && !_purc_tar) {
				builder.addWhereWithAnd(t.purc_flg.eq(value(false)));
			}
			if (!_purc_tar_out && _purc_tar) {
				builder.addWhereWithAnd(t.purc_flg.eq(value(true)));
			}
			if (_purc_no_input && !_purc_input) {
				builder.addWhereWithAnd(t.purc_input_flg.eq(value(false)));
			}
			if (!_purc_no_input && _purc_input) {
				builder.addWhereWithAnd(t.purc_input_flg.eq(value(true)));
			}
			// 検査
			if (_insp_tar_out && !_insp_tar) {
				builder.addWhereWithAnd(t.insp_flg.eq(value(false)));
			}
			if (!_insp_tar_out && _insp_tar) {
				builder.addWhereWithAnd(t.insp_flg.eq(value(true)));
			}
			if (_insp_no_input && !_insp_input) {
				builder.addWhereWithAnd(t.insp_input_flg.eq(value(false)));
			}
			if (!_insp_no_input && _insp_input) {
				builder.addWhereWithAnd(t.insp_input_flg.eq(value(true)));
			}
			// リリース
			if (_release_on && !_release_off) {
				builder.addWhereWithAnd(t.release_flg.eq(value(true)));
			}
			if (!_release_on && _release_off) {
				builder.addWhereWithAnd(t.release_flg.eq(value(false)));
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目リリースの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_ItmRlsReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目リリースの取消を行います。<br>
	 */
	public class Del01 extends MABCL_ItmRlsReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	
	// ///////////////////////////////////////////////
	// マスタ取得（ここから）
	// ///////////////////////////////////////////////
	protected static final Class<MABCL_ItmRlsReg> CLAZZ = MABCL_ItmRlsReg.class;

	/**
	 * 品目単位チェックワークテーブル作成
	 */
	protected void insItmUnitWk(MCList<? extends MCRow> dtlL) {
		MAW_ITM_UNIT_CHK_R S0T = MAW_ITM_UNIT_CHK_R.create("T");

		execDbWkDelete("MABCL0400_MAW_ITM_UNIT_CHK_D01", S0T);

		MCInsert q1 = sql("MABCL0400_MAW_ITM_UNIT_CHK_I01")
				.insert(S0T)
				.columns(
					S0T.itm_cd,
					S0T.itm_sub1,
					S0T.itm_sub2,
					S0T.itm_sub3,
					S0T.ship_unit_cd,
					S0T.mfg_unit_cd,
					S0T.purc_unit_cd,
					S0T.pckg_unit_cd
				)
				.values(
					bind("itm_cd"),
					bind("itm_sub1"),
					bind("itm_sub2"),
					bind("itm_sub3"),
					bind("ship_unit_cd"),
					bind("mfg_unit_cd"),
					bind("purc_unit_cd"),
					bind("pckg_unit_cd")
				);
		q1.executeBatchUpdate(dtlL);
	}

	/**
	 * 「MAVM_ITM_UNIT」取得
	 */
	MCList<MAVM_ITM_UNIT_R> _itm_unitL;
	MCIndexKey _itm_unitKey;
	protected void initItmUnitCache(MCList<? extends MCRow> dtlL) {
		// ワーク作成
		insItmUnitWk(dtlL);

		// 検索
		MCList<MAVM_ITM_UNIT_R> dbc = MCList.create(MAVM_ITM_UNIT_R.class);
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAW_ITM_UNIT_CHK_R S1W = MAW_ITM_UNIT_CHK_R.create("W");
		dbc_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.unit_cd);
		dbc_bldr.addInnerJoin(S1W, bracket((value(0).eq(value(0))
						.and(S1W.itm_cd.eq(t.itm_cd))
						.and(S1W.itm_sub1.eq(t.itm_sub1))
						.and(S1W.itm_sub2.eq(t.itm_sub2))
						.and(S1W.itm_sub3.eq(t.itm_sub3))
						.and( S1W.ship_unit_cd.eq(t.unit_cd)
								.or(S1W.mfg_unit_cd.eq(t.unit_cd))
								.or(S1W.purc_unit_cd.eq(t.unit_cd))
								.or(S1W.pckg_unit_cd.eq(t.unit_cd)) ) )));
		dbSelect("MABCL0400_MAVM_ITM_UNIT_S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._itm_unitL = dbc;
		object(CLAZZ)._itm_unitKey = object(CLAZZ)._itm_unitL.createIndex(
				MAVM_ITM_UNIT_R.$itm_cd,
				MAVM_ITM_UNIT_R.$itm_sub1,
				MAVM_ITM_UNIT_R.$itm_sub2,
				MAVM_ITM_UNIT_R.$itm_sub3,
				MAVM_ITM_UNIT_R.$unit_cd
		);
	}

	protected MAVM_ITM_UNIT_R getItmUnitR(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
		return object(CLAZZ)._itm_unitL.getFirst(object(CLAZZ)._itm_unitKey, itmCd, itmSub1, itmSub2, itmSub3, unitCd);
	}
	// ///////////////////////////////////////////////
	// マスタ取得（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// 更新共通処理（ここから）
	// ///////////////////////////////////////////////
	protected <R extends MCDBContainer> void updateCustom(MCQueryApiBuilder builder,
			MCList<R> list) {

		insItmWk(list);

		MCList<R> lockedList = list.createInstance();
		MCDBContainer t = builder.getBaseDbc();
		MCQueryApiBuilder lockedList_bldr = MCQueryApiBuilder.create(t);
		MAW_ITM_KEY_R w = MAW_ITM_KEY_R.create("W");
		lockedList_bldr.setSelect(lockedList_bldr.getBaseDbc().getKeyColumn$());
		lockedList_bldr.addSelect(t.getColumn$("upd_cntr"));
		lockedList_bldr.addInnerJoin(w, bracket(MCQueryApiBuilder
				.makeEq(w.itm_cd, t.getColumn$("itm_cd"))
				.and(MCQueryApiBuilder.makeEq(w.itm_sub1, t.getColumn$("itm_sub1")))
				.and(MCQueryApiBuilder.makeEq(w.itm_sub2, t.getColumn$("itm_sub2")))
				.and(MCQueryApiBuilder.makeEq(w.itm_sub3, t.getColumn$("itm_sub3")))));
		dbSelectForUpdateNoWait(createSqlId(LOGIC_ID, lockedList_bldr.getBaseDbc(), "S51"),
				lockedList, lockedList_bldr);

		String[] keys = t.getKeyColumn();
		MCJoinKey<MCList<R>> jk = list.join(keys, lockedList,
				lockedList.createIndex(keys));
		for (R row : list) {
			R lockedRow = row.getJoinedRow(jk);
			checkUpdCntr(row, lockedRow);
		}

		dbUpdateKey(createSqlId(LOGIC_ID, builder.getBaseDbc(), "U51"), list, builder);
	}
	/**
	 * 品目マスタの主キーワークテーブル作成
	 */
	protected void insItmWk(MCList<? extends MCRow> bindL) {
		MAW_ITM_KEY_R S0T = MAW_ITM_KEY_R.create("T");

		dbWkDelete("MABCL0400_MAW_ITM_KEY_D01", MAM_ITM_R.create());
		
		MCInsert q1 = sql("MABCL0400_MAW_ITM_KEY_I01")
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
		q1.executeBatchUpdate(bindL);
	}
	// ///////////////////////////////////////////////
	// 更新共通処理（ここまで）
	// ///////////////////////////////////////////////
	/**
	 * ItmRls_UpdChk02オペレーション.<p>
	 *
	 * 品目リリースを原価に反映する前のチェックを行います。<br>
	 */
	public class ItmRls_UpdChk02 extends MABCL_ItmRlsReg_MC_A.ItmRls_UpdChk02 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmRls_Upd02オペレーション.<p>
	 *
	 * 品目リリースを原価に反映します。<br>
	 */
	public class ItmRls_Upd02 extends MABCL_ItmRlsReg_MC_A.ItmRls_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(autoCommitDBTran());
				writeStartLogWithLogger(null);
				execUpd();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execUpd() {
			MAW_IMP_ITM_R S0 = MAW_IMP_ITM_R.create();
			MCDelete q = sql("MABCL0400_MAW_IMP_ITM_D01").delete(S0);
			q.executeUpdate(autoCommitDBTran(), null, null, null);
			executeBatchUpdate(MABCL0400_MAW_IMP_ITM_I01(), autoCommitDBTran(), null, up0(), null, null);

			String procId = "MAPA_COST_IMP$P_MAIN";
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, up1(), null, ":term, :tgt_dt");
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 品目リリースを原価に反映します。<br>
	 */
	public class Upd02 extends MABCL_ItmRlsReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}