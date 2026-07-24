package mcframe.serverMABC.MABCL0250;

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
import mcframe.serverMABC.MABCL0250.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.login.MCLicense;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_UsrAclReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_UsrAclReg_MC extends MABCL_UsrAclReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * UsrAcl_UpdChk01オペレーション.<p>
	 *
	 * 担当者権限マスタの登録前のチェックを行います。<br>
	 */
	public class UsrAcl_UpdChk01 extends MABCL_UsrAclReg_MC_A.UsrAcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			MCMessageList msgList = super.doServerCheckSub(up);
			
			// 入力制限チェック
			for (MCConstRow row : up) {
				if (!(row instanceof UsrAcl_UpdChk01_DtlR)) {
					break;
				}
				UsrAcl_UpdChk01_DtlR r = (UsrAcl_UpdChk01_DtlR)row;

				if (r.del_flg()) {
					continue ;
				}

				// 部門のチェック
				if (isNull(r.dpt_cd()) && !isNull(r.add_dpt_cd1())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$add_dpt_cd1, MABCL0097, toDispGUIIndex(row)));
				}
				if (isNull(r.add_dpt_cd1()) && !isNull(r.add_dpt_cd2())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$add_dpt_cd2, MABCL0098, toDispGUIIndex(row)));
				}
				if (isNull(r.add_dpt_cd2()) && !isNull(r.add_dpt_cd3())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$add_dpt_cd3, MABCL0099, toDispGUIIndex(row)));
				}
				if (isNull(r.add_dpt_cd3()) && !isNull(r.add_dpt_cd4())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$add_dpt_cd4, MABCL0100, toDispGUIIndex(row)));
				}
				if (isNull(r.add_dpt_cd4()) && !isNull(r.add_dpt_cd5())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$add_dpt_cd5, MABCL0101, toDispGUIIndex(row)));
				}
				if (isNull(r.add_dpt_cd5()) && !isNull(r.add_dpt_cd6())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$add_dpt_cd6, MABCL0102, toDispGUIIndex(row)));
				}
				if (isNull(r.add_dpt_cd6()) && !isNull(r.add_dpt_cd7())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$add_dpt_cd7, MABCL0103, toDispGUIIndex(row)));
				}
				if (isNull(r.add_dpt_cd7()) && !isNull(r.add_dpt_cd8())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$add_dpt_cd8, MABCL0104, toDispGUIIndex(row)));
				}
				if (isNull(r.add_dpt_cd8()) && !isNull(r.add_dpt_cd9())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$add_dpt_cd9, MABCL0105, toDispGUIIndex(row)));
				}
				
				// 承認役割（主）のチェック
				if (isNull(r.aprv_role_cd()) && !isNull(r.aprv_role_cd1())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$aprv_role_cd1, MABCL0106, toDispGUIIndex(row)));
				}
				if (isNull(r.aprv_role_cd1()) && !isNull(r.aprv_role_cd2())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$aprv_role_cd2, MABCL0107, toDispGUIIndex(row)));
				}
				if (isNull(r.aprv_role_cd2()) && !isNull(r.aprv_role_cd3())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$aprv_role_cd3, MABCL0108, toDispGUIIndex(row)));
				}
				if (isNull(r.aprv_role_cd3()) && !isNull(r.aprv_role_cd4())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$aprv_role_cd4, MABCL0109, toDispGUIIndex(row)));
				}
				if (isNull(r.aprv_role_cd4()) && !isNull(r.aprv_role_cd5())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$aprv_role_cd5, MABCL0110, toDispGUIIndex(row)));
				}
				if (isNull(r.aprv_role_cd5()) && !isNull(r.aprv_role_cd6())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$aprv_role_cd6, MABCL0111, toDispGUIIndex(row)));
				}
				if (isNull(r.aprv_role_cd6()) && !isNull(r.aprv_role_cd7())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$aprv_role_cd7, MABCL0112, toDispGUIIndex(row)));
				}
				if (isNull(r.aprv_role_cd7()) && !isNull(r.aprv_role_cd8())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$aprv_role_cd8, MABCL0113, toDispGUIIndex(row)));
				}
				if (isNull(r.aprv_role_cd8()) && !isNull(r.aprv_role_cd9())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$aprv_role_cd9, MABCL0114, toDispGUIIndex(row)));
				}
				
				// 承認役割（副）のチェック
				if (isNull(r.sub_aprv_role_cd()) && !isNull(r.sub_aprv_role_cd1())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd1, MABCL0115, toDispGUIIndex(row)));
				}
				if (isNull(r.sub_aprv_role_cd1()) && !isNull(r.sub_aprv_role_cd2())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd2, MABCL0116, toDispGUIIndex(row)));
				}
				if (isNull(r.sub_aprv_role_cd2()) && !isNull(r.sub_aprv_role_cd3())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd3, MABCL0117, toDispGUIIndex(row)));
				}
				if (isNull(r.sub_aprv_role_cd3()) && !isNull(r.sub_aprv_role_cd4())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd4, MABCL0118, toDispGUIIndex(row)));
				}
				if (isNull(r.sub_aprv_role_cd4()) && !isNull(r.sub_aprv_role_cd5())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd5, MABCL0119, toDispGUIIndex(row)));
				}
				if (isNull(r.sub_aprv_role_cd5()) && !isNull(r.sub_aprv_role_cd6())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd6, MABCL0120, toDispGUIIndex(row)));
				}
				if (isNull(r.sub_aprv_role_cd6()) && !isNull(r.sub_aprv_role_cd7())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd7, MABCL0121, toDispGUIIndex(row)));
				}
				if (isNull(r.sub_aprv_role_cd7()) && !isNull(r.sub_aprv_role_cd8())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd8, MABCL0122, toDispGUIIndex(row)));
				}
				if (isNull(r.sub_aprv_role_cd8()) && !isNull(r.sub_aprv_role_cd9())) {
					msgList.add(new MCMessage(row, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd9,  MABCL0123, toDispGUIIndex(row)));
				}
				
				// 部門、承認役割重複チェック
				msgList.addAll(checkDupCols(r, getDptCols(), MABCL0124));
				msgList.addAll(checkDupCols(r, getAprvRoleCols(), MABCL0125));
				
			}
			
			return msgList;
		}
		
		/**
		 * カラムの重複チェックを行う
		 * @param r
		 * @param cols
		 * @param id メッセージＩＤ
		 * @return
		 */
		protected MCMessageList checkDupCols(UsrAcl_UpdChk01_DtlR r, String[] cols, String id) {
			MCMessageList msgList = new MCMessageList();
			
			List<String> l = new ArrayList<String>();
			for (String col : cols) {
				String v = r.getStringNE(col);
				if (!isNull(v)) {
					if (l.contains(v)) {
						msgList.add(new MCMessage(r, null, id, toDispGUIIndex(r)));
						return msgList;
					}
					l.add(v);
				}
			}

			return msgList;
		}
		
		protected String[] getDptCols() {
			return new String[] {UsrAcl_UpdChk01_DtlR.$dpt_cd, UsrAcl_UpdChk01_DtlR.$add_dpt_cd1,
					UsrAcl_UpdChk01_DtlR.$add_dpt_cd2, UsrAcl_UpdChk01_DtlR.$add_dpt_cd3,
					UsrAcl_UpdChk01_DtlR.$add_dpt_cd4, UsrAcl_UpdChk01_DtlR.$add_dpt_cd5,
					UsrAcl_UpdChk01_DtlR.$add_dpt_cd6, UsrAcl_UpdChk01_DtlR.$add_dpt_cd7,
					UsrAcl_UpdChk01_DtlR.$add_dpt_cd8, UsrAcl_UpdChk01_DtlR.$add_dpt_cd9};
		}
		
		protected String[] getAprvRoleCols() {
			return new String[] {UsrAcl_UpdChk01_DtlR.$aprv_role_cd, UsrAcl_UpdChk01_DtlR.$aprv_role_cd1,
					UsrAcl_UpdChk01_DtlR.$aprv_role_cd2, UsrAcl_UpdChk01_DtlR.$aprv_role_cd3,
					UsrAcl_UpdChk01_DtlR.$aprv_role_cd4, UsrAcl_UpdChk01_DtlR.$aprv_role_cd5,
					UsrAcl_UpdChk01_DtlR.$aprv_role_cd6, UsrAcl_UpdChk01_DtlR.$aprv_role_cd7,
					UsrAcl_UpdChk01_DtlR.$aprv_role_cd8, UsrAcl_UpdChk01_DtlR.$aprv_role_cd9,
					UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd1,
					UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd2, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd3,
					UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd4, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd5,
					UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd6, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd7,
					UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd8, UsrAcl_UpdChk01_DtlR.$sub_aprv_role_cd9};
		}
		
	}
	/**
	 * UsrAcl_Upd01オペレーション.<p>
	 *
	 * 担当者権限マスタの登録を行います。<br>
	 */
	public class UsrAcl_Upd01 extends MABCL_UsrAclReg_MC_A.UsrAcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * UsrAcl_DelChk01オペレーション.<p>
	 *
	 * 担当者権限マスタの削除前のチェックを行います。<br>
	 */
	public class UsrAcl_DelChk01 extends MABCL_UsrAclReg_MC_A.UsrAcl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * UsrAcl_Del01オペレーション.<p>
	 *
	 * 担当者権限マスタの削除を行います。<br>
	 */
	public class UsrAcl_Del01 extends MABCL_UsrAclReg_MC_A.UsrAcl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 担当者権限マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_UsrAclReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_USR_ACL_R) {
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			dbcCustomizeCommon(builder);
			dbcCustomizeCommon_Where(builder);
			
			if (!isNull(up0().usr_dpt_cd())){
				MAM_USR_ACL_R t = MAM_USR_ACL_R.create(builder.getBaseDbcAlias());
				
				builder.addWhereWithCutOffAnd(t.dpt_cd.like(bind(Srch01_CndR.$usr_dpt_cd))
								.or(t.add_dpt_cd1.like(bind(Srch01_CndR.$usr_dpt_cd)))
								.or(t.add_dpt_cd2.like(bind(Srch01_CndR.$usr_dpt_cd)))
								.or(t.add_dpt_cd3.like(bind(Srch01_CndR.$usr_dpt_cd)))
								.or(t.add_dpt_cd4.like(bind(Srch01_CndR.$usr_dpt_cd)))
								.or(t.add_dpt_cd5.like(bind(Srch01_CndR.$usr_dpt_cd)))
								.or(t.add_dpt_cd6.like(bind(Srch01_CndR.$usr_dpt_cd)))
								.or(t.add_dpt_cd7.like(bind(Srch01_CndR.$usr_dpt_cd)))
								.or(t.add_dpt_cd8.like(bind(Srch01_CndR.$usr_dpt_cd)))
								.or(t.add_dpt_cd9.like(bind(Srch01_CndR.$usr_dpt_cd))));
			}
			
			if (!isNull(up0().usr_dpt_nm())){
				MAM_DPT_R dpt1 =MAM_DPT_R.create("DPT1");
				MAM_DPT_R dpt2 = MAM_DPT_R.create("DPT2");
				MAM_DPT_R dpt3 = MAM_DPT_R.create("DPT3");
				MAM_DPT_R dpt4 = MAM_DPT_R.create("DPT4");
				MAM_DPT_R dpt5 = MAM_DPT_R.create("DPT5");
				MAM_DPT_R dpt6 = MAM_DPT_R.create("DPT6");
				MAM_DPT_R dpt7 = MAM_DPT_R.create("DPT7");
				MAM_DPT_R dpt8 = MAM_DPT_R.create("DPT8");
				MAM_DPT_R dpt9 = MAM_DPT_R.create("DPT9");
				MAM_DPT_R dpt10 = MAM_DPT_R.create("DPT10");
				
				builder.addWhereWithCutOffAnd(dpt1.dpt_nm.like(bind(Srch01_CndR.$usr_dpt_nm))
								.or(dpt2.dpt_nm.like(bind(Srch01_CndR.$usr_dpt_nm)))
								.or(dpt3.dpt_nm.like(bind(Srch01_CndR.$usr_dpt_nm)))
								.or(dpt4.dpt_nm.like(bind(Srch01_CndR.$usr_dpt_nm)))
								.or(dpt5.dpt_nm.like(bind(Srch01_CndR.$usr_dpt_nm)))
								.or(dpt6.dpt_nm.like(bind(Srch01_CndR.$usr_dpt_nm)))
								.or(dpt7.dpt_nm.like(bind(Srch01_CndR.$usr_dpt_nm)))
								.or(dpt8.dpt_nm.like(bind(Srch01_CndR.$usr_dpt_nm)))
								.or(dpt9.dpt_nm.like(bind(Srch01_CndR.$usr_dpt_nm)))
								.or(dpt10.dpt_nm.like(bind(Srch01_CndR.$usr_dpt_nm))));
			}
			
			if (!isNull(up0().usr_aprv_role_cd())){
				MAM_USR_ACL_R t = MAM_USR_ACL_R.create(builder.getBaseDbcAlias());
				
				builder.addWhereWithCutOffAnd(t.aprv_role_cd.like(bind(Srch01_CndR.$usr_aprv_role_cd))
								.or(t.aprv_role_cd1.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.aprv_role_cd2.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.aprv_role_cd3.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.aprv_role_cd4.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.aprv_role_cd5.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.aprv_role_cd6.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.aprv_role_cd7.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.aprv_role_cd8.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.aprv_role_cd9.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.sub_aprv_role_cd.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.sub_aprv_role_cd1.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.sub_aprv_role_cd2.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.sub_aprv_role_cd3.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.sub_aprv_role_cd4.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.sub_aprv_role_cd5.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.sub_aprv_role_cd6.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.sub_aprv_role_cd7.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.sub_aprv_role_cd8.like(bind(Srch01_CndR.$usr_aprv_role_cd)))
								.or(t.sub_aprv_role_cd9.like(bind(Srch01_CndR.$usr_aprv_role_cd))));
			}
			
			if (!isNull(up0().usr_aprv_role_nm())){
				MAM_APRV_ROLE_R aprv_role1 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE1);
				MAM_APRV_ROLE_R aprv_role2 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE2);
				MAM_APRV_ROLE_R aprv_role3 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE3);
				MAM_APRV_ROLE_R aprv_role4 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE4);
				MAM_APRV_ROLE_R aprv_role5 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE5);
				MAM_APRV_ROLE_R aprv_role6 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE6);
				MAM_APRV_ROLE_R aprv_role7 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE7);
				MAM_APRV_ROLE_R aprv_role8 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE8);
				MAM_APRV_ROLE_R aprv_role9 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE9);
				MAM_APRV_ROLE_R aprv_role10 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE10);
				MAM_APRV_ROLE_R aprv_role11 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE11);
				MAM_APRV_ROLE_R aprv_role12 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE12);
				MAM_APRV_ROLE_R aprv_role13 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE13);
				MAM_APRV_ROLE_R aprv_role14 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE14);
				MAM_APRV_ROLE_R aprv_role15 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE15);
				MAM_APRV_ROLE_R aprv_role16 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE16);
				MAM_APRV_ROLE_R aprv_role17 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE17);
				MAM_APRV_ROLE_R aprv_role18 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE18);
				MAM_APRV_ROLE_R aprv_role19 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE19);
				MAM_APRV_ROLE_R aprv_role20 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE20);
				
				builder.addWhereWithCutOffAnd(aprv_role1.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)).or(aprv_role2.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role3.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role4.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role5.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role6.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role7.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role8.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role9.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role10.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role11.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role12.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role13.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role14.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role15.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role16.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role17.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role18.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role19.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)))
								.or(aprv_role20.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm))));
			}
			
		}

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_USR_ACL_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			MCList<MCRow> list = MCList.create(MCRow.class);
			MCLicense.assignedProductList(r_src.usr_cd(), list, "PROD");
			r_dest.license_flg(!list.isEmpty());
		}

		protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {
			MAM_USR_ACL_R t = MAM_USR_ACL_R.create(builder.getBaseDbcAlias());
			MAM_USR_R usr1 = MAM_USR_R.create(MAM_USR_ACL_R.$USR1);
			MAM_DA_R da1 = MAM_DA_R.create(MAM_USR_ACL_R.$DA1);
			MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
			MAM_DPT_R dpt2 = MAM_DPT_R.create("DPT2");
			MAM_DPT_R dpt3 = MAM_DPT_R.create("DPT3");
			MAM_DPT_R dpt4 = MAM_DPT_R.create("DPT4");
			MAM_DPT_R dpt5 = MAM_DPT_R.create("DPT5");
			MAM_DPT_R dpt6 = MAM_DPT_R.create("DPT6");
			MAM_DPT_R dpt7 = MAM_DPT_R.create("DPT7");
			MAM_DPT_R dpt8 = MAM_DPT_R.create("DPT8");
			MAM_DPT_R dpt9 = MAM_DPT_R.create("DPT9");
			MAM_DPT_R dpt10 = MAM_DPT_R.create("DPT10");
			
			builder.removeSelect(Srch01_Rslt1R.$dpt_nm, Srch01_Rslt1R.$add_dpt_nm1,
					Srch01_Rslt1R.$add_dpt_nm2, Srch01_Rslt1R.$add_dpt_nm3,
					Srch01_Rslt1R.$add_dpt_nm4, Srch01_Rslt1R.$add_dpt_nm5,
					Srch01_Rslt1R.$add_dpt_nm6, Srch01_Rslt1R.$add_dpt_nm7,
					Srch01_Rslt1R.$add_dpt_nm8, Srch01_Rslt1R.$add_dpt_nm9);
			builder.inactiveForeign(MAM_USR_ACL_R.$DPT_BASE1);
			builder.inactiveForeign(MAM_USR_ACL_R.$DPT_BASE2);
			builder.inactiveForeign(MAM_USR_ACL_R.$DPT_BASE3);
			builder.inactiveForeign(MAM_USR_ACL_R.$DPT_BASE4);
			builder.inactiveForeign(MAM_USR_ACL_R.$DPT_BASE5);
			builder.inactiveForeign(MAM_USR_ACL_R.$DPT_BASE6);
			builder.inactiveForeign(MAM_USR_ACL_R.$DPT_BASE7);
			builder.inactiveForeign(MAM_USR_ACL_R.$DPT_BASE8);
			builder.inactiveForeign(MAM_USR_ACL_R.$DPT_BASE9);
			builder.inactiveForeign(MAM_USR_ACL_R.$DPT_BASE10);

			builder.addSelect(Srch01_Rslt1R.$dpt_nm, dpt1.dpt_nm);
			builder.addSelect(Srch01_Rslt1R.$add_dpt_nm1, dpt2.dpt_nm);
			builder.addSelect(Srch01_Rslt1R.$add_dpt_nm2, dpt3.dpt_nm);
			builder.addSelect(Srch01_Rslt1R.$add_dpt_nm3, dpt4.dpt_nm);
			builder.addSelect(Srch01_Rslt1R.$add_dpt_nm4, dpt5.dpt_nm);
			builder.addSelect(Srch01_Rslt1R.$add_dpt_nm5, dpt6.dpt_nm);
			builder.addSelect(Srch01_Rslt1R.$add_dpt_nm6, dpt7.dpt_nm);
			builder.addSelect(Srch01_Rslt1R.$add_dpt_nm7, dpt8.dpt_nm);
			builder.addSelect(Srch01_Rslt1R.$add_dpt_nm8, dpt9.dpt_nm);
			builder.addSelect(Srch01_Rslt1R.$add_dpt_nm9, dpt10.dpt_nm);

			builder.addLeftOuterJoin(dpt1, t.dpt_cd.eq(dpt1.dpt_cd).and(t.st_dt.between(dpt1.st_dt, dpt1.end_dt)));
			builder.addLeftOuterJoin(dpt2, t.add_dpt_cd1.eq(dpt2.dpt_cd).and(t.st_dt.between(dpt2.st_dt, dpt2.end_dt)));
			builder.addLeftOuterJoin(dpt3, t.add_dpt_cd2.eq(dpt3.dpt_cd).and(t.st_dt.between(dpt3.st_dt, dpt3.end_dt)));
			builder.addLeftOuterJoin(dpt4, t.add_dpt_cd3.eq(dpt4.dpt_cd).and(t.st_dt.between(dpt4.st_dt, dpt4.end_dt)));
			builder.addLeftOuterJoin(dpt5, t.add_dpt_cd4.eq(dpt5.dpt_cd).and(t.st_dt.between(dpt5.st_dt, dpt5.end_dt)));
			builder.addLeftOuterJoin(dpt6, t.add_dpt_cd5.eq(dpt6.dpt_cd).and(t.st_dt.between(dpt6.st_dt, dpt6.end_dt)));
			builder.addLeftOuterJoin(dpt7, t.add_dpt_cd6.eq(dpt7.dpt_cd).and(t.st_dt.between(dpt7.st_dt, dpt7.end_dt)));
			builder.addLeftOuterJoin(dpt8, t.add_dpt_cd7.eq(dpt8.dpt_cd).and(t.st_dt.between(dpt8.st_dt, dpt8.end_dt)));
			builder.addLeftOuterJoin(dpt9, t.add_dpt_cd8.eq(dpt9.dpt_cd).and(t.st_dt.between(dpt9.st_dt, dpt9.end_dt)));
			builder.addLeftOuterJoin(dpt10, t.add_dpt_cd9.eq(dpt10.dpt_cd).and(t.st_dt.between(dpt10.st_dt, dpt10.end_dt)));

			builder.setWhere(value(0).eq(value(0)));
			builder.addWhereWithCutOffAnd(t.usr_cd.like(bind(Srch01_CndR.$usr_cd)));
			builder.addWhereWithCutOffAnd(usr1.usr_nm.like(bind(Srch01_CndR.$usr_nm)));
			builder.addWhereWithCutOffAnd(t.dpt_cd.like(bind(Srch01_CndR.$dpt_cd)));
			builder.addWhereWithCutOffAnd(dpt1.dpt_nm.like(bind(Srch01_CndR.$dpt_nm)));
			builder.addWhereWithCutOffAnd(t.da_cd.like(bind(Srch01_CndR.$da_cd)));
			builder.addWhereWithCutOffAnd(da1.da_nm.like(bind(Srch01_CndR.$da_nm)));
			builder.addWhereWithCutOffAnd(t.memo1.like(bind(Srch01_CndR.$memo1)));
			builder.addWhereWithCutOffAnd(t.memo2.like(bind(Srch01_CndR.$memo2)));
			builder.addWhereWithCutOffAnd(t.memo3.like(bind(Srch01_CndR.$memo3)));
			builder.addWhereWithCutOffAnd(t.del_flg.eq(bind("del_flg")));
			builder.addWhereWithCutOffAnd(t.st_dt.gte(bind(Srch01_CndR.$st_dt_fr)));
			builder.addWhereWithCutOffAnd(t.st_dt.lte(bind(Srch01_CndR.$st_dt_to)));
			builder.addWhereWithCutOffAnd(t.end_dt.gte(bind(Srch01_CndR.$end_dt_fr)));
			builder.addWhereWithCutOffAnd(t.end_dt.lte(bind(Srch01_CndR.$end_dt_to)));
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 担当者権限マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_UsrAclReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 担当者権限マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_UsrAclReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABCL_UsrAclReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		
		@Override
		protected void insAndDelToKeyUpd(MCQueryApiBuilder builder,
				MCList<MCDBContainer> d, IdentityHashMap<MCRow, MCMessageList> rowToMsg) {
			super.insAndDelToKeyUpd(builder, d, rowToMsg);
			for (MCDBContainer r : d) {
				MCList<MCRow> list = MCList.create(MCRow.class);
				MCLicense.assignedProductList(r.getString("usr_cd"), list, "PROD");
				r.setBooleanNE("license_flg",!list.isEmpty());
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 承認担当者ビューの検索を行います。<br>
	 */
	public class Srch02 extends MABCL_UsrAclReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeSub(builder);
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_USR_ACL_R t = MAM_USR_ACL_R.create(builder.getBaseDbcAlias());
			MAM_USR_R usr1 = MAM_USR_R.create(MAM_USR_ACL_R.$USR1);
			MAM_APRV_ROLE_R aprv_role1 = MAM_APRV_ROLE_R.create(MAM_USR_ACL_R.$APRV_ROLE1);

			dbcCustomizeCommon_Where(builder);

			builder.addLeftOuterJoin(usr1, t.usr_cd.eq(usr1.usr_cd));
			builder.addLeftOuterJoin(aprv_role1, t.aprv_role_cd.eq(aprv_role1.aprv_role_cd));

			builder.addSelect(usr1.usr_nm);
			builder.addSelect(aprv_role1.aprv_role_nm);

			builder.addWhereWithCutOffAnd(t.aprv_role_cd.like(bind(Srch01_CndR.$usr_aprv_role_cd)));
			builder.addWhereWithCutOffAnd(aprv_role1.aprv_role_nm.like(bind(Srch01_CndR.$usr_aprv_role_nm)));
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 担当者・部門ビューの検索を行います。<br>
	 */
	public class Srch03 extends MABCL_UsrAclReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeSub(builder);
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_USR_R usr1 = MAM_USR_R.create(MAM_USR_ACL_R.$USR1);
			MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
			MAM_USR_ACL_R t = MAM_USR_ACL_R.create(builder.getBaseDbcAlias());

			dbcCustomizeCommon_Where(builder);

			builder.addLeftOuterJoin(usr1, t.usr_cd.eq(usr1.usr_cd));
			builder.addLeftOuterJoin(dpt1, t.dpt_cd.eq(dpt1.dpt_cd).and(t.st_dt.between(dpt1.st_dt, dpt1.end_dt)));
			builder.addSelect(usr1.usr_nm);
			builder.addSelect(dpt1.dpt_nm);

			builder.addWhereWithCutOffAnd(t.dpt_cd.like(bind(Srch01_CndR.$usr_dpt_cd)));
			builder.addWhereWithCutOffAnd(dpt1.dpt_nm.like(bind(Srch01_CndR.$usr_dpt_nm)));
		}
	}

	protected void dbcCustomizeCommon_Where(MCQueryApiBuilder builder) {
		MAM_USR_R usr1 = MAM_USR_R.create(MAM_USR_ACL_R.$USR1);
		
		builder.addWhereWithCutOffAnd(usr1.usr_com_typ.like(bind(Srch01_CndR.$usr_com_typ)));
		builder.addWhereWithCutOffAnd(usr1.usr_com.like(bind(Srch01_CndR.$usr_com)));
		builder.addWhereWithCutOffAnd(usr1.usr_alt_nm1.like(bind(Srch01_CndR.$usr_alt_nm1)));
		builder.addWhereWithCutOffAnd(usr1.usr_alt_nm2.like(bind(Srch01_CndR.$usr_alt_nm2)));
		builder.addWhereWithCutOffAnd(usr1.usr_alt_nm3.like(bind(Srch01_CndR.$usr_alt_nm3)));
		builder.addWhereWithCutOffAnd(usr1.usr_alt_nm4.like(bind(Srch01_CndR.$usr_alt_nm4)));
		builder.addWhereWithCutOffAnd(usr1.usr_info1.like(bind(Srch01_CndR.$usr_info1)));
		builder.addWhereWithCutOffAnd(usr1.usr_info2.like(bind(Srch01_CndR.$usr_info2)));
		builder.addWhereWithCutOffAnd(usr1.usr_info3.like(bind(Srch01_CndR.$usr_info3)));
		builder.addWhereWithCutOffAnd(usr1.usr_info4.like(bind(Srch01_CndR.$usr_info4)));
		builder.addWhereWithCutOffAnd(usr1.usr_info5.like(bind(Srch01_CndR.$usr_info5)));
		builder.addWhereWithCutOffAnd(usr1.usr_info6.like(bind(Srch01_CndR.$usr_info6)));
		builder.addWhereWithCutOffAnd(usr1.usr_info7.like(bind(Srch01_CndR.$usr_info7)));
		builder.addWhereWithCutOffAnd(usr1.usr_info8.like(bind(Srch01_CndR.$usr_info8)));
		builder.addWhereWithCutOffAnd(usr1.usr_info9.like(bind(Srch01_CndR.$usr_info9)));
		builder.addWhereWithCutOffAnd(usr1.usr_info10.like(bind(Srch01_CndR.$usr_info10)));
		builder.addWhereWithCutOffAnd(usr1.usr_info11.like(bind(Srch01_CndR.$usr_info11)));
		builder.addWhereWithCutOffAnd(usr1.usr_info12.like(bind(Srch01_CndR.$usr_info12)));
		builder.addWhereWithCutOffAnd(usr1.usr_info13.like(bind(Srch01_CndR.$usr_info13)));
		builder.addWhereWithCutOffAnd(usr1.usr_info14.like(bind(Srch01_CndR.$usr_info14)));
		builder.addWhereWithCutOffAnd(usr1.usr_info15.like(bind(Srch01_CndR.$usr_info15)));
		builder.addWhereWithCutOffAnd(usr1.usr_info16.like(bind(Srch01_CndR.$usr_info16)));
		builder.addWhereWithCutOffAnd(usr1.usr_info17.like(bind(Srch01_CndR.$usr_info17)));
		builder.addWhereWithCutOffAnd(usr1.usr_info18.like(bind(Srch01_CndR.$usr_info18)));
		builder.addWhereWithCutOffAnd(usr1.usr_info19.like(bind(Srch01_CndR.$usr_info19)));
		builder.addWhereWithCutOffAnd(usr1.usr_info20.like(bind(Srch01_CndR.$usr_info20)));
		}

	//FMCB CUSTOM END
}