package mcframe.serverMAUC.MAUCL0030;

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
import mcframe.serverMAUC.MAUCL0030.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.dbc.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_Dac"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_Dac_MC extends MAUCL_Dac_MC_A{
	//FMCB CUSTOM START

	protected void checkAsync() {
		// 自分と同じログインシーケンスが非同期処理中の場合はＤＡＣ情報を更新してはいけない
		// ※ただし、自動テスト中は本チェックは実行しない（テストの前処理として本処理が実行されるが、本チェックを実施すると連続実行に支障がでる場合があるため）
		boolean isAutoTestMode = "true".equals(mcframe.serverCore.sys.MCSys.env.getVMEnv("autotest"));
		if (checkDoMyOtherOperation() && !isAutoTestMode) {
			throw new MCAppException(MAUCL0056, MCSys.user.loginSequence(),
					MCSys.request.serverRequestNo());
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 部門ＣＤ・ＤＡＣ取得（ログイン）<br>
	 */
	public class Srch01 extends MAUCL_Dac_MC_A.Srch01 {
		@Override
		protected void call() {
			MCRow bind = MCRow.create();
			bind.addStringColumn("login_seq", MCSys.user.loginSequence());
			bind.addStringColumn("usr_cd", up0().usr_cd());
			bind.addDateColumn("today", getToday());

			if (!up0().srch_only_flg()) {
				insDaDpt(bind);
			}

			MCList<MAT_DA_DPT_R> dptL = MCList.create(MAT_DA_DPT_R.class);
			MAT_DA_DPT_R t = MAT_DA_DPT_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setWhere(t.login_seq.eq(bind("login_seq")));
			dbSelect(createSqlId(LOGIC_ID, t, "S02"), dptL, builder, bind);

			for (MAT_DA_DPT_R r : dptL) {
				if (r.rd_flg()) {
					Srch01_RsltR rdr = Srch01_RsltR.create();
					rdr.dpt_cd(r.dpt_cd());
					down0().add(rdr);
				}
				if (r.wr_flg()) {
					Srch01_RsltR wrr = Srch01_RsltR.create();
					wrr.dpt_cd(r.dpt_cd());
					down1().add(wrr);
				}
			}

			if (!up0().srch_only_flg()) {
				checkAsync();
			}
		}

		protected void insDaDpt(MCRow bind) {
			boolean isFullDa = isFullDaUsr(bind) ;

			delDAInfo(MAT_DA_DPT_R.create("T"), bind, isFullDa);

			if (isFullDa) {
				return ;
			}

			MAM_USR_ACL_R usrAclR = getUsrAclR(bind);
			if (null == usrAclR) {
				return;
			}

			bind.setStringNE("da_cd", usrAclR.da_cd());
			MCList<MAT_DA_DPT_R> daDptL= MCList.create(MAT_DA_DPT_R.class);
			MCList<MAT_DA_DPT_R> tmpDaDptL = daDptL.createInstance();

			MAM_DA_CTL_R dbc = MAM_DA_CTL_R.create("T");
			MAT_DA_DPT_R dbc2 = MAT_DA_DPT_R.create("T");
			
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.setGroupBy(dbc.dpt_cd);
			dbc_bldr.addMax(dbc.rd_flg, "rd_flg");
			dbc_bldr.addMax(dbc.wr_flg, "wr_flg");
			dbc_bldr.addWhereWithAnd(dbc.del_flg.eq(value(false)));
			dbc_bldr.addWhereWithAnd(dbc.da_cd.eq(bind("da_cd")));
			dbc_bldr.addWhereWithAnd(dbc.st_dt.lte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.end_dt.gte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.dpt_cd.isNotNull());
			dbc_bldr.addWhereWithAnd(not(dbc.rd_flg.eq(value(false))
					.and(dbc.wr_flg.eq(value(false)))));
			dbSelect(createSqlId(LOGIC_ID, dbc, "S03"), tmpDaDptL, dbc_bldr, bind);
			daDptL.addAll(tmpDaDptL);

			MAM_DPT_R S0X = MAM_DPT_R.create("S0X");
			MAM_DA_CTL_R S1X = MAM_DA_CTL_R.create("S1X");
			dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.addInnerJoin(S0X, dbc.wg_cd.eq(S0X.wg_cd));
			dbc_bldr.setGroupBy(S0X.dpt_cd);
			dbc_bldr.addMax(dbc.rd_flg, "rd_flg");
			dbc_bldr.addMax(dbc.wr_flg, "wr_flg");
			dbc_bldr.addWhereWithAnd(dbc.del_flg.eq(value(false)));
			dbc_bldr.addWhereWithAnd(dbc.da_cd.eq(bind("da_cd")));
			dbc_bldr.addWhereWithAnd(dbc.st_dt.lte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.end_dt.gte(bind("today")));
			dbc_bldr.addWhereWithAnd(not(dbc.rd_flg.eq(value(false))
					.and(dbc.wr_flg.eq(value(false)))));
			dbc_bldr.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1X).where(S1X.dpt_cd.eq(S0X.dpt_cd)
							.and(S1X.del_flg.eq(value(false)))
							.and(S1X.da_cd.eq(bind("da_cd")))
							.and(S1X.st_dt.lte(bind("today")))
							.and(S1X.end_dt.gte(bind("today")))
							.and(S1X.rd_flg.eq(value(false)))
							.and(S1X.wr_flg.eq(value(false))))));
			dbSelect(createSqlId(LOGIC_ID, dbc, "S04"), tmpDaDptL, dbc_bldr, bind);
			
			daDptL.merge(tmpDaDptL, dbc2.getKeyColumn());
			
			daDptL = daDptL.groupBy(MAT_DA_DPT_R.$dpt_cd, MAT_DA_DPT_R.$rd_flg,
					MAT_DA_DPT_R.$wr_flg);

			daDptL.setString(MAT_DA_DPT_R.$login_seq, bind.getString("login_seq"));
			daDptL.setString(MAT_DA_DPT_R.$usr_id, usrAclR.usr_cd());

			dbc_bldr = MCQueryApiBuilder.create(dbc2);
			dbInsert(createSqlId(LOGIC_ID, dbc2, "S05"), daDptL, dbc_bldr);
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 物流グループＣＤ・ＤＡＣ取得（ログイン）<br>
	 */
	public class Srch02 extends MAUCL_Dac_MC_A.Srch02 {
		@Override
		protected void call() {
			MCRow bind = MCRow.create();
			bind.addStringColumn("login_seq", MCSys.user.loginSequence());
			bind.addStringColumn("usr_cd", up0().usr_cd());
			bind.addDateColumn("today", getToday());

			if (!up0().srch_only_flg()) {
				insDaLgGrp(bind);
			}

			MCList<MAT_DA_LG_GRP_R> dlvGrpL = MCList.create(MAT_DA_LG_GRP_R.class);
			MAT_DA_LG_GRP_R t = MAT_DA_LG_GRP_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setWhere(t.login_seq.eq(bind("login_seq")));
			dbSelect(createSqlId(LOGIC_ID, t, "S06"), dlvGrpL, builder, bind);

			for (MAT_DA_LG_GRP_R r : dlvGrpL) {
				if (r.rd_flg()) {
					Srch02_RsltR rdr = Srch02_RsltR.create();
					rdr.lg_grp_cd(r.lg_grp_cd());
					down0().add(rdr);
				}
				if (r.wr_flg()) {
					Srch02_RsltR wrr = Srch02_RsltR.create();
					wrr.lg_grp_cd(r.lg_grp_cd());
					down1().add(wrr);
				}
			}

			if (!up0().srch_only_flg()) {
				checkAsync();
			}
		}

		protected void insDaLgGrp(MCRow bind) {
			boolean isFullDa = isFullDaUsr(bind) ;

			delDAInfo(MAT_DA_LG_GRP_R.create("T"), bind, isFullDa);

			if (isFullDa) {
				return ;
			}

			MAM_USR_ACL_R usrAclR = getUsrAclR(bind);
			if (null == usrAclR) {
				return;
			}

			bind.setStringNE("da_cd", usrAclR.da_cd());
			MCList<MAT_DA_LG_GRP_R> insL= MCList.create(MAT_DA_LG_GRP_R.class);
			MCList<MAT_DA_LG_GRP_R> tmpL = insL.createInstance();

			MAM_DA_CTL_R dbc = MAM_DA_CTL_R.create("T");
			MAT_DA_LG_GRP_R dbc2 = MAT_DA_LG_GRP_R.create("T");
			
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.setGroupBy(dbc.lg_grp_cd);
			dbc_bldr.addMax(dbc.rd_flg, "rd_flg");
			dbc_bldr.addMax(dbc.wr_flg, "wr_flg");
			dbc_bldr.addWhereWithAnd(dbc.del_flg.eq(value(false)));
			dbc_bldr.addWhereWithAnd(dbc.da_cd.eq(bind("da_cd")));
			dbc_bldr.addWhereWithAnd(dbc.st_dt.lte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.end_dt.gte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.lg_grp_cd.isNotNull());
			dbc_bldr.addWhereWithAnd(not(dbc.rd_flg.eq(value(false))
					.and(dbc.wr_flg.eq(value(false)))));
			dbSelect(createSqlId(LOGIC_ID, dbc, "S07"), tmpL, dbc_bldr, bind);
			insL.addAll(tmpL);

			MAM_LG_GRP_R S0X = MAM_LG_GRP_R.create("S0X");
			MAM_DA_CTL_R S1X = MAM_DA_CTL_R.create("S1X");
			dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.addInnerJoin(S0X, dbc.wg_cd.eq(S0X.wg_cd));
			dbc_bldr.setGroupBy(S0X.lg_grp_cd);
			dbc_bldr.addMax(dbc.rd_flg, "rd_flg");
			dbc_bldr.addMax(dbc.wr_flg, "wr_flg");
			dbc_bldr.addWhereWithAnd(dbc.del_flg.eq(value(false)));
			dbc_bldr.addWhereWithAnd(dbc.da_cd.eq(bind("da_cd")));
			dbc_bldr.addWhereWithAnd(dbc.st_dt.lte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.end_dt.gte(bind("today")));
			dbc_bldr.addWhereWithAnd(not(dbc.rd_flg.eq(value(false))
					.and(dbc.wr_flg.eq(value(false)))));
			dbc_bldr.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1X).where(S1X.lg_grp_cd.eq(S0X.lg_grp_cd)
							.and(S1X.del_flg.eq(value(false)))
							.and(S1X.da_cd.eq(bind("da_cd")))
							.and(S1X.st_dt.lte(bind("today")))
							.and(S1X.end_dt.gte(bind("today")))
							.and(S1X.rd_flg.eq(value(false)))
							.and(S1X.wr_flg.eq(value(false))))));
			dbSelect(createSqlId(LOGIC_ID, dbc, "S08"), tmpL, dbc_bldr, bind);

			insL.merge(tmpL, dbc2.getKeyColumn());

			insL = insL.groupBy(MAT_DA_LG_GRP_R.$lg_grp_cd, MAT_DA_LG_GRP_R.$rd_flg,
					MAT_DA_LG_GRP_R.$wr_flg);

			insL.setString(MAT_DA_LG_GRP_R.$login_seq, bind.getString("login_seq"));
			insL.setString(MAT_DA_LG_GRP_R.$usr_id, usrAclR.usr_cd());

			dbc_bldr = MCQueryApiBuilder.create(dbc2);
			dbInsert(createSqlId(LOGIC_ID, dbc2, "S09"), insL, dbc_bldr);
		}
	}

	/**
	 * Srch03オペレーション.<p>
	 *
	 * 場所ＣＤ・ＤＡＣ取得（ログイン）<br>
	 */
	public class Srch03 extends MAUCL_Dac_MC_A.Srch03 {
		@Override
		protected void call() {
			MCRow bind = MCRow.create();
			bind.addStringColumn("login_seq", MCSys.user.loginSequence());
			bind.addStringColumn("usr_cd", up0().usr_cd());
			bind.addDateColumn("today", getToday());

			if (!up0().srch_only_flg()) {
				insDaLoc(bind);
			}

			MCList<MAT_DA_LOC_R> locL = MCList.create(MAT_DA_LOC_R.class);
			MAT_DA_LOC_R t = MAT_DA_LOC_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setWhere(t.login_seq.eq(bind("login_seq")));
			dbSelect(createSqlId(LOGIC_ID, t, "S30"), locL, builder, bind);

			for (MAT_DA_LOC_R r : locL) {
				if (r.rd_flg()) {
					Srch03_RsltR rdr = Srch03_RsltR.create();
					rdr.loc_cd(r.loc_cd());
					down0().add(rdr);
				}
				if (r.wr_flg()) {
					Srch03_RsltR wrr = Srch03_RsltR.create();
					wrr.loc_cd(r.loc_cd());
					down1().add(wrr);
				}
			}

			if (!up0().srch_only_flg()) {
				checkAsync();
			}
		}

		protected void insDaLoc(MCRow bind) {
			boolean isFullDa = isFullDaUsr(bind) ;

			delDAInfo(MAT_DA_LOC_R.create("T"), bind, isFullDa);

			if (isFullDa) {
				return ;
			}

			MAM_USR_ACL_R usrAclR = getUsrAclR(bind);
			if (null == usrAclR) {
				return;
			}

			bind.setStringNE("da_cd", usrAclR.da_cd());
			MCList<MAT_DA_LOC_R> insL= MCList.create(MAT_DA_LOC_R.class);
			MCList<MAT_DA_LOC_R> tmpL = insL.createInstance();

			MAM_DA_CTL_R dbc = MAM_DA_CTL_R.create("T");
			MAT_DA_LOC_R dbc2 = MAT_DA_LOC_R.create("T");
			
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.setGroupBy(dbc.loc_cd);
			dbc_bldr.addMax(dbc.rd_flg, "rd_flg");
			dbc_bldr.addMax(dbc.wr_flg, "wr_flg");
			dbc_bldr.addWhereWithAnd(dbc.del_flg.eq(value(false)));
			dbc_bldr.addWhereWithAnd(dbc.da_cd.eq(bind("da_cd")));
			dbc_bldr.addWhereWithAnd(dbc.st_dt.lte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.end_dt.gte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.loc_cd.isNotNull());
			dbc_bldr.addWhereWithAnd(not(dbc.rd_flg.eq(value(false))
					.and(dbc.wr_flg.eq(value(false)))));
			dbSelect(createSqlId(LOGIC_ID, dbc, "S11"), tmpL, dbc_bldr, bind);
			insL.addAll(tmpL);

			MAM_LOC_R S0X = MAM_LOC_R.create("S0X");
			MAM_DA_CTL_R S1X = MAM_DA_CTL_R.create("S1X");
			dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.addInnerJoin(S0X, dbc.wg_cd.eq(S0X.wg_cd));
			dbc_bldr.setGroupBy(S0X.loc_cd);
			dbc_bldr.addMax(dbc.rd_flg, "rd_flg");
			dbc_bldr.addMax(dbc.wr_flg, "wr_flg");
			dbc_bldr.addWhereWithAnd(dbc.del_flg.eq(value(false)));
			dbc_bldr.addWhereWithAnd(dbc.da_cd.eq(bind("da_cd")));
			dbc_bldr.addWhereWithAnd(dbc.st_dt.lte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.end_dt.gte(bind("today")));
			dbc_bldr.addWhereWithAnd(not(dbc.rd_flg.eq(value(false))
					.and(dbc.wr_flg.eq(value(false)))));
			dbc_bldr.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1X).where(S1X.loc_cd.eq(S0X.loc_cd)
							.and(S1X.del_flg.eq(value(false)))
							.and(S1X.da_cd.eq(bind("da_cd")))
							.and(S1X.st_dt.lte(bind("today")))
							.and(S1X.end_dt.gte(bind("today")))
							.and(S1X.rd_flg.eq(value(false)))
							.and(S1X.wr_flg.eq(value(false))))));
			dbSelect(createSqlId(LOGIC_ID, dbc, "S12"), tmpL, dbc_bldr, bind);
			insL.merge(tmpL, dbc2.getKeyColumn());

			dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.addInnerJoin(S0X, dbc.lg_grp_cd.eq(S0X.lg_grp_cd));
			dbc_bldr.setGroupBy(S0X.loc_cd);
			dbc_bldr.addMax(dbc.rd_flg, "rd_flg");
			dbc_bldr.addMax(dbc.wr_flg, "wr_flg");
			dbc_bldr.addWhereWithAnd(dbc.del_flg.eq(value(false)));
			dbc_bldr.addWhereWithAnd(dbc.da_cd.eq(bind("da_cd")));
			dbc_bldr.addWhereWithAnd(dbc.st_dt.lte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.end_dt.gte(bind("today")));
			dbc_bldr.addWhereWithAnd(not(dbc.rd_flg.eq(value(false))
					.and(dbc.wr_flg.eq(value(false)))));
			dbc_bldr.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1X).where(S1X.loc_cd.eq(S0X.loc_cd)
							.and(S1X.del_flg.eq(value(false)))
							.and(S1X.da_cd.eq(bind("da_cd")))
							.and(S1X.st_dt.lte(bind("today")))
							.and(S1X.end_dt.gte(bind("today")))
							.and(S1X.rd_flg.eq(value(false)))
							.and(S1X.wr_flg.eq(value(false))))));
			dbSelect(createSqlId(LOGIC_ID, dbc, "S13"), tmpL, dbc_bldr, bind);
			insL.merge(tmpL, dbc2.getKeyColumn());

			dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.addInnerJoin(S0X, dbc.alloc_grp_cd.eq(S0X.alloc_grp_cd));
			dbc_bldr.setGroupBy(S0X.loc_cd);
			dbc_bldr.addMax(dbc.rd_flg, "rd_flg");
			dbc_bldr.addMax(dbc.wr_flg, "wr_flg");
			dbc_bldr.addWhereWithAnd(dbc.del_flg.eq(value(false)));
			dbc_bldr.addWhereWithAnd(dbc.da_cd.eq(bind("da_cd")));
			dbc_bldr.addWhereWithAnd(dbc.st_dt.lte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.end_dt.gte(bind("today")));
			dbc_bldr.addWhereWithAnd(not(dbc.rd_flg.eq(value(false))
					.and(dbc.wr_flg.eq(value(false)))));
			dbc_bldr.addWhereWithAnd(notExists(subQuery().select(value("X"))
					.from(S1X).where(S1X.loc_cd.eq(S0X.loc_cd)
							.and(S1X.del_flg.eq(value(false)))
							.and(S1X.da_cd.eq(bind("da_cd")))
							.and(S1X.st_dt.lte(bind("today")))
							.and(S1X.end_dt.gte(bind("today")))
							.and(S1X.rd_flg.eq(value(false)))
							.and(S1X.wr_flg.eq(value(false))))));
			dbSelect(createSqlId(LOGIC_ID, dbc, "S14"), tmpL, dbc_bldr, bind);
			insL.merge(tmpL, dbc2.getKeyColumn());

			insL = insL.groupBy(MAT_DA_LOC_R.$loc_cd, MAT_DA_LOC_R.$rd_flg,
					MAT_DA_LOC_R.$wr_flg);

			insL.setString(MAT_DA_LOC_R.$login_seq, bind.getString("login_seq"));
			insL.setString(MAT_DA_LOC_R.$usr_id, usrAclR.usr_cd());

			dbc_bldr = MCQueryApiBuilder.create(dbc2);
			dbInsert(createSqlId(LOGIC_ID, dbc2, "I01"), insL, dbc_bldr);
		}
	}

	/**
	 * Srch04オペレーション.<p>
	 *
	 * ＷＧ ＣＤ・ＤＡＣ取得（ログイン）<br>
	 */
	public class Srch04 extends MAUCL_Dac_MC_A.Srch04 {
		@Override
		protected void call() {
			MCRow bind = MCRow.create();
			bind.addStringColumn("login_seq", MCSys.user.loginSequence());
			bind.addStringColumn("usr_cd", up0().usr_cd());
			bind.addDateColumn("today", getToday());

			if (!up0().srch_only_flg()) {
				insDaWg(bind);
			}

			MCList<MAT_DA_WG_R> wgL = MCList.create(MAT_DA_WG_R.class);
			MAT_DA_WG_R t = MAT_DA_WG_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setWhere(t.login_seq.eq(bind("login_seq")));
			dbSelect(createSqlId(LOGIC_ID, t, "S15"), wgL, builder, bind);

			for (MAT_DA_WG_R r : wgL) {
				if (r.rd_flg()) {
					Srch04_RsltR rdr = Srch04_RsltR.create();
					rdr.wg_cd(r.wg_cd());
					down0().add(rdr);
				}
				if (r.wr_flg()) {
					Srch04_RsltR wrr = Srch04_RsltR.create();
					wrr.wg_cd(r.wg_cd());
					down1().add(wrr);
				}
			}

			if (!up0().srch_only_flg()) {
				checkAsync();
			}
		}

		protected void insDaWg(MCRow bind) {
			boolean isFullDa = isFullDaUsr(bind) ;

			delDAInfo(MAT_DA_WG_R.create("T"), bind, isFullDa);

			if (isFullDa) {
				return ;
			}

			MAM_USR_ACL_R usrAclR = getUsrAclR(bind);
			if (null == usrAclR) {
				return;
			}

			bind.setStringNE("da_cd", usrAclR.da_cd());
			MCList<MAT_DA_WG_R> insL= MCList.create(MAT_DA_WG_R.class);

			MAM_DA_CTL_R dbc = MAM_DA_CTL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.setGroupBy(dbc.wg_cd);
			dbc_bldr.addMax(dbc.rd_flg, "rd_flg");
			dbc_bldr.addMax(dbc.wr_flg, "wr_flg");
			dbc_bldr.addWhereWithAnd(dbc.del_flg.eq(value(false)));
			dbc_bldr.addWhereWithAnd(dbc.da_cd.eq(bind("da_cd")));
			dbc_bldr.addWhereWithAnd(dbc.st_dt.lte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.end_dt.gte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.wg_cd.isNotNull());
			dbc_bldr.addWhereWithAnd(not(dbc.rd_flg.eq(value(false))
					.and(dbc.wr_flg.eq(value(false)))));
			dbSelect(createSqlId(LOGIC_ID, dbc, "S16"), insL, dbc_bldr, bind);

			insL.setString(MAT_DA_WG_R.$login_seq, bind.getString("login_seq"));
			insL.setString(MAT_DA_WG_R.$usr_id, usrAclR.usr_cd());

			MAT_DA_WG_R dbc2 = MAT_DA_WG_R.create("T");
			dbc_bldr = MCQueryApiBuilder.create(dbc2);
			dbInsert(createSqlId(LOGIC_ID, dbc2, "I02"), insL, dbc_bldr);
		}
	}

	/**
	 * Srch05オペレーション.<p>
	 *
	 * 総量引当場所グループＣＤ・ＤＡＣ取得（ログイン）<br>
	 */
	public class Srch05 extends MAUCL_Dac_MC_A.Srch05 {
		@Override
		protected void call() {
			MCRow bind = MCRow.create();
			bind.addStringColumn("login_seq", MCSys.user.loginSequence());
			bind.addStringColumn("usr_cd", up0().usr_cd());
			bind.addDateColumn("today", getToday());

			if (!up0().srch_only_flg()) {
				insDaAllocGrp(bind);
			}

			MCList<MAT_DA_ALLOC_GRP_R> alc_grpL = MCList.create(MAT_DA_ALLOC_GRP_R.class);
			MAT_DA_ALLOC_GRP_R t = MAT_DA_ALLOC_GRP_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setWhere(t.login_seq.eq(bind("login_seq")));
			dbSelect(createSqlId(LOGIC_ID, t, "S17"), alc_grpL, builder, bind);

			for (MAT_DA_ALLOC_GRP_R r : alc_grpL) {
				if (r.rd_flg()) {
					Srch05_RsltR rdr = Srch05_RsltR.create();
					rdr.alloc_grp_cd(r.alloc_grp_cd());
					down0().add(rdr);
				}
				if (r.wr_flg()) {
					Srch05_RsltR wrr = Srch05_RsltR.create();
					wrr.alloc_grp_cd(r.alloc_grp_cd());
					down1().add(wrr);
				}
			}

			if (!up0().srch_only_flg()) {
				checkAsync();
			}
		}

		protected void insDaAllocGrp(MCRow bind) {
			boolean isFullDa = isFullDaUsr(bind) ;

			delDAInfo(MAT_DA_ALLOC_GRP_R.create("T"), bind, isFullDa);

			if (isFullDa) {
				return ;
			}

			MAM_USR_ACL_R usrAclR = getUsrAclR(bind);
			if (null == usrAclR) {
				return;
			}

			bind.setStringNE("da_cd", usrAclR.da_cd());
			MCList<MAT_DA_ALLOC_GRP_R> insL= MCList.create(MAT_DA_ALLOC_GRP_R.class);

			MAM_DA_CTL_R dbc = MAM_DA_CTL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			dbc_bldr.setGroupBy(dbc.alloc_grp_cd);
			dbc_bldr.addMax(dbc.rd_flg, "rd_flg");
			dbc_bldr.addMax(dbc.wr_flg, "wr_flg");
			dbc_bldr.addWhereWithAnd(dbc.del_flg.eq(value(false)));
			dbc_bldr.addWhereWithAnd(dbc.da_cd.eq(bind("da_cd")));
			dbc_bldr.addWhereWithAnd(dbc.st_dt.lte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.end_dt.gte(bind("today")));
			dbc_bldr.addWhereWithAnd(dbc.alloc_grp_cd.isNotNull());
			dbc_bldr.addWhereWithAnd(not(dbc.rd_flg.eq(value(false))
					.and(dbc.wr_flg.eq(value(false)))));
			dbSelect(createSqlId(LOGIC_ID, dbc, "S18"), insL, dbc_bldr, bind);

			insL.setString(MAT_DA_ALLOC_GRP_R.$login_seq, bind.getString("login_seq"));
			insL.setString(MAT_DA_ALLOC_GRP_R.$usr_id, usrAclR.usr_cd());

			MAT_DA_ALLOC_GRP_R dbc2 = MAT_DA_ALLOC_GRP_R.create("T");
			dbc_bldr = MCQueryApiBuilder.create(dbc2);
			dbInsert(createSqlId(LOGIC_ID, dbc2, "I03"), insL, dbc_bldr);
		}
	}

	protected void delDAInfo(MCDBContainer S0T, MCRow bind, boolean isFullDa) {
		MCStringPermColumn login_seq = (MCStringPermColumn) S0T.getColumn$("login_seq");
		
		MCDelete q = sql(createSqlId(LOGIC_ID, S0T, "D01"))
			.delete(S0T)
			.where(
				value(0).eq(value(0))
				.and(login_seq.eq(bind("login_seq")))
			);
		q.executeUpdate(bind);

		if (isFullDa) {
			return ;
		}

		delUnnecessaryDAInfo(S0T, bind, false);
	}
	/**
	 * 不要なDAC情報の削除
	 * @param S0T MCDBContainer
	 * @param bind バインド用MCRow
	 * @param isDelOpe 削除オペレーションからの実行かどうか
	 */
	protected void delUnnecessaryDAInfo(MCDBContainer S0T, MCRow bind, boolean isDelOpe) {
		MCStringPermColumn login_seq = (MCStringPermColumn) S0T.getColumn$("login_seq");
		MCStringPermColumn usr_id = (MCStringPermColumn) S0T.getColumn$("usr_id");
		
		MCList<MCRow> result = MCList.create(MCRow.class);
		result.addStringColumn("login_seq");
		result.addStringColumn("usr_id");
		
		sql(createSqlId(LOGIC_ID, S0T, "S10"))
			.mainQuery()
			.selectDistinct(
					login_seq,
					usr_id
			)
			.from(S0T)
			.where(
					value(0).eq(value(0))
					.and(usr_id.eq(bind("usr_cd"))))
			.executeQuery(bind, result);
		
		// 削除対象の決定
		MCList<MCRow> delL = null;
		if (isDelOpe) {
			// DAC利用終了時は、自身の別セッションのみを削除対象とする。
			// マイニングタスクの実行では、ログインシーケンスがログインユーザのものと異なる。
			// そのため、ユーザIDのものを対象にすると、ログインユーザのDACも削除されてしまう。
			String thislogseq = bind.getStringNE("login_seq");
			result.addStringColumn("req_no", bind.getStringNE("req_no"));
			delL = result.subList(target -> 
					isSame(target.getString("login_seq"), thislogseq)
					&& !checkDoDbSession(target)
					);
		}
		else {
			// DAC取得時は、削除に失敗するなどで残ってしまっている不要なDACを削除対象とする。
			delL = result.subList(target -> !checkDoOperation(target));
		}
		
		MCDelete q = sql(createSqlId(LOGIC_ID, S0T, "D02"))
				.delete(S0T)
				.where(
						value(0).eq(value(0))
						.and(usr_id.eq(bind("usr_id")))
						.and(login_seq.eq(bind("login_seq"))));
		q.executeBatchUpdate(delL);
	}
	protected MAM_USR_ACL_R getUsrAclR(MCRow bind) {
		MCList<MAM_USR_ACL_R> usrAclL= MCList.create(MAM_USR_ACL_R.class);
		MAM_USR_ACL_R dbc1 = MAM_USR_ACL_R.create("T");
		MAM_USR_R S3X = MAM_USR_R.create("X");
		MCQueryApiBuilder dbc1_bldr = MCQueryApiBuilder.create(dbc1);
		dbc1_bldr.setSelect(dbc1.usr_cd, dbc1.da_cd);
		dbc1_bldr.addWhereWithAnd(dbc1.usr_cd.eq(bind("usr_cd")));
		dbc1_bldr.addWhereWithAnd(dbc1.del_flg.eq(value(false)));
		dbc1_bldr.addWhereWithAnd(dbc1.st_dt.lte(bind("today")));
		dbc1_bldr.addWhereWithAnd(dbc1.end_dt.gte(bind("today")));
		dbc1_bldr.addWhereWithAnd(
				exists(subQuery()
						.select(value("X")).from(S3X)
						.where(value(0).eq(value(0))
						.and(S3X.usr_cd.eq(dbc1.usr_cd))
						.and(S3X.del_flg.eq(value(false))))));
		dbSelect(createSqlId(LOGIC_ID, dbc1, "S19"), usrAclL, dbc1_bldr, bind);
		if (usrAclL.isEmpty()) {
			return null;
		}
		return usrAclL.get(0);
	}
	protected boolean isFullDaUsr(MCRow bind) {
		MCList<MAM_USR_R> usrL= MCList.create(MAM_USR_R.class);
		MAM_USR_R dbc1 = MAM_USR_R.create("T");
		MCQueryApiBuilder dbc1_bldr = MCQueryApiBuilder.create(dbc1);
		dbc1_bldr.setSelect(dbc1.full_da_flg);
		dbc1_bldr.addWhereWithAnd(dbc1.usr_cd.eq(bind("usr_cd")));
		dbc1_bldr.addWhereWithAnd(dbc1.del_flg.eq(value(false)));
		dbc1_bldr.addWhereWithAnd(dbc1.full_da_flg.eq(value(true)));
		dbSelect(createSqlId(LOGIC_ID, dbc1, "S30"), usrL, dbc1_bldr, bind);
		if (usrL.isEmpty()) {
			return false;
		}
		return true;
	}
	
	/**
	 * Srch09オペレーション.<p>
	 *
	 * ＤＡＣ取得（全体）<br>
	 */
	public class Srch09 extends MAUCL_Dac_MC_A.Srch09 {
		@Override
		protected void call() {
			try {
				setDelFlgCtl(false);
				mapUpContainers();
				doSrch();
				mapDownContainers();
			}
			finally {
				setDelFlgCtl(true);
			}
		}

		protected void mapUpContainers() {
			mapUpContainers(DPT);
			mapUpContainers(LG_GRP);
			mapUpContainers(LOC);
			mapUpContainers(WG);
			mapUpContainers(ALLOC_GRP);
		}

		protected void doSrch() {
			srch01.exec();
			srch02.exec();
			srch03.exec();
			srch04.exec();
			srch05.exec();
		}

		protected void mapDownContainers() {
			mapDownContainers(DPT);
			mapDownContainers(LG_GRP);
			mapDownContainers(LOC);
			mapDownContainers(WG);
			mapDownContainers(ALLOC_GRP);
		}

		protected void setDelFlgCtl(boolean isDelFlgCtl) {
			MCRow r = MCRow.create();
			r.addStringColumn("del_flg_ctl", toFalseStr(isDelFlgCtl));
			String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
			execProc(createSqlId("MAUCL0030", procid, "MAUCL_Dac_setDelFlgCtl")
					, procid, r, ":del_flg_ctl");
		}
	}

	/**
	 * Srch10オペレーション.<p>
	 *
	 * ＤＡＣ取得（単層実行用）<br>
	 */
	public class Srch10 extends MAUCL_Dac_MC_A.Srch10 {
		@Override
		protected void call() {
			MAUCL_Dac.Srch09 srch09 = MAUCL_Dac.crtSrch09();
			srch09.up0().usr_cd(MCSys.user.ID());
			srch09.up0().srch_only_flg(false);
			srch09.exec();

			down0().setAll(srch09.down0());
			down1().setAll(srch09.down1());
			down2().setAll(srch09.down2());
			down3().setAll(srch09.down3());
			down4().setAll(srch09.down4());
			down5().setAll(srch09.down5());
			down6().setAll(srch09.down6());
			down7().setAll(srch09.down7());
			down8().setAll(srch09.down8());
			down9().setAll(srch09.down9());
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 部門ＣＤ・ＤＡＣ削除（ログアウト用）<br>
	 */
	public class Del01 extends MAUCL_Dac_MC_A.Del01 {
		@Override
		protected void call() {
			MCRow r = MCRow.create();
			r.addStringColumn("usr_cd", MCSys.user.ID());
			r.addStringColumn("login_seq", MCSys.user.loginSequence());
			r.addStringColumn("req_no", MCSys.request.serverRequestNo());

			delDaDpt(r);
		}
	}
	protected void delDaDpt(MCRow r) {
		MAT_DA_DPT_R S0T = MAT_DA_DPT_R.create("T");
		delUnnecessaryDAInfo(S0T, r, true);
	}

	/**
	 * Del02オペレーション.<p>
	 *
	 * 物流グループＣＤ・ＤＡＣ削除（ログアウト用）<br>
	 */
	public class Del02 extends MAUCL_Dac_MC_A.Del02 {
		@Override
		protected void call() {
			MCRow r = MCRow.create();
			r.addStringColumn("usr_cd", MCSys.user.ID());
			r.addStringColumn("login_seq", MCSys.user.loginSequence());
			r.addStringColumn("req_no", MCSys.request.serverRequestNo());

			delDaLgGrp(r);
		}
	}
	protected void delDaLgGrp(MCRow r) {
		MAT_DA_LG_GRP_R S0T = MAT_DA_LG_GRP_R.create("T");
		delUnnecessaryDAInfo(S0T, r, true);
	}

	/**
	 * Del03オペレーション.<p>
	 *
	 * 場所ＣＤ・ＤＡＣ削除（ログアウト用）<br>
	 */
	public class Del03 extends MAUCL_Dac_MC_A.Del03 {
		@Override
		protected void call() {
			MCRow r = MCRow.create();
			r.addStringColumn("usr_cd", MCSys.user.ID());
			r.addStringColumn("login_seq", MCSys.user.loginSequence());
			r.addStringColumn("req_no", MCSys.request.serverRequestNo());

			delDaLoc(r);
		}
	}
	protected void delDaLoc(MCRow r) {
		MAT_DA_LOC_R S0T = MAT_DA_LOC_R.create("T");
		delUnnecessaryDAInfo(S0T, r, true);
	}

	/**
	 * Del04オペレーション.<p>
	 *
	 * ＷＧ ＣＤ・ＤＡＣ削除（ログアウト用）<br>
	 */
	public class Del04 extends MAUCL_Dac_MC_A.Del04 {
		@Override
		protected void call() {
			MCRow r = MCRow.create();
			r.addStringColumn("usr_cd", MCSys.user.ID());
			r.addStringColumn("login_seq", MCSys.user.loginSequence());
			r.addStringColumn("req_no", MCSys.request.serverRequestNo());

			delDaWg(r);
		}
	}
	protected void delDaWg(MCRow r) {
		MAT_DA_WG_R S0T = MAT_DA_WG_R.create("T");
		delUnnecessaryDAInfo(S0T, r, true);
	}

	/**
	 * Del05オペレーション.<p>
	 *
	 * 総量引当場所グループＣＤ・ＤＡＣ削除（ログアウト用）<br>
	 */
	public class Del05 extends MAUCL_Dac_MC_A.Del05 {
		@Override
		protected void call() {
			MCRow r = MCRow.create();
			r.addStringColumn("usr_cd", MCSys.user.ID());
			r.addStringColumn("login_seq", MCSys.user.loginSequence());
			r.addStringColumn("req_no", MCSys.request.serverRequestNo());

			delDaAllocGrp(r);
		}
	}
	protected void delDaAllocGrp(MCRow r) {
		MAT_DA_ALLOC_GRP_R S0T = MAT_DA_ALLOC_GRP_R.create("T");
		delUnnecessaryDAInfo(S0T, r, true);
	}
	
	/**
	 * Del09オペレーション.<p>
	 *
	 * ＤＡＣ削除（全体）<br>
	 */
	public class Del09 extends MAUCL_Dac_MC_A.Del09 {
		@Override
		protected void call() {
			MCRow r = MCRow.create();
			r.addStringColumn("usr_cd", MCSys.user.ID());
			r.addStringColumn("login_seq", MCSys.user.loginSequence());
			r.addStringColumn("req_no", MCSys.request.serverRequestNo());

			delDaDpt(r);
			delDaLgGrp(r);
			delDaLoc(r);
			delDaWg(r);
			delDaAllocGrp(r);
		}
	}

	// スレッドセーフ対応（ここから）
	/**
	 * このクラス（スレッドセーフ対応用）
	 */
	protected static final Class<MAUCL_Dac> CLAZZ = MAUCL_Dac.class;

	// スレッドセーフ対応（ここまで）

	// 部門ＣＤ・ＤＡＣ（ここから）

	/**
	 * 検索権限がある行のみを取得するための {@link MCRowMatcher}を返す。
	 * <P>
	 * チェック対象の部門ＣＤのカラム が複数指定された場合は
	 * どれか１つでも検索権限があれば取得対象になる。
	 *
	 * 検索権限がある行のみを取得するための {@link MCRowMatcher}
	 * @param <T> 検査対象のRowクラス
	 * @param clazz  検査対象のRowクラス
	 * @param cols チェック対象の部門ＣＤのカラム
	 * @return 検索権限がある行のみを取得するための {@link MCRowMatcher}
	 */
	public <T extends MCRow> MCRowMatcher<T> rdDpt(Class<T> clazz, String... cols) {
		RdDpt<T> m = new RdDpt<T>();
		m.setDptCols(cols);
		return m;
	}

	/**
	 * 検索可能な部門ＣＤの行のみを選択する {@link MCRowMatcher}.
	 *
	 * @param <T>
	 */
	public class RdDpt<T extends MCRow> implements MCRowMatcher<T> {

		protected String[] _cols;

		/**
		 * 対象の部門ＣＤのカラムを指定する
		 * @param cols
		 */
		public void setDptCols(String... cols) {
			if (cols == null || cols.length < 1) {
				throw noColsFound();
			}
			_cols = cols;
		}

		protected MCAppException noColsFound() {
			return new MCAppException(MAUCL0107);
		}

		@Override
		public boolean match(T row) {
			return isRdDptCd(row, _cols);
		}
	}

	/**
	 * チェック対象の部門ＣＤのカラム値に対して、
	 * 検索権限があるかどうかをチェックする。
	 * <P>
	 * チェック対象の部門ＣＤのカラム が複数指定された場合は
	 * どれか１つでも検索権限があれば、検索可能と判断する。
	 *
	 * @param row 検査対象のRow
	 * @param cols 検査対象の部門ＣＤのカラム
	 * @return 検索可能な場合 true
	 */
	public boolean isRdDptCd(MCRow row, String... cols) {
		if (cols == null || cols.length < 1) {
			throw new MCAppException(MAUCL0107);
		}
		String[] vals = new String[cols.length];
		for (int i = 0; i < cols.length; i++) {
			vals[i] = row.getString(cols[i]);
		}
		if (readableDptCdDac(vals)) {
			return true;
		}
		return false;
	}

	/** 検索権限情報 */
	protected MCList<MAT_DA_DPT_R> _rDptDac;

	/** 検索権限検索用のインデックスキー */
	protected MCIndexKey _rDptIdxKey;

	/**
	 * 対象の部門のうち１つでも検索権限を持っていたらtrue
	 * 
	 * @param dptCd 対象の部門の配列
	 * @return 対象の部門のうち１つでも検索権限を持っていたらtrue
	 */
	public static boolean readableDptCdDac(String... dptCd) {
		return object(CLAZZ)._readableDptCdDac(dptCd);
	}

	/**
	 * 対象の部門のうち１つでも検索権限を持っていたらtrue
	 * 
	 * @param dptCd 対象の部門の配列
	 * @return 対象の部門のうち１つでも検索権限を持っていたらtrue
	 */
	protected boolean _readableDptCdDac(String... dptCd) {
		if (dptCd == null || dptCd.length == 0) {
			return false;
		}
		for (String cd : dptCd) {
			if (rDptDac().contains(rDptIdxKey(), cd)) {
				return true;
			}
		}
		return false;
	}

	/** 検索権限情報 */
	protected MCList<MAT_DA_DPT_R> rDptDac() {
		if (_rDptDac == null) {
			getRDptDac();
		}
		return _rDptDac;
	}

	/** 検索権限検索用のインデックスキー */
	protected MCIndexKey rDptIdxKey() {
		if (_rDptIdxKey == null) {
			getRDptDac();
		}
		return _rDptIdxKey;
	}

	/** 検索権限情報の取得 */
	protected void getRDptDac() {
		MCList<MAT_DA_DPT_R> loginDa = MCList.create(MAT_DA_DPT_R.class);
		MAT_DA_DPT_R t = MAT_DA_DPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.rd_flg.eq(value(true)));
		builder.addWhereWithAnd(t.login_seq.eq(bind("1")), MCSys.user.loginSequence());
		dbSelect(createSqlId(LOGIC_ID, t, "S20"), loginDa, builder);

		if (loginDa.size() == 0) {
			addFullDptDac(loginDa) ;
		}

		_rDptDac = loginDa;
		_rDptIdxKey = _rDptDac.createIndex(MAT_DA_DPT_R.$dpt_cd);
	}

	/**
	 * 更新権限がある行のみを取得するための {@link MCRowMatcher}を返す。
	 * <P>
	 * チェック対象の部門ＣＤのカラム が複数指定された場合は
	 * どれか１つでも更新権限があれば取得対象になる。
	 *
	 * @param <T> 更新対象のRowクラス
	 * @param clazz  更新対象のRowクラス
	 * @param cols チェック対象の部門ＣＤのカラム
	 * @return 更新権限がある行のみを取得するための {@link MCRowMatcher}
	 */
	public <T extends MCRow> MCRowMatcher<T> wrDpt(Class<T> clazz, String... cols) {
		WrDpt<T> m = new WrDpt<T>();
		m.setDptCols(cols);
		return m;
	}

	/**
	 * 更新可能な部門ＣＤの行のみを選択する {@link MCRowMatcher}.
	 *
	 * @param <T>
	 */
	public class WrDpt<T extends MCRow> implements MCRowMatcher<T> {

		protected String[] _cols;

		/**
		 * 対象の部門ＣＤのカラムを指定する
		 * @param cols
		 */
		public void setDptCols(String... cols) {
			if (cols == null || cols.length < 1) {
				throw noColsFound();
			}
			_cols = cols;
		}

		protected MCAppException noColsFound() {
			return new MCAppException(MAUCL0107);
		}

		@Override
		public boolean match(T row) {
			return isWrDptCd(row, _cols);
		}
	}

	/**
	 * チェック対象の部門ＣＤのカラム値に対して、
	 * 更新権限があるかどうかをチェックする。
	 * <P>
	 * チェック対象の部門ＣＤのカラム が複数指定された場合は
	 * どれか１つでも更新権限があれば、更新可能と判断する。
	 *
	 * @param row 更新対象のRow
	 * @param cols 更新対象の部門ＣＤのカラム
	 * @return 更新可能な場合 true
	 */
	public boolean isWrDptCd(MCRow row, String... cols) {
		if (cols == null || cols.length < 1) {
			throw new MCAppException(MAUCL0107);
		}
		String[] vals = new String[cols.length];
		for (int i = 0; i < cols.length; i++) {
			vals[i] = row.getString(cols[i]);
		}
		if (writableDptCdDac(vals)) {
			return true;
		}
		return false;
	}

	/** 更新権限情報 */
	protected MCList<MAT_DA_DPT_R> _wDptDac;

	/** 更新権限検索用のインデックスキー */
	protected MCIndexKey _wDptIdxKey;

	/**
	 * 部門の更新権限のチェックをします。<br>
	 * 更新権限がない場合はメッセージリストにエラーメッセージを格納して返します。
	 * 
	 * @param row チェック対象のRow
	 * @param dpt_cd_col 部門カラム名
	 * @return メッセージリスト
	 */
	public static MCMessageList checkWritableDptCdDac(MCRow row, String dpt_cd_col) {
		MCMessageList msgL = new MCMessageList();
		if (!object(CLAZZ)._writableDptCdDac(row.getStringNE(dpt_cd_col))) {
			msgL.add(new MCMessage(row, dpt_cd_col, MAUCL0059, row
					.getStringNE(dpt_cd_col), toDispGUIIndex(row)));
		}
		return msgL;
	}
	/**
	 * 部門の更新権限のチェックをします。<br>
	 * 更新権限がない場合はメッセージリストにエラーメッセージを格納して返します。
	 * 
	 * @param list チェック対象のList
	 * @param dpt_cd_col 部門カラム名
	 * @return メッセージリスト
	 */
	public static MCMessageList checkWritableDptCdDac(MCList<? extends MCRow> list, String dpt_cd_col) {
		MCMessageList msgL = new MCMessageList();
		for (MCRow r : list) {
			msgL.addAll(checkWritableDptCdDac(r, dpt_cd_col));
		}
		return msgL;
	}

	/**
	 * 対象の部門のうち１つでも更新権限を持っていたらtrue
	 * 
	 * @param dptCd 対象の部門の配列
	 * @return 対象の部門のうち１つでも更新権限を持っていたらtrue
	 */
	public static boolean writableDptCdDac(String... dptCd) {
		return object(CLAZZ)._writableDptCdDac(dptCd);
	}

	/**
	 * 対象の部門のうち１つでも更新権限を持っていたらtrue
	 * 
	 * @param dptCd 対象の部門の配列
	 * @return 対象の部門のうち１つでも更新権限を持っていたらtrue
	 */
	protected boolean _writableDptCdDac(String... dptCd) {
		if (dptCd == null || dptCd.length == 0) {
			return false;
		}
		for (String cd : dptCd) {
			if (wDptDac().contains(wDptIdxKey(), cd)) {
				return true;
			}
		}
		return false;
	}

	/** 更新権限情報 */
	protected MCList<MAT_DA_DPT_R> wDptDac() {
		if (_wDptDac == null) {
			getWDptDac();
		}
		return _wDptDac;
	}

	/** 更新権限検索用のインデックスキー */
	protected MCIndexKey wDptIdxKey() {
		if (_wDptIdxKey == null) {
			getWDptDac();
		}
		return _wDptIdxKey;
	}

	/** 更新権限の取得 */
	protected void getWDptDac() {
		MCList<MAT_DA_DPT_R> loginDa = MCList.create(MAT_DA_DPT_R.class);
		MAT_DA_DPT_R t = MAT_DA_DPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.wr_flg.eq(value(true)));
		builder.addWhereWithAnd(t.login_seq.eq(bind("1")), MCSys.user.loginSequence());
		dbSelect(createSqlId(LOGIC_ID, t, "S21"), loginDa, builder);

		if (loginDa.size() == 0) {
			addFullDptDac(loginDa) ;
		}

		_wDptDac = loginDa;
		_wDptIdxKey = _wDptDac.createIndex(MAT_DA_DPT_R.$dpt_cd);
	}

	/** フルデータアクセス権限の追加 **/
	protected void addFullDptDac(MCList<MAT_DA_DPT_R> loginDa) {
		MCRow bind = MCRow.create();
		bind.addStringColumn("usr_cd", MCSys.user.ID());

		if (!isFullDaUsr(bind)) {
			return ;
		}


		MAM_DPT_R t = MAM_DPT_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

		bind.addDateColumn("today", getToday());

		builder.setSelect(t.dpt_cd);
		builder.addSelect(
			value(mcframe.serverCore.sys.MCSys.user.ID()).as("usr_id"),
			value(mcframe.serverCore.sys.MCSys.user.loginSequence()).as("login_seq"),
			value(true).as("rd_flg"),
			value(true).as("wr_flg"));
		builder.addWhereWithAnd(t.st_dt.lte(bind("today")));
		builder.addWhereWithAnd(t.end_dt.gte(bind("today")));

		dbSelect(createSqlId(LOGIC_ID, t, "S41"), loginDa, builder, bind);
	}

	// 部門ＣＤ・ＤＡＣ（ここまで）

	// 物流グループＣＤ・ＤＡＣ（ここから）

	/**
	 * 検索権限がある行のみを取得するための {@link MCRowMatcher}を返す。
	 * <P>
	 * チェック対象の物流グループＣＤのカラム が複数指定された場合は
	 * どれか１つでも検索権限があれば取得対象になる。
	 *
	 * 検索権限がある行のみを取得するための {@link MCRowMatcher}
	 * @param <T> 検査対象のRowクラス
	 * @param clazz  検査対象のRowクラス
	 * @param cols チェック対象の物流グループＣＤのカラム
	 * @return 検索権限がある行のみを取得するための {@link MCRowMatcher}
	 */
	public <T extends MCRow> MCRowMatcher<T> rdLgGrp(Class<T> clazz, String... cols) {
		RdLgGrp<T> m = new RdLgGrp<T>();
		m.setLgGrpCols(cols);
		return m;
	}

	/**
	 * 検索可能な物流グループＣＤの行のみを選択する {@link MCRowMatcher}.
	 *
	 * @param <T>
	 */
	public class RdLgGrp<T extends MCRow> implements MCRowMatcher<T> {

		protected String[] _cols;

		/**
		 * 対象の物流グループＣＤのカラムを指定する
		 * @param cols
		 */
		public void setLgGrpCols(String... cols) {
			if (cols == null || cols.length < 1) {
				throw noColsFound();
			}
			_cols = cols;
		}

		protected MCAppException noColsFound() {
			return new MCAppException(MAUCL0108);
		}

		@Override
		public boolean match(T row) {
			return isRdLgGrpCd(row, _cols);
		}
	}

	/**
	 * チェック対象の物流グループＣＤのカラム値に対して、
	 * 検索権限があるかどうかをチェックする。
	 * <P>
	 * チェック対象の物流グループＣＤのカラム が複数指定された場合は
	 * どれか１つでも検索権限があれば、検索可能と判断する。
	 *
	 * @param row 検査対象のRow
	 * @param cols 検査対象の物流グループＣＤのカラム
	 * @return 検索可能な場合 true
	 */
	public boolean isRdLgGrpCd(MCRow row, String... cols) {
		if (cols == null || cols.length < 1) {
			throw new MCAppException(MAUCL0108);
		}
		String[] vals = new String[cols.length];
		for (int i = 0; i < cols.length; i++) {
			vals[i] = row.getString(cols[i]);
		}
		if (readableLgGrpCdDac(vals)) {
			return true;
		}
		return false;
	}

	/** 検索権限情報 */
	protected MCList<MAT_DA_LG_GRP_R> _rLgGrpDac;

	/** 検索権限検索用のインデックスキー */
	protected MCIndexKey _rLgGrpIdxKey;

	/**
	 * 物流グループの更新権限のチェックをします。<br>
	 * 更新権限がない場合はメッセージリストにエラーメッセージを格納して返します。
	 * 
	 * @param row チェック対象のRow
	 * @param lg_grp_cd_col 物流グループカラム名
	 * @return メッセージリスト
	 */
	public static MCMessageList checkWritableLgGrpCdDac(MCRow row, String lg_grp_cd_col) {
		MCMessageList msgL = new MCMessageList();
		if (!object(CLAZZ)._writableLgGrpCdDac(row.getStringNE(lg_grp_cd_col))) {
			msgL.add(new MCMessage(row, lg_grp_cd_col, MAUCL0060, row
					.getStringNE(lg_grp_cd_col), toDispGUIIndex(row)));
		}
		return msgL;
	}
	/**
	 * 物流グループの更新権限のチェックをします。<br>
	 * 更新権限がない場合はメッセージリストにエラーメッセージを格納して返します。
	 * 
	 * @param list チェック対象のList
	 * @param lg_grp_cd_col 物流グループカラム名
	 * @return メッセージリスト
	 */
	public static MCMessageList checkWritableLgGrpCdDac(MCList<? extends MCRow> list, String lg_grp_cd_col) {
		MCMessageList msgL = new MCMessageList();
		for (MCRow r : list) {
			msgL.addAll(checkWritableLgGrpCdDac(r, lg_grp_cd_col));
		}
		return msgL;
	}

	/**
	 * 対象の物流グループのうち１つでも検索権限を持っていたらtrue
	 * 
	 * @param dlvGrpCd 対象の物流グループの配列
	 * @return 対象の物流グループのうち１つでも検索権限を持っていたらtrue
	 */
	public static boolean readableLgGrpCdDac(String... lgGrpCd) {
		return object(CLAZZ)._readableLgGrpCdDac(lgGrpCd);
	}

	/**
	 * 対象の物流グループのうち１つでも検索権限を持っていたらtrue
	 * 
	 * @param dlvGrpCd 対象の物流グループの配列
	 * @return 対象の物流グループのうち１つでも検索権限を持っていたらtrue
	 */
	protected boolean _readableLgGrpCdDac(String... lgGrpCd) {
		if (lgGrpCd == null || lgGrpCd.length == 0) {
			return false;
		}
		for (String cd : lgGrpCd) {
			if (rLgGrpDac().contains(rLgGrpIdxKey(), cd)) {
				return true;
			}
		}
		return false;
	}

	/** 検索権限情報 */
	protected MCList<MAT_DA_LG_GRP_R> rLgGrpDac() {
		if (_rLgGrpDac == null) {
			getRLgGrpDac();
		}
		return _rLgGrpDac;
	}

	/** 検索権限検索用のインデックスキー */
	protected MCIndexKey rLgGrpIdxKey() {
		if (_rLgGrpIdxKey == null) {
			getRLgGrpDac();
		}
		return _rLgGrpIdxKey;
	}

	/** 検索権限情報の取得 */
	protected void getRLgGrpDac() {
		MCList<MAT_DA_LG_GRP_R> loginDa = MCList.create(MAT_DA_LG_GRP_R.class);
		MAT_DA_LG_GRP_R t = MAT_DA_LG_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.rd_flg.eq(value(true)));
		builder.addWhereWithAnd(t.login_seq.eq(bind("1")), MCSys.user.loginSequence());
		dbSelect(createSqlId(LOGIC_ID, t, "S22"), loginDa, builder);

		if (loginDa.size() == 0) {
			addFullLgGrpDac(loginDa) ;
		}

		_rLgGrpDac = loginDa;
		_rLgGrpIdxKey = _rLgGrpDac.createIndex(MAT_DA_LG_GRP_R.$lg_grp_cd);
	}

	/**
	 * 更新権限がある行のみを取得するための {@link MCRowMatcher}を返す。
	 * <P>
	 * チェック対象の物流グループＣＤのカラム が複数指定された場合は
	 * どれか１つでも更新権限があれば取得対象になる。
	 *
	 * @param <T> 検査対象のRowクラス
	 * @param clazz  検査対象のRowクラス
	 * @param cols チェック対象の物流グループＣＤのカラム
	 * @return 更新権限がある行のみを取得するための {@link MCRowMatcher}
	 */
	public <T extends MCRow> MCRowMatcher<T> wrLgGrp(Class<T> clazz, String... cols) {
		WrLgGrp<T> m = new WrLgGrp<T>();
		m.setLgGrpCols(cols);
		return m;
	}

	/**
	 * 更新可能な物流グループＣＤの行のみを選択する {@link MCRowMatcher}.
	 *
	 * @param <T>
	 */
	public class WrLgGrp<T extends MCRow> implements MCRowMatcher<T> {

		protected String[] _cols;

		/**
		 * 対象の物流グループＣＤのカラムを指定する
		 * @param cols
		 */
		public void setLgGrpCols(String... cols) {
			if (cols == null || cols.length < 1) {
				throw noColsFound();
			}
			_cols = cols;
		}

		protected MCAppException noColsFound() {
			return new MCAppException(MAUCL0108);
		}

		@Override
		public boolean match(T row) {
			return isWrLgGrpCd(row, _cols);
		}
	}

	/**
	 * チェック対象の物流グループＣＤのカラム値に対して、
	 * 更新権限があるかどうかをチェックする。
	 * <P>
	 * チェック対象の物流グループＣＤのカラム が複数指定された場合は
	 * どれか１つでも更新権限があれば、更新可能と判断する。
	 *
	 * @param row 検査対象のRow
	 * @param cols 検査対象の物流グループＣＤのカラム
	 * @return 更新可能な場合 true
	 */
	public boolean isWrLgGrpCd(MCRow row, String... cols) {
		if (cols == null || cols.length < 1) {
			throw new MCAppException(MAUCL0108);
		}
		String[] vals = new String[cols.length];
		for (int i = 0; i < cols.length; i++) {
			vals[i] = row.getString(cols[i]);
		}
		if (writableLgGrpCdDac(vals)) {
			return true;
		}
		return false;
	}

	/** 更新権限情報 */
	protected MCList<MAT_DA_LG_GRP_R> _wLgGrpDac;

	/** 更新権限検索用のインデックスキー */
	protected MCIndexKey _wLgGrpIdxKey;

	/**
	 * 対象の物流グループのうち１つでも更新権限を持っていたらtrue
	 * 
	 * @param dlvGrpCd 対象の物流グループの配列
	 * @return 対象の物流グループのうち１つでも更新権限を持っていたらtrue
	 */
	public static boolean writableLgGrpCdDac(String... lgGrpCd) {
		return object(CLAZZ)._writableLgGrpCdDac(lgGrpCd);
	}

	/**
	 * 対象の物流グループのうち１つでも更新権限を持っていたらtrue
	 * 
	 * @param dlvGrpCd 対象の物流グループの配列
	 * @return 対象の物流グループのうち１つでも更新権限を持っていたらtrue
	 */
	protected boolean _writableLgGrpCdDac(String... lgGrpCd) {
		if (lgGrpCd == null || lgGrpCd.length == 0) {
			return false;
		}
		for (String cd : lgGrpCd) {
			if (wLgGrpDac().contains(wDlvGrpIdxKey(), cd)) {
				return true;
			}
		}
		return false;
	}

	/** 更新権限情報 */
	protected MCList<MAT_DA_LG_GRP_R> wLgGrpDac() {
		if (_wLgGrpDac == null) {
			getWLgGrpDac();
		}
		return _wLgGrpDac;
	}

	/** 更新権限検索用のインデックスキー */
	protected MCIndexKey wDlvGrpIdxKey() {
		if (_wLgGrpIdxKey == null) {
			getWLgGrpDac();
		}
		return _wLgGrpIdxKey;
	}

	/** 更新権限の取得 */
	protected void getWLgGrpDac() {
		MCList<MAT_DA_LG_GRP_R> loginDa = MCList.create(MAT_DA_LG_GRP_R.class);
		MAT_DA_LG_GRP_R t = MAT_DA_LG_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.wr_flg.eq(value(true)));
		builder.addWhereWithAnd(t.login_seq.eq(bind("1")), MCSys.user.loginSequence());
		dbSelect(createSqlId(LOGIC_ID, t, "S23"), loginDa, builder);

		if (loginDa.size() == 0) {
			addFullLgGrpDac(loginDa) ;
		}

		_wLgGrpDac = loginDa;
		_wLgGrpIdxKey = _wLgGrpDac.createIndex(MAT_DA_LG_GRP_R.$lg_grp_cd);
	}

	/** フルデータアクセス権限の追加 **/
	protected void addFullLgGrpDac(MCList<MAT_DA_LG_GRP_R> loginDa) {
		MCRow bind = MCRow.create();
		bind.addStringColumn("usr_cd", MCSys.user.ID());

		if (!isFullDaUsr(bind)) {
			return ;
		}


		MAM_LG_GRP_R t = MAM_LG_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

		builder.setSelect(t.lg_grp_cd);
		builder.addSelect(
			value(mcframe.serverCore.sys.MCSys.user.ID()).as("usr_id"),
			value(mcframe.serverCore.sys.MCSys.user.loginSequence()).as("login_seq"),
			value(true).as("rd_flg"),
			value(true).as("wr_flg"));

		dbSelect(createSqlId(LOGIC_ID, t, "S42"), loginDa, builder);
	}

	// 物流グループＣＤ・ＤＡＣ（ここまで）

	// 場所ＣＤ・ＤＡＣ（ここから）

	/**
	 * 検索権限がある行のみを取得するための {@link MCRowMatcher}を返す。
	 * <P>
	 * チェック対象の場所ＣＤのカラム が複数指定された場合は
	 * どれか１つでも検索権限があれば取得対象になる。
	 *
	 * 検索権限がある行のみを取得するための {@link MCRowMatcher}
	 * @param <T> 検査対象のRowクラス
	 * @param clazz  検査対象のRowクラス
	 * @param cols チェック対象の場所ＣＤのカラム
	 * @return 検索権限がある行のみを取得するための {@link MCRowMatcher}
	 */
	public <T extends MCRow> MCRowMatcher<T> rdLoc(Class<T> clazz, String... cols) {
		RdLoc<T> m = new RdLoc<T>();
		m.setLocCols(cols);
		return m;
	}

	/**
	 * 検索可能な場所ＣＤの行のみを選択する {@link MCRowMatcher}.
	 *
	 * @param <T>
	 */
	public class RdLoc<T extends MCRow> implements MCRowMatcher<T> {

		protected String[] _cols;

		/**
		 * 対象の場所ＣＤのカラムを指定する
		 * @param cols
		 */
		public void setLocCols(String... cols) {
			if (cols == null || cols.length < 1) {
				throw noColsFound();
			}
			_cols = cols;
		}

		protected MCAppException noColsFound() {
			return new MCAppException(MAUCL0109);
		}

		@Override
		public boolean match(T row) {
			return isRdLocCd(row, _cols);
		}
	}

	/**
	 * チェック対象の場所ＣＤのカラム値に対して、
	 * 検索権限があるかどうかをチェックする。
	 * <P>
	 * チェック対象の場所ＣＤのカラム が複数指定された場合は
	 * どれか１つでも検索権限があれば、検索可能と判断する。
	 *
	 * @param row 検査対象のRow
	 * @param cols 検査対象の場所ＣＤのカラム
	 * @return 検索可能な場合 true
	 */
	public boolean isRdLocCd(MCRow row, String... cols) {
		if (cols == null || cols.length < 1) {
			throw new MCAppException(MAUCL0109);
		}
		String[] vals = new String[cols.length];
		for (int i = 0; i < cols.length; i++) {
			vals[i] = row.getString(cols[i]);
		}
		if (readableLocCdDac(vals)) {
			return true;
		}
		return false;
	}

	/** 検索権限情報 */
	protected MCList<MAT_DA_LOC_R> _rLocDac;

	/** 検索権限検索用のインデックスキー */
	protected MCIndexKey _rLocIdxKey;

	/**
	 * 対象の場所のうち１つでも検索権限を持っていたらtrue
	 * 
	 * @param locCd 対象の場所の配列
	 * @return 対象の場所のうち１つでも検索権限を持っていたらtrue
	 */
	public static boolean readableLocCdDac(String... locCd) {
		return object(CLAZZ)._readableLocCdDac(locCd);
	}

	/**
	 * 対象の場所のうち１つでも検索権限を持っていたらtrue
	 * 
	 * @param locCd 対象の場所の配列
	 * @return 対象の場所のうち１つでも検索権限を持っていたらtrue
	 */
	protected boolean _readableLocCdDac(String... locCd) {
		if (locCd == null || locCd.length == 0) {
			return false;
		}
		for (String cd : locCd) {
			if (rLocDac().contains(rLocIdxKey(), cd)) {
				return true;
			}
		}
		return false;
	}

	/** 検索権限情報 */
	protected MCList<MAT_DA_LOC_R> rLocDac() {
		if (_rLocDac == null) {
			getRLocDac();
		}
		return _rLocDac;
	}

	/** 検索権限検索用のインデックスキー */
	protected MCIndexKey rLocIdxKey() {
		if (_rLocIdxKey == null) {
			getRLocDac();
		}
		return _rLocIdxKey;
	}

	/** 検索権限情報の取得 */
	protected void getRLocDac() {
		MCList<MAT_DA_LOC_R> loginDa = MCList.create(MAT_DA_LOC_R.class);
		MAT_DA_LOC_R t = MAT_DA_LOC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.rd_flg.eq(value(true)));
		builder.addWhereWithAnd(t.login_seq.eq(bind("1")), MCSys.user.loginSequence());
		dbSelect(createSqlId(LOGIC_ID, t, "S24"), loginDa, builder);

		if (loginDa.size() == 0) {
			addFullLocDac(loginDa) ;
		}

		_rLocDac = loginDa;
		_rLocIdxKey = _rLocDac.createIndex(MAT_DA_LOC_R.$loc_cd);
	}

	/**
	 * 更新権限がある行のみを取得するための {@link MCRowMatcher}を返す。
	 * <P>
	 * チェック対象の場所ＣＤのカラム が複数指定された場合は
	 * どれか１つでも更新権限があれば取得対象になる。
	 *
	 * @param <T> 検査対象のRowクラス
	 * @param clazz  検査対象のRowクラス
	 * @param cols チェック対象の場所ＣＤのカラム
	 * @return 更新権限がある行のみを取得するための {@link MCRowMatcher}
	 */
	public <T extends MCRow> MCRowMatcher<T> wrLoc(Class<T> clazz, String... cols) {
		WrLoc<T> m = new WrLoc<T>();
		m.setLocCols(cols);
		return m;
	}

	/**
	 * 更新可能な場所ＣＤの行のみを選択する {@link MCRowMatcher}.
	 *
	 * @param <T>
	 */
	public class WrLoc<T extends MCRow> implements MCRowMatcher<T> {

		protected String[] _cols;

		/**
		 * 対象の場所ＣＤのカラムを指定する
		 * @param cols
		 */
		public void setLocCols(String... cols) {
			if (cols == null || cols.length < 1) {
				throw noColsFound();
			}
			_cols = cols;
		}

		protected MCAppException noColsFound() {
			return new MCAppException(MAUCL0109);
		}

		@Override
		public boolean match(T row) {
			return isWrLocCd(row, _cols);
		}
	}

	/**
	 * チェック対象の場所ＣＤのカラム値に対して、
	 * 更新権限があるかどうかをチェックする。
	 * <P>
	 * チェック対象の場所ＣＤのカラム が複数指定された場合は
	 * どれか１つでも更新権限があれば、更新可能と判断する。
	 *
	 * @param row 検査対象のRow
	 * @param cols 検査対象の場所ＣＤのカラム
	 * @return 更新可能な場合 true
	 */
	public boolean isWrLocCd(MCRow row, String... cols) {
		if (cols == null || cols.length < 1) {
			throw new MCAppException(MAUCL0109);
		}
		String[] vals = new String[cols.length];
		for (int i = 0; i < cols.length; i++) {
			vals[i] = row.getString(cols[i]);
		}
		if (writableLocCdDac(vals)) {
			return true;
		}
		return false;
	}

	/** 更新権限情報 */
	protected MCList<MAT_DA_LOC_R> _wLocDac;

	/** 更新権限検索用のインデックスキー */
	protected MCIndexKey _wLocIdxKey;

	/**
	 * 場所の更新権限のチェックをします。<br>
	 * 更新権限がない場合はメッセージリストにエラーメッセージを格納して返します。
	 * 
	 * @param row チェック対象のRow
	 * @param loc_cd_col 場所カラム名
	 * @return メッセージリスト
	 */
	public static MCMessageList checkWritableLocCdDac(MCRow row, String loc_cd_col) {
		MCMessageList msgL = new MCMessageList();
		if (!object(CLAZZ)._writableLocCdDac(row.getStringNE(loc_cd_col))) {
			msgL.add(new MCMessage(row, loc_cd_col, MAUCL0061, row
					.getStringNE(loc_cd_col), toDispGUIIndex(row)));
		}
		return msgL;
	}
	/**
	 * 場所の更新権限のチェックをします。<br>
	 * 更新権限がない場合はメッセージリストにエラーメッセージを格納して返します。
	 * 
	 * @param list チェック対象のList
	 * @param loc_cd_col 場所カラム名
	 * @return メッセージリスト
	 */
	public static MCMessageList checkWritableLocCdDac(MCList<? extends MCRow> list, String loc_cd_col) {
		MCMessageList msgL = new MCMessageList();
		for (MCRow r : list) {
			msgL.addAll(checkWritableLocCdDac(r, loc_cd_col));
		}
		return msgL;
	}

	/**
	 * 対象の場所のうち１つでも更新権限を持っていたらtrue
	 * 
	 * @param locCd 対象の場所の配列
	 * @return 対象の場所のうち１つでも更新権限を持っていたらtrue
	 */
	public static boolean writableLocCdDac(String... locCd) {
		return object(CLAZZ)._writableLocCdDac(locCd);
	}

	/**
	 * 対象の場所のうち１つでも更新権限を持っていたらtrue
	 * 
	 * @param locCd 対象の場所の配列
	 * @return 対象の場所のうち１つでも更新権限を持っていたらtrue
	 */
	protected boolean _writableLocCdDac(String... locCd) {
		if (locCd == null || locCd.length == 0) {
			return false;
		}
		for (String cd : locCd) {
			if (wLocDac().contains(wLocIdxKey(), cd)) {
				return true;
			}
		}
		return false;
	}

	/** 更新権限情報 */
	protected MCList<MAT_DA_LOC_R> wLocDac() {
		if (_wLocDac == null) {
			getWLocDac();
		}
		return _wLocDac;
	}

	/** 更新権限検索用のインデックスキー */
	protected MCIndexKey wLocIdxKey() {
		if (_wLocIdxKey == null) {
			getWLocDac();
		}
		return _wLocIdxKey;
	}

	/** 更新権限の取得 */
	protected void getWLocDac() {
		MCList<MAT_DA_LOC_R> loginDa = MCList.create(MAT_DA_LOC_R.class);
		MAT_DA_LOC_R t = MAT_DA_LOC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.wr_flg.eq(value(true)));
		builder.addWhereWithAnd(t.login_seq.eq(bind("1")), MCSys.user.loginSequence());
		dbSelect(createSqlId(LOGIC_ID, t, "S25"), loginDa, builder);

		if (loginDa.size() == 0) {
			addFullLocDac(loginDa) ;
		}

		_wLocDac = loginDa;
		_wLocIdxKey = _wLocDac.createIndex(MAT_DA_LOC_R.$loc_cd);
	}

	/** フルデータアクセス権限の追加 **/
	protected void addFullLocDac(MCList<MAT_DA_LOC_R> loginDa) {
		MCRow bind = MCRow.create();
		bind.addStringColumn("usr_cd", MCSys.user.ID());

		if (!isFullDaUsr(bind)) {
			return ;
		}


		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

		builder.setSelect(t.loc_cd);
		builder.addSelect(
			value(mcframe.serverCore.sys.MCSys.user.ID()).as("usr_id"),
			value(mcframe.serverCore.sys.MCSys.user.loginSequence()).as("login_seq"),
			value(true).as("rd_flg"),
			value(true).as("wr_flg"));

		dbSelect(createSqlId(LOGIC_ID, t, "S43"), loginDa, builder);
	}

	// 場所ＣＤ・ＤＡＣ（ここまで）

	// ＷＧ ＣＤ・ＤＡＣ（ここから）

	/**
	 * 検索権限がある行のみを取得するための {@link MCRowMatcher}を返す。
	 * <P>
	 * チェック対象のＷＧ ＣＤのカラム が複数指定された場合は
	 * どれか１つでも検索権限があれば取得対象になる。
	 *
	 * 検索権限がある行のみを取得するための {@link MCRowMatcher}
	 * @param <T> 検査対象のRowクラス
	 * @param clazz  検査対象のRowクラス
	 * @param cols チェック対象のＷＧ ＣＤのカラム
	 * @return 検索権限がある行のみを取得するための {@link MCRowMatcher}
	 */
	public <T extends MCRow> MCRowMatcher<T> rdWg(Class<T> clazz, String... cols) {
		RdWg<T> m = new RdWg<T>();
		m.setWgCols(cols);
		return m;
	}

	/**
	 * 検索可能なＷＧ ＣＤの行のみを選択する {@link MCRowMatcher}.
	 *
	 * @param <T>
	 */
	public class RdWg<T extends MCRow> implements MCRowMatcher<T> {

		protected String[] _cols;

		/**
		 * 対象のＷＧ ＣＤのカラムを指定する
		 * @param cols
		 */
		public void setWgCols(String... cols) {
			if (cols == null || cols.length < 1) {
				throw noColsFound();
			}
			_cols = cols;
		}

		protected MCAppException noColsFound() {
			return new MCAppException(MAUCL0110);
		}

		@Override
		public boolean match(T row) {
			return isRdWgCd(row, _cols);
		}
	}

	/**
	 * チェック対象のＷＧ ＣＤのカラム値に対して、
	 * 検索権限があるかどうかをチェックする。
	 * <P>
	 * チェック対象のＷＧ ＣＤのカラム が複数指定された場合は
	 * どれか１つでも検索権限があれば、検索可能と判断する。
	 *
	 * @param row 検査対象のRow
	 * @param cols 検査対象のＷＧ ＣＤのカラム
	 * @return 検索可能な場合 true
	 */
	public boolean isRdWgCd(MCRow row, String... cols) {
		if (cols == null || cols.length < 1) {
			throw new MCAppException(MAUCL0110);
		}
		String[] vals = new String[cols.length];
		for (int i = 0; i < cols.length; i++) {
			vals[i] = row.getString(cols[i]);
		}
		if (readableWgCdDac(vals)) {
			return true;
		}
		return false;
	}

	/** 検索権限情報 */
	protected MCList<MAT_DA_WG_R> _rWgDac;

	/** 検索権限検索用のインデックスキー */
	protected MCIndexKey _rWgIdxKey;

	/**
	 * 対象のＷＧ ＣＤのうち１つでも検索権限を持っていたらtrue
	 * 
	 * @param wgCd 対象のＷＧ ＣＤの配列
	 * @return 対象のＷＧ ＣＤのうち１つでも検索権限を持っていたらtrue
	 */
	public static boolean readableWgCdDac(String... wgCd) {
		return object(CLAZZ)._readableWgCdDac(wgCd);
	}

	/**
	 * 対象のＷＧ ＣＤのうち１つでも検索権限を持っていたらtrue
	 * 
	 * @param wgCd 対象のＷＧ ＣＤの配列
	 * @return 対象のＷＧ ＣＤのうち１つでも検索権限を持っていたらtrue
	 */
	protected boolean _readableWgCdDac(String... wgCd) {
		if (wgCd == null || wgCd.length == 0) {
			return false;
		}
		for (String cd : wgCd) {
			if (rWgDac().contains(rWgIdxKey(), cd)) {
				return true;
			}
		}
		return false;
	}

	/** 検索権限情報 */
	protected MCList<MAT_DA_WG_R> rWgDac() {
		if (_rWgDac == null) {
			getRWgDac();
		}
		return _rWgDac;
	}

	/** 検索権限検索用のインデックスキー */
	protected MCIndexKey rWgIdxKey() {
		if (_rWgIdxKey == null) {
			getRWgDac();
		}
		return _rWgIdxKey;
	}

	/** 検索権限情報の取得 */
	protected void getRWgDac() {
		MCList<MAT_DA_WG_R> loginDa = MCList.create(MAT_DA_WG_R.class);
		MAT_DA_WG_R t = MAT_DA_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.rd_flg.eq(value(true)));
		builder.addWhereWithAnd(t.login_seq.eq(bind("1")), MCSys.user.loginSequence());
		dbSelect(createSqlId(LOGIC_ID, t, "S26"), loginDa, builder);

		if (loginDa.size() == 0) {
			addFullWgDac(loginDa) ;
		}

		_rWgDac = loginDa;
		_rWgIdxKey = _rWgDac.createIndex(MAT_DA_WG_R.$wg_cd);
	}

	/**
	 * 更新権限がある行のみを取得するための {@link MCRowMatcher}を返す。
	 * <P>
	 * チェック対象のＷＧ ＣＤのカラム が複数指定された場合は
	 * どれか１つでも更新権限があれば取得対象になる。
	 *
	 * @param <T> 検査対象のRowクラス
	 * @param clazz  検査対象のRowクラス
	 * @param cols チェック対象のＷＧ ＣＤのカラム
	 * @return 更新権限がある行のみを取得するための {@link MCRowMatcher}
	 */
	public <T extends MCRow> MCRowMatcher<T> wrWg(Class<T> clazz, String... cols) {
		WrWg<T> m = new WrWg<T>();
		m.setWgCols(cols);
		return m;
	}

	/**
	 * 更新可能なＷＧ ＣＤの行のみを選択する {@link MCRowMatcher}.
	 *
	 * @param <T>
	 */
	public class WrWg<T extends MCRow> implements MCRowMatcher<T> {

		protected String[] _cols;

		/**
		 * 対象のＷＧ ＣＤのカラムを指定する
		 * @param cols
		 */
		public void setWgCols(String... cols) {
			if (cols == null || cols.length < 1) {
				throw noColsFound();
			}
			_cols = cols;
		}

		protected MCAppException noColsFound() {
			return new MCAppException(MAUCL0110);
		}

		@Override
		public boolean match(T row) {
			return isWrWgCd(row, _cols);
		}
	}

	/**
	 * チェック対象のＷＧ ＣＤのカラム値に対して、
	 * 更新権限があるかどうかをチェックする。
	 * <P>
	 * チェック対象のＷＧ ＣＤのカラム が複数指定された場合は
	 * どれか１つでも更新権限があれば、更新可能と判断する。
	 *
	 * @param row 検査対象のRow
	 * @param cols 検査対象のＷＧ ＣＤのカラム
	 * @return 更新可能な場合 true
	 */
	public boolean isWrWgCd(MCRow row, String... cols) {
		if (cols == null || cols.length < 1) {
			throw new MCAppException(MAUCL0110);
		}
		String[] vals = new String[cols.length];
		for (int i = 0; i < cols.length; i++) {
			vals[i] = row.getString(cols[i]);
		}
		if (writableWgCdDac(vals)) {
			return true;
		}
		return false;
	}

	/** 更新権限情報 */
	protected MCList<MAT_DA_WG_R> _wWgDac;

	/** 更新権限検索用のインデックスキー */
	protected MCIndexKey _wWgIdxKey;
	
	/**
	 * ＷＧの更新権限のチェックをします。<br>
	 * 更新権限がない場合はメッセージリストにエラーメッセージを格納して返します。
	 * 
	 * @param row チェック対象のRow
	 * @param wg_cd_col ＷＧカラム名
	 * @return メッセージリスト
	 */
	public static MCMessageList checkWritableWgCdDac(MCRow row, String wg_cd_col) {
		MCMessageList msgL = new MCMessageList();
		if (!object(CLAZZ)._writableWgCdDac(row.getStringNE(wg_cd_col))) {
			msgL.add(new MCMessage(row, wg_cd_col, MAUCL0062, row.getStringNE(wg_cd_col),
					toDispGUIIndex(row)));
		}
		return msgL;
	}
	/**
	 * ＷＧの更新権限のチェックをします。<br>
	 * 更新権限がない場合はメッセージリストにエラーメッセージを格納して返します。
	 * 
	 * @param list チェック対象のList
	 * @param wg_cd_col ＷＧカラム名
	 * @return メッセージリスト
	 */
	public static MCMessageList checkWritableWgCdDac(MCList<? extends MCRow> list, String wg_cd_col) {
		MCMessageList msgL = new MCMessageList();
		for (MCRow r : list) {
			msgL.addAll(checkWritableWgCdDac(r, wg_cd_col));
		}
		return msgL;
	}

	/**
	 * 対象のＷＧ ＣＤのうち１つでも更新権限を持っていたらtrue
	 * 
	 * @param wgCd 対象のＷＧ ＣＤの配列
	 * @return 対象のＷＧ ＣＤのうち１つでも更新権限を持っていたらtrue
	 */
	public static boolean writableWgCdDac(String... wgCd) {
		return object(CLAZZ)._writableWgCdDac(wgCd);
	}

	/**
	 * 対象のＷＧ ＣＤのうち１つでも更新権限を持っていたらtrue
	 * 
	 * @param wgCd 対象のＷＧ ＣＤの配列
	 * @return 対象の場ＷＧ ＣＤのうち１つでも更新権限を持っていたらtrue
	 */
	protected boolean _writableWgCdDac(String... wgCd) {
		if (wgCd == null || wgCd.length == 0) {
			return false;
		}
		for (String cd : wgCd) {
			if (wWgDac().contains(wWgIdxKey(), cd)) {
				return true;
			}
		}
		return false;
	}

	/** 更新権限情報 */
	protected MCList<MAT_DA_WG_R> wWgDac() {
		if (_wWgDac == null) {
			getWWgDac();
		}
		return _wWgDac;
	}

	/** 更新権限検索用のインデックスキー */
	protected MCIndexKey wWgIdxKey() {
		if (_wWgIdxKey == null) {
			getWWgDac();
		}
		return _wWgIdxKey;
	}

	/** 更新権限の取得 */
	protected void getWWgDac() {
		MCList<MAT_DA_WG_R> loginDa = MCList.create(MAT_DA_WG_R.class);
		MAT_DA_WG_R t = MAT_DA_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.wr_flg.eq(value(true)));
		builder.addWhereWithAnd(t.login_seq.eq(bind("1")), MCSys.user.loginSequence());
		dbSelect(createSqlId(LOGIC_ID, t, "S27"), loginDa, builder);

		if (loginDa.size() == 0) {
			addFullWgDac(loginDa) ;
		}

		_wWgDac = loginDa;
		_wWgIdxKey = _wWgDac.createIndex(MAT_DA_WG_R.$wg_cd);
	}

	/** フルデータアクセス権限の追加 **/
	protected void addFullWgDac(MCList<MAT_DA_WG_R> loginDa) {
		MCRow bind = MCRow.create();
		bind.addStringColumn("usr_cd", MCSys.user.ID());

		if (!isFullDaUsr(bind)) {
			return ;
		}


		MAM_WG_R t = MAM_WG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

		builder.setSelect(t.wg_cd);
		builder.addSelect(
			value(mcframe.serverCore.sys.MCSys.user.ID()).as("usr_id"),
			value(mcframe.serverCore.sys.MCSys.user.loginSequence()).as("login_seq"),
			value(true).as("rd_flg"),
			value(true).as("wr_flg"));

		dbSelect(createSqlId(LOGIC_ID, t, "S44"), loginDa, builder);
	}

	// ＷＧ ＣＤ・ＤＡＣ（ここまで）
	

	// 総量引当場所グループ・ＤＡＣ（ここから）
	/**
	 * 検索可能な総量引当場所グループＣＤの行のみを選択する {@link MCRowMatcher}.
	 *
	 * @param <T>
	 */
	public class RdAlcGrp<T extends MCRow> implements MCRowMatcher<T> {

		protected String[] _cols;

		/**
		 * 対象の総量引当場所グループ ＣＤのカラムを指定する
		 * @param cols
		 */
		public void setAlcGrpCols(String... cols) {
			if (cols == null || cols.length < 1) {
				throw noColsFound();
			}
			_cols = cols;
		}

		protected MCAppException noColsFound() {
			return new MCAppException(MAUCL0113);
		}

		@Override
		public boolean match(T row) {
			return isRdAlcGrpCd(row, _cols);
		}
	}
	
	/**
	 * チェック対象の総量引当場所グループＣＤのカラム値に対して、
	 * 検索権限があるかどうかをチェックする。
	 * <P>
	 * チェック対象の総量引当場所グループＣＤのカラム が複数指定された場合は
	 * どれか１つでも検索権限があれば、検索可能と判断する。
	 *
	 * @param row 検査対象のRow
	 * @param cols 検査対象の総量引当場所グループＣＤのカラム
	 * @return 検索可能な場合 true
	 */
	public boolean isRdAlcGrpCd(MCRow row, String... cols) {
		if (cols == null || cols.length < 1) {
			throw new MCAppException(MAUCL0113);
		}
		String[] vals = new String[cols.length];
		for (int i = 0; i < cols.length; i++) {
			vals[i] = row.getString(cols[i]);
		}
		if (readableAlcGrpCdDac(vals)) {
			return true;
		}
		return false;
	}
	
	/** 検索権限情報 */
	protected MCList<MAT_DA_ALLOC_GRP_R> _rAlcGrpDac;

	/** 検索権限検索用のインデックスキー */
	protected MCIndexKey _rAlcGrpIdxKey;
	
	/**
	 * 対象の総量引当場所グループＣＤのうち１つでも検索権限を持っていたらtrue
	 * 
	 * @param alcGrpCd 対象の総量引当場所グループＣＤの配列
	 * @return 対象の総量引当場所グループＣＤのうち１つでも検索権限を持っていたらtrue
	 */
	public static boolean readableAlcGrpCdDac(String... alcGrpCd) {
		return object(CLAZZ)._readableAlcGrpCdDac(alcGrpCd);
	}

	/**
	 * 対象の総量引当場所グループ ＣＤのうち１つでも検索権限を持っていたらtrue
	 * 
	 * @param alcGrpCd 対象の総量引当場所グループＣＤの配列
	 * @return 対象の総量引当場所グループＣＤのうち１つでも検索権限を持っていたらtrue
	 */
	protected boolean _readableAlcGrpCdDac(String... alcGrpCd) {
		if (alcGrpCd == null || alcGrpCd.length == 0) {
			return false;
		}
		for (String cd : alcGrpCd) {
			if (rAlcGrpDac().contains(rAlcGrpIdxKey(), cd)) {
				return true;
			}
		}
		return false;
	}
	
	/** 検索権限情報 */
	protected MCList<MAT_DA_ALLOC_GRP_R> rAlcGrpDac() {
		if (_rAlcGrpDac == null) {
			getRAlcGrpDac();
		}
		return _rAlcGrpDac;
	}

	/** 検索権限検索用のインデックスキー */
	protected MCIndexKey rAlcGrpIdxKey() {
		if (_rAlcGrpIdxKey == null) {
			getRAlcGrpDac();
		}
		return _rAlcGrpIdxKey;
	}
	
	/** 検索権限情報の取得 */
	protected void getRAlcGrpDac() {
		MCList<MAT_DA_ALLOC_GRP_R> loginDa = MCList.create(MAT_DA_ALLOC_GRP_R.class);
		MAT_DA_ALLOC_GRP_R t = MAT_DA_ALLOC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.rd_flg.eq(value(true)));
		builder.addWhereWithAnd(t.login_seq.eq(bind("1")), MCSys.user.loginSequence());
		dbSelect(createSqlId(LOGIC_ID, t, "S28"), loginDa, builder);

		if (loginDa.size() == 0) {
			addFullAlcGrpDac(loginDa) ;
		}

		_rAlcGrpDac = loginDa;
		_rAlcGrpIdxKey = _rAlcGrpDac.createIndex(MAT_DA_ALLOC_GRP_R.$alloc_grp_cd);
	}

	/**
	 * 更新権限がある行のみを取得するための {@link MCRowMatcher}を返す。
	 * <P>
	 * チェック対象の総量引当場所グループＣＤのカラム が複数指定された場合は
	 * どれか１つでも更新権限があれば取得対象になる。
	 *
	 * @param <T> 検査対象のRowクラス
	 * @param clazz  検査対象のRowクラス
	 * @param cols チェック対象の総量引当場所グループＣＤのカラム
	 * @return 更新権限がある行のみを取得するための {@link MCRowMatcher}
	 */
	public <T extends MCRow> MCRowMatcher<T> wrAlcGrp(Class<T> clazz, String... cols) {
		WrAlcGrp<T> m = new WrAlcGrp<T>();
		m.setAlcGrpCols(cols);
		return m;
	}
	
	/**
	 * 更新可能な総量引当場所グループＣＤの行のみを選択する {@link MCRowMatcher}.
	 *
	 * @param <T>
	 */
	public class WrAlcGrp<T extends MCRow> implements MCRowMatcher<T> {

		protected String[] _cols;

		/**
		 * 対象の総量引当場所グループＣＤのカラムを指定する
		 * @param cols
		 */
		public void setAlcGrpCols(String... cols) {
			if (cols == null || cols.length < 1) {
				throw noColsFound();
			}
			_cols = cols;
		}

		protected MCAppException noColsFound() {
			return new MCAppException(MAUCL0113);
		}

		@Override
		public boolean match(T row) {
			return isWrAlcGrpCd(row, _cols);
		}
	}
	
	/**
	 * チェック対象の総量引当場所グループＣＤのカラム値に対して、
	 * 更新権限があるかどうかをチェックする。
	 * <P>
	 * チェック対象の総量引当場所グループＣＤのカラム が複数指定された場合は
	 * どれか１つでも更新権限があれば、更新可能と判断する。
	 *
	 * @param row 検査対象のRow
	 * @param cols 検査対象の総量引当場所グループＣＤのカラム
	 * @return 更新可能な場合 true
	 */
	public boolean isWrAlcGrpCd(MCRow row, String... cols) {
		if (cols == null || cols.length < 1) {
			throw new MCAppException(MAUCL0113);
		}
		String[] vals = new String[cols.length];
		for (int i = 0; i < cols.length; i++) {
			vals[i] = row.getString(cols[i]);
		}
		if (writableAlcGrpCdDac(vals)) {
			return true;
		}
		return false;
	}
	
	/** 更新権限情報 */
	protected MCList<MAT_DA_ALLOC_GRP_R> _wAlcGrpDac;

	/** 更新権限検索用のインデックスキー */
	protected MCIndexKey _wAlcGrpIdxKey;
	
	/**
	 * 総量引当場所グループの更新権限のチェックをします。<br>
	 * 更新権限がない場合はメッセージリストにエラーメッセージを格納して返します。
	 * 
	 * @param row チェック対象のRow
	 * @param alc_grp_cd_col 総量引当場所グループカラム名
	 * @return メッセージリスト
	 */
	public static MCMessageList checkWritableAlcGrpCdDac(MCRow row, String alc_grp_cd_col) {
		MCMessageList msgL = new MCMessageList();
		if (!object(CLAZZ)._writableAlcGrpCdDac(row.getStringNE(alc_grp_cd_col))) {
			msgL.add(new MCMessage(row, alc_grp_cd_col, MAUCL0063, row.getStringNE(alc_grp_cd_col),
					toDispGUIIndex(row)));
		}
		return msgL;
	}
	
	/**
	 * 総量引当場所グループの更新権限のチェックをします。<br>
	 * 更新権限がない場合はメッセージリストにエラーメッセージを格納して返します。
	 * 
	 * @param list チェック対象のList
	 * @param alc_grp_cd_col 総量引当場所グループカラム名
	 * @return メッセージリスト
	 */
	public static MCMessageList checkWritableAlcGrpCdDac(MCList<? extends MCRow> list, String alc_grp_cd_col) {
		MCMessageList msgL = new MCMessageList();
		for (MCRow r : list) {
			msgL.addAll(checkWritableAlcGrpCdDac(r, alc_grp_cd_col));
		}
		return msgL;
	}
	
	/**
	 * 対象の総量引当場所グループＣＤのうち１つでも更新権限を持っていたらtrue
	 * 
	 * @param alcGrpCd 対象の総量引当場所グループＣＤの配列
	 * @return 対象の総量引当場所グループＣＤのうち１つでも更新権限を持っていたらtrue
	 */
	public static boolean writableAlcGrpCdDac(String... alcGrpCd) {
		return object(CLAZZ)._writableAlcGrpCdDac(alcGrpCd);
	}

	/**
	 * 対象の総量引当場所グループＣＤのうち１つでも更新権限を持っていたらtrue
	 * 
	 * @param alcGrpCd 対象の総量引当場所グループＣＤの配列
	 * @return 対象の場総量引当場所グループＣＤのうち１つでも更新権限を持っていたらtrue
	 */
	protected boolean _writableAlcGrpCdDac(String... alcGrpCd) {
		if (alcGrpCd == null || alcGrpCd.length == 0) {
			return false;
		}
		for (String cd : alcGrpCd) {
			if (wAlcGrpDac().contains(wAlcGrpIdxKey(), cd)) {
				return true;
			}
		}
		return false;
	}
	
	/** 更新権限情報 */
	protected MCList<MAT_DA_ALLOC_GRP_R> wAlcGrpDac() {
		if (_wAlcGrpDac == null) {
			getWAlcGrpDac();
		}
		return _wAlcGrpDac;
	}

	/** 更新権限検索用のインデックスキー */
	protected MCIndexKey wAlcGrpIdxKey() {
		if (_wAlcGrpIdxKey == null) {
			getWAlcGrpDac();
		}
		return _wAlcGrpIdxKey;
	}
	
	/** 更新権限の取得 */
	protected void getWAlcGrpDac() {
		MCList<MAT_DA_ALLOC_GRP_R> loginDa = MCList.create(MAT_DA_ALLOC_GRP_R.class);
		MAT_DA_ALLOC_GRP_R t = MAT_DA_ALLOC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.wr_flg.eq(value(true)));
		builder.addWhereWithAnd(t.login_seq.eq(bind("1")), MCSys.user.loginSequence());
		dbSelect(createSqlId(LOGIC_ID, t, "S29"), loginDa, builder);

		if (loginDa.size() == 0) {
			addFullAlcGrpDac(loginDa) ;
		}

		_wAlcGrpDac = loginDa;
		_wAlcGrpIdxKey = _wAlcGrpDac.createIndex(MAT_DA_ALLOC_GRP_R.$alloc_grp_cd);
	}

	/** フルデータアクセス権限の追加 **/
	protected void addFullAlcGrpDac(MCList<MAT_DA_ALLOC_GRP_R> loginDa) {
		MCRow bind = MCRow.create();
		bind.addStringColumn("usr_cd", MCSys.user.ID());

		if (!isFullDaUsr(bind)) {
			return ;
		}


		MAM_ALLOC_GRP_R t = MAM_ALLOC_GRP_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

		builder.setSelect(t.alloc_grp_cd);
		builder.addSelect(
			value(mcframe.serverCore.sys.MCSys.user.ID()).as("usr_id"),
			value(mcframe.serverCore.sys.MCSys.user.loginSequence()).as("login_seq"),
			value(true).as("rd_flg"),
			value(true).as("wr_flg"));

		dbSelect(createSqlId(LOGIC_ID, t, "S45"), loginDa, builder);
	}
	// 総量引当場所グループ・ＤＡＣ（ここまで）

	//FMCB CUSTOM END
}