package mcframe.serverMSUC.MSUCL0090;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
//FMCB CUSTOM_IMPORT END

/**
 * "MSUCL_SCMLinkUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSUCL_SCMLinkUtil_MC extends MSUCL_SCMLinkUtil_MC_A{
	//FMCB CUSTOM START

	/**
	 * SCMLinkUtil_Srch01オペレーション.<p>
	 *
	 * 外部システムＣＤを取得する<br>
	 */
	public class SCMLinkUtil_Srch01 extends MSUCL_SCMLinkUtil_MC_A.SCMLinkUtil_Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			doCache();
			setExtSysInf();
			setDown();
		}

		/**
		 * マスタデータキャッシュ
		 */
		protected void doCache() {
			MCList<SCMLinkUtil_Srch01_CndR> locL = MCList.create(SCMLinkUtil_Srch01_CndR.class);
			up0().forEach(r -> {
				if (isWms(r.if_proc_typ()) && !isNull(r.loc_cd())) {
					locL.add(r);
				}
			});
			if (!locL.isEmpty()) {
				initLocL(locL);
				// 場所⇒物流Gの順で比較するので、物流Gを設定する
				locL.forEach(r -> {
					r.lg_grp_cd(_locCache.get(r.loc_cd()).lg_grp_cd());
				});
			}

			initScmIfCtlL(up0());
		}

		/**
		 * SCM IF制御マスタに対応する外部システムCDなどを設定する
		 */
		protected void setExtSysInf() {
			for (SCMLinkUtil_Srch01_CndR r : up0()) {

				// SCM IF制御マスタを取得
				MAM_SCM_IF_CTL_R ctlR = _scmIfCtlCache.get(r);
				if (!isNull(ctlR)) {
					r.ext_sys_cd(nvl(ctlR.ext_sys_cd(), MAC_STR.NULL_VAL.value()));
					r.not_send_upd_flg(ctlR.getBoolean("not_send_upd_flg"));
					r.not_dup_imp_flg(ctlR.getBoolean("not_dup_imp_flg"));
					r.if_upd_typ(ctlR.getString("if_upd_typ"));
					r.dlv_slip_split_flg(ctlR.getBoolean("dlv_slip_split_flg"));
					r.null_val_if_flg(ctlR.getBoolean("null_val_if_flg"));
				}
			}
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * WMS関連のインタフェースか
		 */
		protected boolean isWms(String ifProcTyp) {
			return MAC_IF_PROC_TYP.isWMS_SHIP_INST_SEND(ifProcTyp)
					|| MAC_IF_PROC_TYP.isWMS_SHIP_ACT_RECV(ifProcTyp)
					|| MAC_IF_PROC_TYP.isWMS_ARR_SCHD_SEND(ifProcTyp)
					|| MAC_IF_PROC_TYP.isWMS_ARR_ACT_RECV(ifProcTyp)
					|| MAC_IF_PROC_TYP.isWMS_XFR_INST_SEND(ifProcTyp)
					|| MAC_IF_PROC_TYP.isWMS_XFR_ACT_RECV(ifProcTyp)
					|| MAC_IF_PROC_TYP.isWMS_ACXFR_ACT_RECV(ifProcTyp);
		}
		
		protected boolean isLims(String ifProcTyp) {
			return MAC_IF_PROC_TYP.isMES_INSP_INST_SEND(ifProcTyp)
					|| MAC_IF_PROC_TYP.isMES_INSP_ACT_RECV(ifProcTyp);
		}

		/**
		 * SCM IF制御マスタキャッシュ
		 */
		protected ScmIfCtlCache _scmIfCtlCache;
		protected void initScmIfCtlL(MCList<SCMLinkUtil_Srch01_CndR> l) {
			_scmIfCtlCache = new ScmIfCtlCache(l);
		}
		public class ScmIfCtlCache {
			protected MCIndexKey _idx;
			protected MCList<MAM_SCM_IF_CTL_R> _dbc;
			public ScmIfCtlCache(MCList<SCMLinkUtil_Srch01_CndR> l) {
				init(l);
			}
			protected void init(MCList<SCMLinkUtil_Srch01_CndR> l) {
				MCList<MAM_SCM_IF_CTL_R> proto = MCList.create(MAM_SCM_IF_CTL_R.class);
				proto.addBooleanColumn("not_send_upd_flg");
				proto.addBooleanColumn("not_dup_imp_flg");
				proto.addStringColumn("if_upd_typ");
				proto.addBooleanColumn("dlv_slip_split_flg");
				proto.addBooleanColumn("null_val_if_flg");

				_dbc = proto.clone();

				MAM_SCM_IF_CTL_R t = MAM_SCM_IF_CTL_R.create("T");
				MAM_EXT_SYS_R m = MAM_EXT_SYS_R.create("M");


				MCList<SCMLinkUtil_Srch01_CndR> wmsL = MCList.create(SCMLinkUtil_Srch01_CndR.class);
				MCList<SCMLinkUtil_Srch01_CndR> limsL = MCList.create(SCMLinkUtil_Srch01_CndR.class);
				MCList<SCMLinkUtil_Srch01_CndR> mesL = MCList.create(SCMLinkUtil_Srch01_CndR.class);

				for (SCMLinkUtil_Srch01_CndR r : l) {
					if (isWms(r.if_proc_typ())) {
						wmsL.add(r);
					}
					else if (isLims(r.if_proc_typ())) {
						limsL.add(r);
					}
					else {
						mesL.add(r);
					}
				}

				// WMS関連に対応するマスタを取得
				if (!wmsL.isEmpty()) {
					MCQueryApiBuilder wms_bldr = MCQueryApiBuilder.create(t);
					wms_bldr.addSelect(m.not_send_upd_flg, m.not_dup_imp_flg, m.if_upd_typ, m.dlv_slip_split_flg, m.null_val_if_flg);
					wms_bldr.addLeftOuterJoin(m, m.ext_sys_cd.eq(t.ext_sys_cd));
					wms_bldr.setWhere(t.if_proc_typ.eq(bind("if_proc_typ")));
					wms_bldr.addWhereWithAnd(bind("master_dt").between(t.st_dt, t.end_dt));
					wms_bldr.addWhereWithAnd(t.loc_cd.eq(bind("loc_cd")) .or(t.loc_cd.isNull()));
					wms_bldr.addWhereWithAnd(t.lg_grp_cd.eq(bind("lg_grp_cd")) .or(t.lg_grp_cd.isNull()));
					wms_bldr.addWhereWithAnd(t.dlv_cd.eq(bind("dlv_cd")) .or(t.dlv_cd.isNull()));
					wms_bldr.addWhereWithAnd(t.gr_loc_cd.eq(bind("gr_loc_cd")) .or(t.gr_loc_cd.isNull()));
					wms_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
					dbSelect(createSqlId(LOGIC_ID, t, "S01"), proto,
							wms_bldr,
							wmsL.groupBy(SCMLinkUtil_Srch01_CndR.$if_proc_typ,
									SCMLinkUtil_Srch01_CndR.$loc_cd,
									SCMLinkUtil_Srch01_CndR.$lg_grp_cd,
									SCMLinkUtil_Srch01_CndR.$dlv_cd,
									SCMLinkUtil_Srch01_CndR.$gr_loc_cd,
									SCMLinkUtil_Srch01_CndR.$master_dt));
					_dbc.merge(proto, t.getKeyColumn());
				}
				
				// LIMS関連に対応するマスタを取得
				if (!limsL.isEmpty()) {
					_dbc.merge(fetchLimsMaster(limsL, proto), t.getKeyColumn());
				}

				// MES関連に対応するマスタを取得
				if (!mesL.isEmpty()) {
					MCQueryApiBuilder mes_bldr = MCQueryApiBuilder.create(t);
					mes_bldr.addSelect(m.not_send_upd_flg, m.not_dup_imp_flg, m.if_upd_typ, m.dlv_slip_split_flg, m.null_val_if_flg);
					mes_bldr.addLeftOuterJoin(m, m.ext_sys_cd.eq(t.ext_sys_cd));
					mes_bldr.setWhere(t.if_proc_typ.eq(bind("if_proc_typ")));
					mes_bldr.addWhereWithAnd(bind("master_dt").between(t.st_dt, t.end_dt));
					mes_bldr.addWhereWithAnd(t.loc_cd.eq(bind("loc_cd")) .or(t.loc_cd.isNull()));
					mes_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")) .or(t.itm_cd.isNull()));
					mes_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")) .or(t.itm_sub1.isNull()));
					mes_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")) .or(t.itm_sub2.isNull()));
					mes_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")) .or(t.itm_sub3.isNull()));
					mes_bldr.addWhereWithAnd(t.oper_cd.eq(bind("oper_cd")) .or(t.oper_cd.isNull()));
					mes_bldr.addWhereWithAnd(t.wk_cost_cd.eq(bind("wk_cost_cd")) .or(t.wk_cost_cd.isNull()));
					mes_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
					dbSelect(createSqlId(LOGIC_ID, t, "S02"), proto, mes_bldr,
							mesL.groupBy(SCMLinkUtil_Srch01_CndR.$if_proc_typ,
									SCMLinkUtil_Srch01_CndR.$loc_cd,
									SCMLinkUtil_Srch01_CndR.$itm_cd,
									SCMLinkUtil_Srch01_CndR.$itm_sub1,
									SCMLinkUtil_Srch01_CndR.$itm_sub2,
									SCMLinkUtil_Srch01_CndR.$itm_sub3,
									SCMLinkUtil_Srch01_CndR.$oper_cd,
									SCMLinkUtil_Srch01_CndR.$wk_cost_cd,
									SCMLinkUtil_Srch01_CndR.$master_dt));
					_dbc.merge(proto, t.getKeyColumn());
				}

				_idx = _dbc.createIndex(
					MAM_SCM_IF_CTL_R.$if_proc_typ,
					MAM_SCM_IF_CTL_R.$loc_cd,
					MAM_SCM_IF_CTL_R.$lg_grp_cd,
					MAM_SCM_IF_CTL_R.$itm_cd,
					MAM_SCM_IF_CTL_R.$itm_sub1,
					MAM_SCM_IF_CTL_R.$itm_sub2,
					MAM_SCM_IF_CTL_R.$itm_sub3,
					MAM_SCM_IF_CTL_R.$oper_cd,
					MAM_SCM_IF_CTL_R.$wk_cost_cd,
					MAM_SCM_IF_CTL_R.$dlv_cd,
					MAM_SCM_IF_CTL_R.$gr_loc_cd
				);
			}
			
			/**
			 * 優先順位に従い、SCM IF制御マスタから対応するレコードを取得する
			 */
			protected MAM_SCM_IF_CTL_R get(SCMLinkUtil_Srch01_CndR r) {

				// 比較するキーのリスト
				List<Set<String>> arrKeys = getKeys(r);

				// 優先順に従ってSCM IF制御マスタからマッチするレコードを取得する
				 for (Set<String> keys : arrKeys) {
				 	boolean isNull = false;
					for (String s : keys) {
						if (isNull(r.getValue(s))) {
							// 比較するキーに値が設定されていない場合は対象外
							isNull = true;
							break;
						}
					}
					if (!isNull) {
						Comparable<?>[] vals = toArray(r, keys);
						MAM_SCM_IF_CTL_R ctlR = _dbc.getFirst(_idx, vals);
						if (ctlR != null) {
							return ctlR;
						}
					}
				}
				return null;
			}

			/**
			 * 比較するキーに対応する値を取得する
			 */
			protected Comparable<?>[] toArray(SCMLinkUtil_Srch01_CndR r, Set<String> keys) {
				int len = _idx.getKeys().length;
				Comparable<?>[] vals = new Comparable<?>[len];
				for (int i=0; i<len; i++) {
					// SCM IF制御マスタと比較するキーに含まれていなければnullを設定し比較の対象外とする
					String col = _idx.getKeys()[i];
					if (keys.contains(col)) {
						vals[i] = r.getValue(col);
					}
					else {
						vals[i] = null;
					}
				}
				return vals;
			}

			/**
			 * SCM IF制御マスタを特定するキーを優先順をつけて取得する
			 */
			protected  List<Set<String>> getKeys(SCMLinkUtil_Srch01_CndR r) {
				// リストに追加した順＝優先順位が高い
				List<Set<String>> arr = new ArrayList<>();
				// WMS関連のインタフェースの優先順の設定
				if (isWms(r.if_proc_typ())) {
					if (MAC_IF_PROC_TYP.isWMS_SHIP_INST_SEND(r.if_proc_typ()) ) {
						arr.add(crtKey(
							MAM_SCM_IF_CTL_R.$if_proc_typ,
							MAM_SCM_IF_CTL_R.$loc_cd,
							MAM_SCM_IF_CTL_R.$dlv_cd));

						arr.add(crtKey(
							MAM_SCM_IF_CTL_R.$if_proc_typ,
							MAM_SCM_IF_CTL_R.$loc_cd,
							MAM_SCM_IF_CTL_R.$gr_loc_cd));

						arr.add(crtKey(
							MAM_SCM_IF_CTL_R.$if_proc_typ,
							MAM_SCM_IF_CTL_R.$loc_cd));

						arr.add(crtKey(
							MAM_SCM_IF_CTL_R.$if_proc_typ,
							MAM_SCM_IF_CTL_R.$lg_grp_cd,
							MAM_SCM_IF_CTL_R.$dlv_cd));

						arr.add(crtKey(
							MAM_SCM_IF_CTL_R.$if_proc_typ,
							MAM_SCM_IF_CTL_R.$lg_grp_cd,
							MAM_SCM_IF_CTL_R.$gr_loc_cd));

						arr.add(crtKey(
							MAM_SCM_IF_CTL_R.$if_proc_typ,
							MAM_SCM_IF_CTL_R.$lg_grp_cd));
					}
					else {
						arr.add(crtKey(
							MAM_SCM_IF_CTL_R.$if_proc_typ,
							MAM_SCM_IF_CTL_R.$loc_cd));

						arr.add(crtKey(
							MAM_SCM_IF_CTL_R.$if_proc_typ,
							MAM_SCM_IF_CTL_R.$lg_grp_cd));
					}
				}
				// LIMS関連のインタフェースの優先順の設定
				else if (isLims(r.if_proc_typ())) {
					setLimsPriorityKey(arr);
				}
				// MES関連のインタフェースの優先順の設定
				else {
					// 場所＋品目＋工程の組み合わせは不要（マスタ画面から設定できないので）
					// また、場所なし＋品目、場所なし＋工程も同様
					if (MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(r.if_proc_typ())
							|| MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(r.if_proc_typ())) {
						arr.add(crtKey(
								MAM_SCM_IF_CTL_R.$if_proc_typ,
								MAM_SCM_IF_CTL_R.$loc_cd,
								MAM_SCM_IF_CTL_R.$oper_cd,
								MAM_SCM_IF_CTL_R.$wk_cost_cd));
						
						arr.add(crtKey(
								MAM_SCM_IF_CTL_R.$if_proc_typ,
								MAM_SCM_IF_CTL_R.$loc_cd,
								MAM_SCM_IF_CTL_R.$wk_cost_cd));
						
						arr.add(crtKey(
								MAM_SCM_IF_CTL_R.$if_proc_typ,
								MAM_SCM_IF_CTL_R.$loc_cd,
								MAM_SCM_IF_CTL_R.$oper_cd));
						
						arr.add(crtKey(
								MAM_SCM_IF_CTL_R.$if_proc_typ,
								MAM_SCM_IF_CTL_R.$loc_cd));
						
						arr.add(crtKey(
							MAM_SCM_IF_CTL_R.$if_proc_typ));
						
					}
					else {
						arr.add(crtKey(
								MAM_SCM_IF_CTL_R.$if_proc_typ,
								MAM_SCM_IF_CTL_R.$loc_cd,
								MAM_SCM_IF_CTL_R.$itm_cd,
								MAM_SCM_IF_CTL_R.$itm_sub1,
								MAM_SCM_IF_CTL_R.$itm_sub2,
								MAM_SCM_IF_CTL_R.$itm_sub3));
						
						arr.add(crtKey(
							MAM_SCM_IF_CTL_R.$if_proc_typ,
							MAM_SCM_IF_CTL_R.$loc_cd,
							MAM_SCM_IF_CTL_R.$oper_cd));
						
						arr.add(crtKey(
							MAM_SCM_IF_CTL_R.$if_proc_typ,
							MAM_SCM_IF_CTL_R.$loc_cd));
					}
				}
				return arr;
			}
			
			protected MCList<MAM_SCM_IF_CTL_R> fetchLimsMaster(MCList<SCMLinkUtil_Srch01_CndR> limsL, MCList<MAM_SCM_IF_CTL_R> proto) {
				MAM_SCM_IF_CTL_R scmIfCtlR = MAM_SCM_IF_CTL_R.create("SCMIFCTL");
				MAM_EXT_SYS_R extSysR = MAM_EXT_SYS_R.create("EXTSYS");
				
				MCQueryApiBuilder lims_bldr = MCQueryApiBuilder.create(scmIfCtlR);
				lims_bldr.addSelect(extSysR.not_send_upd_flg, extSysR.not_dup_imp_flg, extSysR.if_upd_typ, extSysR.dlv_slip_split_flg, extSysR.null_val_if_flg);
				lims_bldr.addLeftOuterJoin(extSysR, extSysR.ext_sys_cd.eq(scmIfCtlR.ext_sys_cd));
				lims_bldr.setWhere(scmIfCtlR.if_proc_typ.eq(bind("if_proc_typ")));
				lims_bldr.addWhereWithAnd(bind("master_dt").between(scmIfCtlR.st_dt, scmIfCtlR.end_dt));
				lims_bldr.addWhereWithAnd(scmIfCtlR.loc_cd.eq(bind("loc_cd")) .or(scmIfCtlR.loc_cd.isNull()));
				lims_bldr.addWhereWithAnd(scmIfCtlR.itm_cd.eq(bind("itm_cd")) .or(scmIfCtlR.itm_cd.isNull()));
				lims_bldr.addWhereWithAnd(scmIfCtlR.itm_sub1.eq(bind("itm_sub1")) .or(scmIfCtlR.itm_sub1.isNull()));
				lims_bldr.addWhereWithAnd(scmIfCtlR.itm_sub2.eq(bind("itm_sub2")) .or(scmIfCtlR.itm_sub2.isNull()));
				lims_bldr.addWhereWithAnd(scmIfCtlR.itm_sub3.eq(bind("itm_sub3")) .or(scmIfCtlR.itm_sub3.isNull()));
				lims_bldr.addWhereWithAnd(scmIfCtlR.del_flg.eq(value(false)));
				dbSelect(createSqlId(LOGIC_ID, scmIfCtlR, "S03"), proto,
						lims_bldr,
						limsL.groupBy(SCMLinkUtil_Srch01_CndR.$if_proc_typ,
								SCMLinkUtil_Srch01_CndR.$loc_cd,
								SCMLinkUtil_Srch01_CndR.$itm_cd,
								SCMLinkUtil_Srch01_CndR.$itm_sub1,
								SCMLinkUtil_Srch01_CndR.$itm_sub2,
								SCMLinkUtil_Srch01_CndR.$itm_sub3,
								SCMLinkUtil_Srch01_CndR.$master_dt));
				return proto;
			}
			
			/**
			 * LIMS関連のインタフェースの優先順を設定する
			 * リストに追加した順で優先順位が高い
			 */
			protected void setLimsPriorityKey(List<Set<String>> priorityKeyL) {
				priorityKeyL.add(crtKey(
						MAM_SCM_IF_CTL_R.$if_proc_typ,
						MAM_SCM_IF_CTL_R.$loc_cd,
						MAM_SCM_IF_CTL_R.$itm_cd,
						MAM_SCM_IF_CTL_R.$itm_sub1,
						MAM_SCM_IF_CTL_R.$itm_sub2,
						MAM_SCM_IF_CTL_R.$itm_sub3));

				priorityKeyL.add(crtKey(
					MAM_SCM_IF_CTL_R.$if_proc_typ,
					MAM_SCM_IF_CTL_R.$loc_cd));
			}
			
		}

		/**
		 * キーを生成する
		 */
		protected Set<String> crtKey(String... cols) {
			Set<String> keys = new LinkedHashSet<>();
			for (String col : cols) {
				keys.add(col);
			}
			return keys;
		}

		/**
		 * 場所マスタキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;
		protected void initLocL(MCList<SCMLinkUtil_Srch01_CndR> up) {
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			MCList<MAM_LOC_R> bind = MCList.create(MAM_LOC_R.class);
			up.forEach(r -> {
				if (!isNull(r.loc_cd())) {
					bind.add().loc_cd(r.loc_cd());
				}
			});
			_locCache = new FXUCL_MCDbcCache<>(builder, bind, MAM_LOC_R.$loc_cd);
		}
	}

	/**
	 * SCMLinkUtil_Srch02オペレーション.<p>
	 *
	 * 製造指図送信（工程指図送信、出来高予定送信、投入予定送信、工数予定送信）の送信対象を判断するフラグ（ＭＥＳフラグ）を取得する<br>
	 */
	public class SCMLinkUtil_Srch02 extends MSUCL_SCMLinkUtil_MC_A.SCMLinkUtil_Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callSrch01();
			setDown();
		}

		/**
		 * 外部システムCDを取得するSrch01を呼び出す
		 */
		protected void callSrch01() {
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();
			for (SCMLinkUtil_Srch02_CndR r : up0()) {
				// IF処理区分の分だけレコードを増やしてSrch01を呼びだす
				// ※peg_noが重複するが、Srch01内では使用していないので問題ない
				for (String ifProcTyp : getProdInstIf()) {
					SCMLinkUtil_Srch01_CndR upR = o.up0().add();
					upR.if_proc_typ(ifProcTyp);
					copy(upR, r, createMap_SCMLinkUtil_Srch01_CndR_SCMLinkUtil_Srch02_CndR());
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();

				// 増やしたIF処理区分に対するレコードに外部システムCDが取得できたレコードがあれば、送信対象と扱う
				MCIndexKey idx = o.down0().createIndex(SCMLinkUtil_Srch01_CndR.$peg_no);
				for (SCMLinkUtil_Srch02_CndR r : up0()) {
					MCList<SCMLinkUtil_Srch01_CndR> downL = o.down0().subList(idx, r.peg_no());
					for (SCMLinkUtil_Srch01_CndR downR : downL) {
						if (!isNull(downR.ext_sys_cd())) {
							r.mes_flg(true);
							break;
						}
					}
				}
			}
		}
		protected Map_SCMLinkUtil_Srch01_CndR_SCMLinkUtil_Srch02_CndR<SCMLinkUtil_Srch01_CndR,SCMLinkUtil_Srch02_CndR> createMap_SCMLinkUtil_Srch01_CndR_SCMLinkUtil_Srch02_CndR() {
			return new Map_SCMLinkUtil_Srch01_CndR_SCMLinkUtil_Srch02_CndR<SCMLinkUtil_Srch01_CndR, SCMLinkUtil_Srch02_CndR>();
		}
		public class Map_SCMLinkUtil_Srch01_CndR_SCMLinkUtil_Srch02_CndR<D extends SCMLinkUtil_Srch01_CndR, S extends SCMLinkUtil_Srch02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$peg_no, SCMLinkUtil_Srch02_CndR.$peg_no);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$loc_cd, SCMLinkUtil_Srch02_CndR.$loc_cd);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$itm_cd, SCMLinkUtil_Srch02_CndR.$itm_cd);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$itm_sub1, SCMLinkUtil_Srch02_CndR.$itm_sub1);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$itm_sub2, SCMLinkUtil_Srch02_CndR.$itm_sub2);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$itm_sub3, SCMLinkUtil_Srch02_CndR.$itm_sub3);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$oper_cd, SCMLinkUtil_Srch02_CndR.$oper_cd);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$wk_cost_cd, SCMLinkUtil_Srch02_CndR.$wk_cost_cd);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$master_dt, SCMLinkUtil_Srch02_CndR.$master_dt);
			}
		}

		/**
		 * 製造指図関連のIF処理区分を取得する
		 */
		protected String[] getProdInstIf() {
			return new String[] {
				MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.value(),
				MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value(),
				MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.value(),
				MAC_IF_PROC_TYP.MES_WK_SCHD_SEND.value()
			};
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * SCMLinkUtil_Srch03オペレーション.<p>
	 *
	 * 検査指図送信の送信対象を判断するフラグ（ＬＩＭＳフラグ）を取得する<br>
	 */
	public class SCMLinkUtil_Srch03 extends MSUCL_SCMLinkUtil_MC_A.SCMLinkUtil_Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callSrch01();
			setDown();
		}

		protected void callSrch01() {
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();
			for (SCMLinkUtil_Srch03_CndR r : up0()) {
				// ＩＦ処理区分の分だけレコードを増やしてSrch01を呼びだす
				// ※peg_noが重複するが、Srch01内では使用していないので問題ない
				for (String ifProcTyp : getInspInstIf()) {
					SCMLinkUtil_Srch01_CndR upR = o.up0().add();
					upR.if_proc_typ(ifProcTyp);
					copy(upR, r, createMap_SCMLinkUtil_Srch01_CndR_SCMLinkUtil_Srch03_CndR());
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();

				// 増やしたＩＦ処理区分に対するレコードに外部システムＣＤが取得できたレコードがあれば、送信対象と扱う
				MCIndexKey idx = o.down0().createIndex(SCMLinkUtil_Srch01_CndR.$peg_no);
				for (SCMLinkUtil_Srch03_CndR r : up0()) {
					MCList<SCMLinkUtil_Srch01_CndR> downL = o.down0().subList(idx, r.peg_no());
					for (SCMLinkUtil_Srch01_CndR downR : downL) {
						if (!isNull(downR.ext_sys_cd())) {
							r.lims_flg(true);
							break;
						}
					}
				}
			}
		}

		protected String[] getInspInstIf() {
			return new String[] {
				MAC_IF_PROC_TYP.MES_INSP_INST_SEND.value()
			};
		}

		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected Map_SCMLinkUtil_Srch01_CndR_SCMLinkUtil_Srch03_CndR<SCMLinkUtil_Srch01_CndR,SCMLinkUtil_Srch03_CndR> createMap_SCMLinkUtil_Srch01_CndR_SCMLinkUtil_Srch03_CndR() {
			return new Map_SCMLinkUtil_Srch01_CndR_SCMLinkUtil_Srch03_CndR<SCMLinkUtil_Srch01_CndR, SCMLinkUtil_Srch03_CndR>();
		}

		public class Map_SCMLinkUtil_Srch01_CndR_SCMLinkUtil_Srch03_CndR<D extends SCMLinkUtil_Srch01_CndR, S extends SCMLinkUtil_Srch03_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$peg_no, SCMLinkUtil_Srch03_CndR.$peg_no);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$loc_cd, SCMLinkUtil_Srch03_CndR.$loc_cd);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$itm_cd, SCMLinkUtil_Srch03_CndR.$itm_cd);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$itm_sub1, SCMLinkUtil_Srch03_CndR.$itm_sub1);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$itm_sub2, SCMLinkUtil_Srch03_CndR.$itm_sub2);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$itm_sub3, SCMLinkUtil_Srch03_CndR.$itm_sub3);
				addColumnPathMap(SCMLinkUtil_Srch01_CndR.$master_dt, SCMLinkUtil_Srch03_CndR.$master_dt);

			}
		}
	}

	//FMCB CUSTOM END
}