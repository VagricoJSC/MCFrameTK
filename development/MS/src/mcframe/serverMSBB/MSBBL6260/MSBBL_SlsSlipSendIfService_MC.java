package mcframe.serverMSBB.MSBBL6260;

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
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import mcframe.serverPFBZ.PFBZL9050.*;
import mcframe.serverPFUD.PFUDL0030.DtlR;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverMSBG.MSBGL5120.MSBGL_ArUtil;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import static mcframe.serverMSBB.MSBBL6260.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.cache.MCJoinerList;
import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import mcframe.serverCore.sys.MCSys;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Consumer;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsSlipSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsSlipSendIfService_MC extends MSBBL_SlsSlipSendIfService_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * SlsSlipSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の売上伝票をＩＦテーブルに書き込み、送信する<br>
	 */
	public class SlsSlipSendIf_Upd01 extends MSBBL_SlsSlipSendIfService_MC_A.SlsSlipSendIf_Upd01 {
		//_sendL 送信対象情報
		protected MCList<MBT_SLS_SLIP_SND_IF_R> _sendL, _sendIfCuL, _sendIfDL;

		/**
		 * 送信対象（送信単位にグループ化した後）
		 */
		protected List<MCList<MBT_SLS_SLIP_SND_IF_R>> _sendArr;

		/**
		 * 送信対象から上り電文を特定するキー
		 */
		protected MCIndexKey _upIdx;

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			initBatchLogger(dbTran());
			initProc();
			getSndInfo();
			if (isNull(_sendL)) return ;
			bfrMakeIFData();
			makeDataNo();
			makeIFData();
			aftrMakeIFData();
			insIFData();
			callESBSendCtrl();
		}

		/**
		 * 初期化処理
		 */
		protected void initProc() {
			_sendL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			_sendL.addNumberColumn(MAM_TAX_R.$tax_rate);
			_sendL.addBooleanColumn(MST_SLS_ACT_R.$aprv_flg);
			_sendL.addStringColumn(MST_SLS_ACT_R.$aprv_sts_typ);
			_sendL.addNumberColumn(MAVM_ITM_UNIT_R.$conv_base_qty);
			_sendL.addNumberColumn(MAVM_ITM_UNIT_R.$conv_qty);
			_sendL.addNumberColumn(MAM_UNIT_R.$dec_place);
			_sendL.addStringColumn(MAM_UNIT_R.$rnd_typ);
			_sendL.addNumberColumn("amt_dec_place");
			_sendL.addStringColumn("amt_rnd_typ");
			_sendL.addStringColumn("tax_rnd_typ");
			
			// 一時カラムも引き継ぎたいのでcloneする
			_sendIfCuL = _sendL.clone();
			_sendIfDL = _sendL.clone();
			
			_sendArr = new ArrayList<>();
			
			up0().forEach(r -> {
				if (isProv()) {
					r.act_no(r.prov_act_no());
					r.act_seq(r.prov_act_seq());
				}
				else {
					r.act_no(r.sls_act_no());
					r.act_seq(r.sls_act_seq());
				}
			});
			_upIdx = up0().createIndex(SlsSlipSendIf_Upd01_DtlR.$act_no, SlsSlipSendIf_Upd01_DtlR.$act_seq);
			
		}
		
		/**
		 * 送信対象が支給か判定する
		 */
		protected boolean isProv() {
			// 送信対象に売上と支給が混在することはないので、
			// 上り電文の支給実績NOの有無で判定する
			return 
				up0().size() > 0
				&& !isNullOrNullVal(up0().get(0).prov_act_no());
		}

		/**
		 * 送信対象の売上実績情報を取得
		 */
		protected void getSndInfo() {
			insWk();
			getSndIfL();
			getOldSndIfL();
			checkSndIf();
			delWk();
		}
		
		/**
		 * 送信対象を取得する
		 */
		protected void getSndIfL() {
			executeQuery(_sendL,
				isProv() ? MSBBL6260_MST_PROV_ACT_S01() : MSBBL6260_MST_SLS_ACT_S01());
		}

		/**
		 * 送信済みの売上伝票送信IFを取得する
		 */
		protected MCList<MBT_SLS_SLIP_SND_IF_R> _oldIfL;
		protected MCIndexKey _oldIfActIdx, _oldIfActDIdx, _oldIfDataIdx;
		protected void getOldSndIfL() {
			_oldIfL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			_oldIfL.addNumberColumn("old_trd_cur_amt");
			_oldIfL.addNumberColumn("old_trd_cur_tax_amt");
			_oldIfL.addNumberColumn("old_trd_cur_dscnt_amt");
			_oldIfL.addNumberColumn("old_base_cur_amt");
			_oldIfL.addNumberColumn("old_base_cur_tax_amt");
			_oldIfL.addNumberColumn("old_base_cur_dscnt_amt");
			_oldIfL.addNumberColumn(MAVM_ITM_UNIT_R.$conv_base_qty);
			_oldIfL.addNumberColumn(MAVM_ITM_UNIT_R.$conv_qty);
			_oldIfL.addNumberColumn(MAM_UNIT_R.$dec_place);
			_oldIfL.addStringColumn(MAM_UNIT_R.$rnd_typ);
			
			MBT_SLS_SLIP_SND_IF_R t1 = MBT_SLS_SLIP_SND_IF_R.create("T1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			if (isProv()) {
				MSW_PROV_ACT_KEY_R w1 = MSW_PROV_ACT_KEY_R.create("W1");
				MST_PROV_ACT_R t2 = MST_PROV_ACT_R.create("T2");
				bldr.addSelect(
					t2.trd_cur_amt.as("old_trd_cur_amt"),
					t2.trd_cur_tax_amt.as("old_trd_cur_tax_amt"),
					value((MCNumber)null).as("old_trd_cur_dscnt_amt"),
					t2.base_cur_amt.as("old_base_cur_amt"),
					t2.base_cur_tax_amt.as("old_base_cur_tax_amt"),
					value((MCNumber)null).as("old_base_cur_dscnt_amt"),
					t1.prov_act_no.as("act_no"),
					t1.prov_act_seq.as("act_seq"),
					t1.prov_act_no.as("act_d_no"),
					t1.prov_act_seq.as("act_d_seq"),
					t1.prsppl_cd.as("bp_cd")
				);
				bldr.addInnerJoin(w1, w1.prov_act_no.eq(t1.prov_act_no));
				bldr.addInnerJoin(t2, t2.prov_act_no.eq(t1.prov_act_no).and(t2.prov_act_seq.eq(t1.prov_act_seq)));
			}
			else {
				MSW_SLS_ACT_KEY_R w1 = MSW_SLS_ACT_KEY_R.create("W1");
				MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T2");
				bldr.addSelect(
					t2.trd_cur_amt.as("old_trd_cur_amt"),
					t2.trd_cur_tax_amt.as("old_trd_cur_tax_amt"),
					t2.trd_cur_dscnt_amt.as("old_trd_cur_dscnt_amt"),
					t2.base_cur_amt.as("old_base_cur_amt"),
					t2.base_cur_tax_amt.as("old_base_cur_tax_amt"),
					t2.base_cur_dscnt_amt.as("old_base_cur_dscnt_amt"),
					t1.sls_act_no.as("act_no"),
					t1.sls_act_seq.as("act_seq"),
					t1.sls_act_d_no.as("act_d_no"),
					t1.sls_act_d_seq.as("act_d_seq"),
					t1.cst_cd.as("bp_cd")
				);
				bldr.addInnerJoin(w1, w1.sls_act_no.eq(t1.sls_act_no));
				bldr.addInnerJoin(t2, t2.sls_act_d_no.eq(t1.sls_act_d_no).and(t2.sls_act_d_seq.eq(t1.sls_act_d_seq)));
			}
			bldr.setWhere(t1.ext_sys_cd.eq(bind("1")), getExtSysCd());
			bldr.setOrderByDesc(t1.data_lno);
			dbSelect("MSBBL6260_MBT_SLS_SLIP_SND_IF_S01", _oldIfL, bldr);
			
			MCJoinerList<MBT_SLS_SLIP_SND_IF_R> joinList = new MCJoinerList<>();
			joinList
				.add(MAM_ITM_R.class, r -> toCondition(
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(),r.itm_sub3()
				))
				.addSelect(m -> toArray(
						m.dec_place, m.rnd_typ
				))
				.addMap((r, m) -> {
					r.setNumberNE("dec_place", m.dec_place());
					r.setString("rnd_typ", m.rnd_typ());
				});
			joinList
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(),r.itm_sub3(), r.trd_unit_cd()
				))
				.addSelect(m -> toArray(
						m.conv_base_qty, m.conv_qty
				))
				.addMap((r, m) -> {
					r.setNumberNE("conv_base_qty", m.conv_base_qty());
					r.setNumberNE("conv_qty", m.conv_qty());
				});
			joinList.join(_oldIfL);
			
			_oldIfActIdx = _oldIfL.createIndex(MBT_SLS_SLIP_SND_IF_R.$act_no);
			_oldIfActDIdx = _oldIfL.createIndex(MBT_SLS_SLIP_SND_IF_R.$data_no, MBT_SLS_SLIP_SND_IF_R.$act_d_no);
			_oldIfDataIdx = _oldIfL.createIndex(MBT_SLS_SLIP_SND_IF_R.$data_no);
		}

		/**
		 * ワークテーブルに上り電文のNOを追加する
		 */
		protected void insWk() {
			delWk();
			MCDBContainer dbc = isProv() ? MST_PROV_ACT_R.create("T") : MST_SLS_ACT_R.create("T");
			dbWkInsert(createSqlId("MSBBL6220", dbc, "I01"), up0(), dbc);
		}

		/**
		 * ワークテーブルを削除する
		 */
		protected void delWk() {
			MCDBContainer dbc = isProv() ? MST_PROV_ACT_R.create("T") : MST_SLS_ACT_R.create("T");
			dbWkDelete(createSqlId("MSBBL6220", dbc, "D01"), dbc);
		}
		
		/**
		 * 送信対象かチェックする
		 */
		protected void checkSndIf() {
			MCList<MBT_SLS_SLIP_SND_IF_R> sendL = _sendL.shallowClone();
			_sendL.clear();
			
			for (MBT_SLS_SLIP_SND_IF_R r : sendL) {
				SlsSlipSendIf_Upd01_DtlR upR = up0().getFirst(_upIdx, r.act_no(), r.act_seq());
				if (!checkDataCrudTyp(upR.data_crud_typ(), r.slip_sts_typ())) {
					continue;
				}
				else if (!checkAprv(upR.data_crud_typ(), r)) {
					continue;
				}
				else if (!checkSndIf(upR.data_crud_typ(), r)) {
					continue;
				}
				
				// 送信対象
				_sendL.add(r);
			}
		}
		
		/**
		 * 上り電文のデータ更新区分と送信対象データの伝票状況区分があっているかチェックする
		 */
		protected boolean checkDataCrudTyp(String dataCrudTyp, String slipStsTyp) {
			return 
				(MAC_DATA_CRUD_TYP.isCRT(dataCrudTyp) || MAC_DATA_CRUD_TYP.isUPD(dataCrudTyp))
					&& MAC_SLIP_STS_TYP.isCRT(slipStsTyp)
				|| MAC_DATA_CRUD_TYP.isDEL(dataCrudTyp)
					&& MAC_SLIP_STS_TYP.isCAN(slipStsTyp);
		}
		
		/**
		 * 上り電文のデータ更新区分と送信履歴から送信対象とするとかチェックする
		 */
		protected boolean checkSndIf(String dataCrudTyp, MBT_SLS_SLIP_SND_IF_R ifR) {
			if (MAC_DATA_CRUD_TYP.isCRT(dataCrudTyp)) {
				return true;
			}
			
			MCList<MBT_SLS_SLIP_SND_IF_R> oldIfL = _oldIfL.subList(_oldIfActIdx, ifR.act_no());
			if (oldIfL.isEmpty()) {
				// 送信履歴なしは送らず、売上の訂正、取消も認めない
				if (isProv()) {
					throw new MCAppException(MSBBL0508, ifR.act_no());
				}
				else {
					throw new MCAppException(MSBBL0507, ifR.act_no(), ifR.iv_no());
				}
			}
			
			return true;
		}

		/**
		 * 承認対象および承認状況による送信対象かチェックする
		 */
		protected boolean checkAprv(String dataCrudTyp, MBT_SLS_SLIP_SND_IF_R ifR) {
			if (isProv()
				|| !ifR.getBoolean(MST_SLS_ACT_R.$aprv_flg)
				|| MAC_APRV_STS_TYP.isACPT(ifR.getStringNE(MST_SLS_ACT_R.$aprv_sts_typ))) {
				return true;
			}
			return false;
		}
		
		/**
		 * 分割後の並び替えキーを取得する
		 */
		protected String[] getSortKey() {
			return new String[] {
				MBT_SLS_SLIP_SND_IF_R.$iv_no,
				MBT_SLS_SLIP_SND_IF_R.$act_no,
				MBT_SLS_SLIP_SND_IF_R.$act_seq
			};
		}

		/**
		 * 送信対象を分割する
		 */
		protected List<MCList<MBT_SLS_SLIP_SND_IF_R>> groupList() {
			_sendArr = new ArrayList<>();
			for (MCList<MBT_SLS_SLIP_SND_IF_R> ivGrpL: _sendL.groupList(MBT_SLS_SLIP_SND_IF_R.$iv_no)) {
				List<String> cols = new ArrayList<>();
				if (!isNullOrNullVal(ivGrpL.get(0).iv_no())) {
					cols.add(MBT_SLS_SLIP_SND_IF_R.$trd_cd);
					cols.add(MBT_SLS_SLIP_SND_IF_R.$usr_cd);
					if (MAC_TAX_CALC_TYP.isSLIP(ivGrpL.get(0).tax_calc_typ())) {
						cols.add(MBT_SLS_SLIP_SND_IF_R.$tax_cd);
					}
					cols.add(MBT_SLS_SLIP_SND_IF_R.$bill_dpt_cd);
					cols.add(MBT_SLS_SLIP_SND_IF_R.$ar_sttl_cd);
					cols.add(MBT_SLS_SLIP_SND_IF_R.$rcv_schd_dt);
					cols.add(MBT_SLS_SLIP_SND_IF_R.$ext_sys_cd);
				}
				else {
					// 売上実績、支給実績内で、請求部門、担当者、入金予定日が異なることはないので条件に含めない
					// 税計算区分が「2：伝票単位」の場合、実績ヘッダも分割されているので条件に含める必要なし
					cols.add(MBT_SLS_SLIP_SND_IF_R.$act_no);
					cols.add(MBT_SLS_SLIP_SND_IF_R.$act_seq);
					cols.add(MBT_SLS_SLIP_SND_IF_R.$ext_sys_cd);
				}
				for (MCList<MBT_SLS_SLIP_SND_IF_R> l : ivGrpL.groupList(cols.toArray(new String[0]))) {
					_sendArr.add(l);
				}
			}
			
			_sendArr.sort(
				new Comparator<MCList<MBT_SLS_SLIP_SND_IF_R>>() {
					public int compare(MCList<MBT_SLS_SLIP_SND_IF_R> o1, MCList<MBT_SLS_SLIP_SND_IF_R> o2) {
						int cmp = 0;
						for (String s : getSortKey()) {
							cmp = compare(o1.get(0).getValueNE(s), o2.get(0).getValueNE(s));
							if (cmp != 0) {
								break;
							}
						}
						return cmp;
					}
					public int compare(Comparable s1, Comparable s2) {
						int cmp = 0;
						if (!isNull(s1)) {
							cmp = s1.compareTo(s2);
						}
						else 	if (!isNull(s2)) {
							cmp = 1;
						}
						return cmp;
					}
				});
			return _sendArr;
		}
		
		/**
		 * 重複する計上年月を除いたリストを取得する
		 */
		protected MCList<MBT_SLS_SLIP_SND_IF_R> distinctAcYm(MCList<MBT_SLS_SLIP_SND_IF_R> ifL) {
			MCList<MBT_SLS_SLIP_SND_IF_R> retL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			if (!isNull(ifL)) {
				MCList<MBT_SLS_SLIP_SND_IF_R> tgtL = ifL.shallowClone();
				tgtL.sort(SortType.DESC, MBT_SLS_SLIP_SND_IF_R.$data_no);
				
				MBT_SLS_SLIP_SND_IF_R crrnt = tgtL.get(0);
				retL.add(crrnt);
				for (MBT_SLS_SLIP_SND_IF_R oldIfR : tgtL) {
					if (oldIfR.ac_ym().ltDate(crrnt.ac_ym())) {
						retL.add(oldIfR);
						crrnt = oldIfR;
					}
					else if (oldIfR.ac_ym().gtDate(crrnt.ac_ym())) {
						// データNOの降順に並べてみて計上年月が逆転している場合、それ以降遡ってチェックしない
						break;
					}
				}
			}
			return retL;
		}

		/**
		* データＮＯ発番（キャッシュ）
		*/
		protected void makeDataNo() {
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, _sendArr.size());
			doSeqCache(MAC_NUM_SYS_TYP.SLS_SLIP, _sendArr.size());
			doSeqCache(MAC_NUM_SYS_TYP.SLS_SLIP_SND_IF_DATA_LNO, _sendL.size());
		}

		protected String getExtSysCd() {
			// ここに到達した時点で有効な外部システムCDであることは担保されている
			return getSysParm("GA_SLS_SLIP_EXT_SYS_CD");
		}
		/**
		 * ＩＦデータ作成
		 */
		protected void makeIFData() {
			for (MCList<MBT_SLS_SLIP_SND_IF_R> grpL: _sendArr) {
				MCList<MBT_SLS_SLIP_SND_IF_R> retL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
				
				for (MCList<MBT_SLS_SLIP_SND_IF_R> ifL : grpL.groupList(
						MBT_SLS_SLIP_SND_IF_R.$act_no, MBT_SLS_SLIP_SND_IF_R.$act_seq)) {
					
					MCList<MBT_SLS_SLIP_SND_IF_R> oldIfL = _oldIfL.subList(_oldIfActIdx, ifL.get(0).act_no());
					oldIfL.sort(SortType.DESC, MBT_SLS_SLIP_SND_IF_R.$data_no);
					retL.addAll(makeIFData(ifL, oldIfL));
				}
				
				MCNumber d1 = null, d2 = null;
				String s1  = null;
				for (MBT_SLS_SLIP_SND_IF_R r : retL) {
					// 通常分
					if (isNull(r.data_no())) {
						if (isNull(d1)) {
							d1 = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
						}
						r.data_no(d1);
					}
					// 締後訂正の後に締解除された場合の削除分
					else if (r.data_no().isNegative()) {
						if (isNull(d2)) {
							d2 = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
						}
						r.data_no(d2);
					}
					if (isNull(r.sls_slip_no())) {
						// sls_slip_noがnullでないIFレコードは前回分の売上伝票NOを引き継ぐ
						if (isNull(s1)) {
							s1 = getStrSeq(MAC_NUM_SYS_TYP.SLS_SLIP);
						}
						r.sls_slip_no(s1);
					}
				}
			}
		}
		protected MCList<MBT_SLS_SLIP_SND_IF_R> makeIFData(
			MCList<MBT_SLS_SLIP_SND_IF_R> ifL, MCList<MBT_SLS_SLIP_SND_IF_R> oldIfL) {
			
			MCList<MBT_SLS_SLIP_SND_IF_R> retL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			MCList<MBT_SLS_SLIP_SND_IF_R> adjustL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			MCList<MBT_SLS_SLIP_SND_IF_R> delL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			MBT_SLS_SLIP_SND_IF_R bkR = null;
			MBT_SLS_SLIP_SND_IF_R ifR = ifL.get(0);
			boolean isClosed = false;
			Function<MCNumber, Boolean> existSndToErr = dataNo -> {
				for (MBT_SLS_SLIP_SND_IF_R r : _oldIfL.subList(_oldIfDataIdx, dataNo)) {
					if (r.snd_to_err_flg()) {
						return true;
					}
				}
				return false;
			};
			for (MBT_SLS_SLIP_SND_IF_R oldIfR : distinctAcYm(oldIfL)) {
				if (isClosed(oldIfR.ac_dt())) {
					if (existSndToErr.apply(oldIfR.data_no())) {
						MCMessagePool.add(
							MSBBL0501,
							oldIfR.data_no(), oldIfR.sls_slip_no(),
							isNull(oldIfR.iv_no()) ? null : oldIfR.iv_no(),
							isNull(oldIfR.iv_no()) ? oldIfR.sls_act_no() : null,
							oldIfR.prov_act_no()
						);
					}
					// 締後訂正の場合は差分を送る
					adjustL.addAll(makeIFDataAdjust(ifL, oldIfR));
					String slsSlipNo =
						isNull(bkR) || !isSame(ifR.ac_ym(), bkR.ac_ym()) ? null : bkR.sls_slip_no();
					retL.addAll(makeIFData(adjustL, slsSlipNo, MAC_DATA_CRUD_TYP.UPD.value()));
					
					isClosed = true;
					break;
				}
				else if (oldIfR.sls_adj_flg() && !MAC_DATA_CRUD_TYP.isDEL(oldIfR.data_crud_typ())) {
					// 締後訂正の後に締解除された時は送ったデータを削除する
					delL.addAll(
						_oldIfL
							.subList(_oldIfDataIdx, oldIfR.data_no())
							.subList(r -> isSame(r.sls_act_no(), oldIfR.sls_act_no()))
					);
				}
				bkR = oldIfR;
			}
			
			if (isNull(adjustL)) {
				if (!isNull(delL)) {
					delL =  makeIFData(delL, delL.get(0).sls_slip_no(), MAC_DATA_CRUD_TYP.DEL.value());
					delL.forEach(r -> r.data_no(-1));	// data_noを分ける
					retL.addAll(delL);
				}
				if (!isClosed) {
					// 最新を送る（差分を送ってない時）
					// 伝票NOはbkRがあったらその値を引き継ぐ
					String slsSlipNo = isNull(bkR) ? null : bkR.sls_slip_no();
					SlsSlipSendIf_Upd01_DtlR upR = up0().getFirst(_upIdx, ifR.act_no(), ifR.act_seq());
					retL.addAll(makeIFData(ifL, slsSlipNo, upR.data_crud_typ()));
				}
			}
			
			return retL;
		}
		
		protected MCList<MBT_SLS_SLIP_SND_IF_R> makeIFData(
			MCList<MBT_SLS_SLIP_SND_IF_R> ifL, String slsSlipNo, String crudTyp) {
			ifL.sort(MBT_SLS_SLIP_SND_IF_R.$act_d_no);
			
			MCList<MBT_SLS_SLIP_SND_IF_R> retL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			for (MBT_SLS_SLIP_SND_IF_R r : ifL) {
				r.ext_sys_cd(getExtSysCd());
				r.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				r.data_crud_typ(crudTyp);
				
				r.sls_slip_no(slsSlipNo);
				r.iv_no(nullValToNull(r.iv_no()));
				r.base_cur_cd(getBaseCur().cur_cd());
				
				r.data_lno(getSequence(MAC_NUM_SYS_TYP.SLS_SLIP_SND_IF_DATA_LNO.value()));
				// 売上伝票行NOは後処理で設定する
				
				// 明細値引（元明細の金額、税額の再計算を含む）
				MBT_SLS_SLIP_SND_IF_R dscntR = makeIFDataDscnt(r);
				MBT_SLS_SLIP_SND_IF_R diffAmtR = makeIFDataAmtDiff(r);
				
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					_sendIfDL.add(r);
					_sendIfDL.add(dscntR);
					_sendIfDL.add(diffAmtR);
				}
				else {
					_sendIfCuL.add(r);
					_sendIfCuL.add(dscntR);
					_sendIfCuL.add(diffAmtR);
				}
				retL.add(r);
				retL.add(dscntR);
				retL.add(diffAmtR);
			}
			
			return retL;
		}

		
		/**
		 * ＩＦデータ作成（端数調整データ作成）<BR>
		 * 以下の式を満たさないデータはGA側でエラーになる。それを回避するため、右辺と左辺の差額分を別レコードとして作成する。<BR>
		 * makeIFDataDscntを実行して値引額を除外した後に、本メソッドを実行する前提。<BR>
		 * 内税：数量×単価＝金額＋税<BR>
		 * 外税：数量×単価＝金額
		 */
		protected MBT_SLS_SLIP_SND_IF_R makeIFDataAmtDiff(MBT_SLS_SLIP_SND_IF_R r) {
			
			if (r.sls_adj_flg()) {
				return null;
			}
			
			MBT_SLS_SLIP_SND_IF_R diffIfR;
			if (r.inc_tax_flg()) {
				diffIfR = makeIFDataAmtDiffIncTax(r);
			}
			else {
				diffIfR = makeIFDataAmtDiffExcTax(r);
			}
			return diffIfR;
		}

		protected MBT_SLS_SLIP_SND_IF_R makeIFDataAmtDiffExcTax(MBT_SLS_SLIP_SND_IF_R r) {
			
			MCRow tcurAmtR = getTcurAmt(r);
			MCNumber tcurAmt = tcurAmtR.getNumber("amt");
			MCNumber tcurDiffAmt = r.trd_cur_amt().subtract(tcurAmt);
			if (tcurDiffAmt.isZero()) {
				return null;
			}

			MCNumber tcurTaxAmt = tcurAmtR.getNumber("tax_amt");
			MCNumber tcurDiffTaxAmt = r.trd_cur_tax_amt().subtract(tcurTaxAmt);

			MCRow bcurAmtR = getBcurAmt(r);
			MCNumber bcurAmt = bcurAmtR.getNumber("amt");
			MCNumber bcurDiffAmt = r.base_cur_amt().subtract(bcurAmt);
			MCNumber bcurTaxAmt = bcurAmtR.getNumber("tax_amt");
			MCNumber bcurDiffTaxAmt = r.base_cur_tax_amt().subtract(bcurTaxAmt);

			MBT_SLS_SLIP_SND_IF_R diffAmtR = makeIFDataAmtDiff(r, tcurDiffAmt, tcurDiffTaxAmt, bcurDiffAmt, bcurDiffTaxAmt);
			return diffAmtR;
		}

		protected MBT_SLS_SLIP_SND_IF_R makeIFDataAmtDiffIncTax(MBT_SLS_SLIP_SND_IF_R r) {

			MCRow tcurAmtR = getTcurAmt(r);
			MCNumber tcurAmt = tcurAmtR.getNumber("inc_tax_amt");
			MCNumber tcurDiffAmt = r.trd_cur_amt().add(r.trd_cur_tax_amt()).subtract(tcurAmt);
			if (tcurDiffAmt.isZero()) {
				return null;
			}

			MCNumber tcurTaxAmt = tcurAmtR.getNumber("tax_amt");
			MCNumber tcurDiffTaxAmt = r.trd_cur_tax_amt().subtract(tcurTaxAmt);

			MCRow bcurAmtR = getBcurAmt(r);
			MCNumber bcurAmt = bcurAmtR.getNumber("inc_tax_amt");
			MCNumber bcurDiffAmt = r.base_cur_amt().add(r.base_cur_tax_amt()).subtract(bcurAmt);
			MCNumber bcurTaxAmt = bcurAmtR.getNumber("tax_amt");
			MCNumber bcurDiffTaxAmt = r.base_cur_tax_amt().subtract(bcurTaxAmt);

			MBT_SLS_SLIP_SND_IF_R diffAmtR = makeIFDataAmtDiff(r, tcurDiffAmt, tcurDiffTaxAmt, bcurDiffAmt, bcurDiffTaxAmt);
			return diffAmtR;
		}

		protected MBT_SLS_SLIP_SND_IF_R makeIFDataAmtDiff(MBT_SLS_SLIP_SND_IF_R r, MCNumber tcurDiffAmt,MCNumber tcurDiffTaxAmt,
				MCNumber bcurDiffAmt, MCNumber bcurDiffTaxAmt) {

			MBT_SLS_SLIP_SND_IF_R diffAmtR = r.clone();
			diffAmtR.data_lno(getSequence(MAC_NUM_SYS_TYP.SLS_SLIP_SND_IF_DATA_LNO.value()));
			diffAmtR.trd_unit_qty(1);
			if (isProv()) {
				diffAmtR.base_unit_qty(1);
				diffAmtR.trd_unit_cd(diffAmtR.base_unit_cd());
			}
			else {
				diffAmtR.base_unit_qty(convToBaseUnit(diffAmtR));
			}
			
			diffAmtR.trd_cur_upri(r.inc_tax_flg() ? tcurDiffAmt.add(tcurDiffTaxAmt) : tcurDiffAmt);
			diffAmtR.trd_cur_amt(tcurDiffAmt);
			diffAmtR.trd_cur_tax_amt(tcurDiffTaxAmt);

			diffAmtR.base_cur_upri(r.inc_tax_flg() ? bcurDiffAmt.add(bcurDiffTaxAmt) : bcurDiffAmt);
			diffAmtR.base_cur_amt(bcurDiffAmt);
			diffAmtR.base_cur_tax_amt(bcurDiffTaxAmt);

			r.trd_cur_amt(sum(r.trd_cur_amt(), tcurDiffAmt.negate()));
			r.trd_cur_tax_amt(sum(r.trd_cur_tax_amt(), tcurDiffTaxAmt.negate()));
			r.trd_cur_dscnt_amt(null);
			r.base_cur_amt(sum(r.base_cur_amt(), bcurDiffAmt.negate()));
			r.base_cur_tax_amt(sum(r.base_cur_tax_amt(), bcurDiffTaxAmt.negate()));
			r.base_cur_dscnt_amt(null);

			reverseAmtQtySign(diffAmtR);
			
			return diffAmtR;

		}
	
		/**
		 * 差額がマイナスの場合、マイナスの金額はGAで取り込みできないため、符号を反転。<BR>
		 * 数量の符号をマイナス、差額をプラスにする。
		 */
		protected void reverseAmtQtySign(MBT_SLS_SLIP_SND_IF_R diffAmtR) {
		
			if (diffAmtR.trd_cur_amt().isPositive()) {
				return;
			}

			diffAmtR.trd_unit_qty(diffAmtR.trd_unit_qty().negate());
			diffAmtR.base_unit_qty(diffAmtR.base_unit_qty().negate());
			
			diffAmtR.trd_cur_upri(diffAmtR.trd_cur_upri().negate());
			diffAmtR.base_cur_upri(diffAmtR.base_cur_upri().negate());
		}

		protected MCRow getTcurAmt(MBT_SLS_SLIP_SND_IF_R r) {
			return getAmt(r, r.trd_cur_upri(), r.getNumber("amt_dec_place"));
		}

		protected MCRow getBcurAmt(MBT_SLS_SLIP_SND_IF_R r) {
			return getAmt(r, r.base_cur_upri(), getBaseCur().amt_dec_place());
		}

		protected MCRow getAmt(MBT_SLS_SLIP_SND_IF_R r, MCNumber upri, MCNumber amtDecPlace) {
	
			MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(
					upri, 
					isProv() ? r.base_unit_qty() : r.trd_unit_qty(),
					r.getNumber(MAM_TAX_R.$tax_rate),
					r.inc_tax_flg(), 
					amtDecPlace, 
					r.getString("amt_rnd_typ"),
					r.getString("tax_rnd_typ"));

			return amtR;
		}

		/**
		 * ＩＦデータ作成（明細値引）
		 */
		protected MBT_SLS_SLIP_SND_IF_R makeIFDataDscnt(MBT_SLS_SLIP_SND_IF_R r) {

			if (isNull(r.sls_act_no())
				|| isNull(r.trd_cur_dscnt_amt())
				|| r.trd_cur_dscnt_amt().isZero()
				|| r.sls_adj_flg()) {
				return null;
			}

			// 値引額の分（別レコードで追加する）
			MBT_SLS_SLIP_SND_IF_R dscntR = r.clone();
			dscntR.data_lno(getSequence(MAC_NUM_SYS_TYP.SLS_SLIP_SND_IF_DATA_LNO.value()));
			dscntR.trd_unit_qty(1);
			dscntR.trd_cur_upri(0);
			dscntR.trd_cur_amt(0);
			dscntR.trd_cur_tax_amt(0);
			dscntR.base_unit_qty(convToBaseUnit(dscntR));
			dscntR.base_cur_upri(0);
			dscntR.base_cur_amt(0);
			dscntR.base_cur_tax_amt(0);
			dscntR.dtl_dscnt_flg(true);
			
			// 値引額を含める。税額はそのまま（値引後の金額に対する税額）
			r.trd_cur_amt(sum(r.trd_cur_amt(), r.trd_cur_dscnt_amt()));
			r.trd_cur_dscnt_amt(null);
			r.base_cur_amt(sum(r.base_cur_amt(), r.base_cur_dscnt_amt()));
			r.base_cur_dscnt_amt(null);
			
			return dscntR;
		}
		/**
		 * ＩＦデータ作成（締後訂正）
		 */
		protected MCList<MBT_SLS_SLIP_SND_IF_R> makeIFDataAdjust(
			MCList<MBT_SLS_SLIP_SND_IF_R> ifL, MBT_SLS_SLIP_SND_IF_R oldBaseIfR) {
			
			// 計算対象の項目
			List<String[]> calcCols = new ArrayList<>();
			calcCols.add(new String[]{MBT_SLS_SLIP_SND_IF_R.$trd_cur_amt, "old_trd_cur_amt"});
			calcCols.add(new String[]{MBT_SLS_SLIP_SND_IF_R.$trd_cur_tax_amt, "old_trd_cur_tax_amt"});
			calcCols.add(new String[]{MBT_SLS_SLIP_SND_IF_R.$trd_cur_dscnt_amt, "old_trd_cur_dscnt_amt"});
			calcCols.add(new String[]{MBT_SLS_SLIP_SND_IF_R.$base_cur_amt, "old_base_cur_amt"});
			calcCols.add(new String[]{MBT_SLS_SLIP_SND_IF_R.$base_cur_tax_amt, "old_base_cur_tax_amt"});
			calcCols.add(new String[]{MBT_SLS_SLIP_SND_IF_R.$base_cur_dscnt_amt, "old_base_cur_dscnt_amt"});
			
			MCList<MBT_SLS_SLIP_SND_IF_R> adjustL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			for (MBT_SLS_SLIP_SND_IF_R ifR : ifL) {
				MBT_SLS_SLIP_SND_IF_R oldIfR = null;
				
				// 過去の送信分を取得。明細値引が存在する場合は元明細に反映する
				MCList<MBT_SLS_SLIP_SND_IF_R> oldIfL = _oldIfL.subList(_oldIfActDIdx, oldBaseIfR.data_no(), ifR.act_d_no());
				if (!isNull(oldIfL)) {
					oldIfR = oldIfL.getFirst(MBT_SLS_SLIP_SND_IF_R.$dtl_dscnt_flg, false).clone();
					
					MBT_SLS_SLIP_SND_IF_R dscntR = oldIfL.getFirst(MBT_SLS_SLIP_SND_IF_R.$dtl_dscnt_flg, true);
					if (!isNull(dscntR)) {
						oldIfR.trd_cur_amt(oldIfR.trd_cur_amt().subtract(dscntR.trd_cur_dscnt_amt()));
						oldIfR.base_cur_amt(oldIfR.base_cur_amt().subtract(dscntR.base_cur_dscnt_amt()));
					}
				}
				
				if (isNull(oldIfR)) {
					// 締後に明細追加されたパタン（そのまま送信する）
					if (MAC_SLIP_STS_TYP.isCAN(ifR.slip_sts_typ())) {
						// ただし取消は除く
						continue;
					}
				}
				else if (MAC_SLIP_STS_TYP.isCAN(ifR.slip_sts_typ())) {
					// 取消は符号を反転して送信する
					for (String[] col : calcCols) {
						if (!isNull(oldIfR.getNumber(col[1]))) {
							ifR.setNumber(col[0], oldIfR.getNumber(col[1]).multiply(-1));
						}
					}
				}
				else if (isAdjustAmt(ifR, oldIfR)) {
					// 差額分を送信する
					for (String[] col : calcCols) {
						if (!isNull(ifR.getNumber(col[0])) || !isNull(oldIfR.getNumber(col[1]))) {
							ifR.setNumber(col[0],
								nvl(ifR.getNumber(col[0]), MCNumber.ZERO)
									.subtract(nvl(oldIfR.getNumber(col[1]), MCNumber.ZERO))
							);
						}
					}
				}
				else {
					// 何もしない
					continue;
				}
				adjustL.add(ifR);
			}
			
			for (MBT_SLS_SLIP_SND_IF_R oldIfR : _oldIfL.subList(_oldIfDataIdx, oldBaseIfR.data_no())) {
				if (oldIfR.dtl_dscnt_flg()
					|| !isSame(oldIfR.sls_act_no(), oldBaseIfR.sls_act_no())) {
					continue;
				}
				if (isNull(ifL.getFirst(MBT_SLS_SLIP_SND_IF_R.$sls_act_d_no, oldIfR.sls_act_d_no()))) {
					MBT_SLS_SLIP_SND_IF_R ifR = oldIfR.clone();
					// 行削除は符号を反転して送信する
					for (String[] col : calcCols) {
						if (!isNull(oldIfR.getNumber(col[1]))) {
							ifR.setNumber(col[0], oldIfR.getNumber(col[1]).multiply(-1));
						}
					}
					// 訂正後のヘッダ項目に揃えて送信する
					MBT_SLS_SLIP_SND_IF_R r = ifL.get(0);
					ifR.data_lno(null);
					ifR.data_no(null);
					ifR.ac_ym(r.ac_ym());
					ifR.ac_dt(r.ac_dt());
					ifR.ar_sttl_cd(r.ar_sttl_cd());
					ifR.rcv_schd_dt(r.rcv_schd_dt());
					adjustL.add(ifR);
				}
			}
			
			adjustL.forEach(ifR -> {
				// 数量は1 or -1
				ifR.trd_unit_qty(ifR.trd_cur_amt().isNegative() ? -1 : 1);
				
				// 有償支給の場合は単価が基準単位の単価になる。
				// そのため、単価×数量＝金額（内税の場合は＋税） となるように、JSONに設定する数量（qty_Minus）には基準単位数量を設定している。
				// 基準単位数量が「1」あるいは「-1」となるようにし、取引単位には基準単位を設定する。
				if (isProv()) {
					ifR.base_unit_qty(ifR.trd_unit_qty());
					ifR.trd_unit_cd(ifR.base_unit_cd());
				}
				else {
					ifR.base_unit_qty(convToBaseUnit(ifR));
				}
				// 単価は常にプラス
				if (ifR.inc_tax_flg()) {
					ifR.trd_cur_upri(sum(ifR.trd_cur_amt(), ifR.trd_cur_tax_amt()).abs());
					ifR.base_cur_upri(sum(ifR.base_cur_amt(), ifR.base_cur_tax_amt()).abs());
				}
				else {
					ifR.trd_cur_upri(ifR.trd_cur_amt().abs());
					ifR.base_cur_upri(ifR.base_cur_amt().abs());
				}
				ifR.trd_cur_dscnt_amt(null);
				ifR.base_cur_dscnt_amt(null);
				ifR.sls_adj_flg(true);
			});
			
			return adjustL;
		}
		
		/**
		 * 締後訂正で調整対象か判定する（金額が異なる）
		 */
		protected boolean isAdjustAmt(MBT_SLS_SLIP_SND_IF_R ifR, MBT_SLS_SLIP_SND_IF_R oldIfR) {
			// 基準通貨で金額、税額いずれかが直前と異なっているかで判断する
			// 為替レートが変わった場合を考慮して基準通貨で判断する
			return 
					!isSame(ifR.base_cur_amt(), oldIfR.base_cur_amt())
					|| !isSame(ifR.base_cur_tax_amt(), oldIfR.base_cur_tax_amt());
		}
		
		/**
		 * 基準単位数量に換算する
		 */
		protected MCNumber convToBaseUnit(MBT_SLS_SLIP_SND_IF_R ifR) {
			return
				MAUCL_MCDataUtil.convToBaseUnit(
					ifR.trd_unit_qty(), ifR.getNumberNE("conv_base_qty"), ifR.getNumberNE("conv_qty"),
					ifR.getNumberNE("dec_place"), ifR.getStringNE("rnd_typ"));
		}
		
		/**
		 * ＩＦデータ作成前処理
		 */
		protected void bfrMakeIFData() {
			for (MBT_SLS_SLIP_SND_IF_R r : _sendL) {
				SlsSlipSendIf_Upd01_DtlR upR = up0().getFirst(_upIdx, r.act_no(), r.act_seq());
				if (!MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					r.bill_dpt_cd(getBcstDpt(r));
				}
			}
			
			// 分割する条件に必要な決済方法ＣＤ、入金予定日を、インボイスＮＯもしくは売上実績ＮＯごとに取得・設定する
			Consumer<MCList<MBT_SLS_SLIP_SND_IF_R>> f = lst -> {
				// インボイスごとで請求部門区分「2：債権部門」の場合のみ、複数存在することがある
				for (MCList<MBT_SLS_SLIP_SND_IF_R> grpL: lst.groupList(MBT_SLS_SLIP_SND_IF_R.$bill_dpt_cd)) {
					// 請求先、請求部門、取引通貨ごとの金額で入金予定制御マスタを参照する
					MCNumber ttlAmt = MCNumber.ZERO;
					for (MBT_SLS_SLIP_SND_IF_R r : grpL) {
						ttlAmt = ttlAmt.add(
							nvl(r.trd_cur_amt(), MCNumber.ZERO)
								.add(nvl(r.trd_cur_tax_amt(), MCNumber.ZERO)));
					}
					for (MBT_SLS_SLIP_SND_IF_R r : grpL) {
						SlsSlipSendIf_Upd01_DtlR upR = up0().getFirst(_upIdx, r.act_no(), r.act_seq());
						
						if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
							MBT_SLS_SLIP_SND_IF_R oldIfR = _oldIfL.getFirst(_oldIfActIdx, r.act_no());
							r.bill_dpt_cd(oldIfR.bill_dpt_cd());
							r.ar_sttl_cd(oldIfR.ar_sttl_cd());
							r.rcv_schd_dt(oldIfR.rcv_schd_dt());
							r.dpt_cd(oldIfR.dpt_cd());
							r.usr_cd(oldIfR.usr_cd());
						}
						else {
							r.ar_sttl_cd(getArSttlCd(r, ttlAmt));
							r.rcv_schd_dt(getRcvSchdDt(r, ttlAmt));
						}
					}
				}
			};
			for (MCList<MBT_SLS_SLIP_SND_IF_R> ivGrpL: _sendL.groupList(MBT_SLS_SLIP_SND_IF_R.$iv_no)) {
				if (!isNullOrNullVal(ivGrpL.get(0).iv_no())) {
					f.accept(ivGrpL);
				}
				else {
					for (MCList<MBT_SLS_SLIP_SND_IF_R> grpL : ivGrpL.groupList(
							MBT_SLS_SLIP_SND_IF_R.$act_no, MBT_SLS_SLIP_SND_IF_R.$act_seq)) {
						f.accept(grpL);
					}
				}
			}
			
			// 伝票単位に分割
			groupList();
		}
		
		/**
		 * ＩＦデータ作成後処理
		 */
		protected void aftrMakeIFData() {
			_sendL.setAll(_sendIfDL);
			_sendL.addAll(_sendIfCuL);
			
			// 同じ売上伝票ＮＯがデータＮＯを跨いで存在する場合、売上伝票ＮＯを再発番する
			// 実績の訂正でヘッダ項目（部門、担当者、決済方法、入金予定日など）が変わった場合に伝票が分割されることがある
			for (MCList<MBT_SLS_SLIP_SND_IF_R> grpL : _sendL.groupList(MBT_SLS_SLIP_SND_IF_R.$sls_slip_no)) {
				MCList<MBT_SLS_SLIP_SND_IF_R>[] arr = grpL.groupList(MBT_SLS_SLIP_SND_IF_R.$data_no);
				if (arr.length > 1) {
					Arrays.sort(arr,
						new Comparator<MCList<MBT_SLS_SLIP_SND_IF_R>>() {
							public int compare(MCList<MBT_SLS_SLIP_SND_IF_R> o1, MCList<MBT_SLS_SLIP_SND_IF_R> o2) {
								return o1.get(0).data_no().compareTo(o2.get(0).data_no());
							}
						});
					
					for (int i=1; i<arr.length; i++) {
						String slsSlipNo = getStrSeq(MAC_NUM_SYS_TYP.SLS_SLIP);
						arr[i].forEach(r -> {
							r.sls_slip_no(slsSlipNo);
						});
					}
				}
			}
			
			// 売上伝票行ＮＯを設定
			for (MCList<MBT_SLS_SLIP_SND_IF_R> grpL : _sendL.groupList(MBT_SLS_SLIP_SND_IF_R.$sls_slip_no)) {
				grpL.sort(MBT_SLS_SLIP_SND_IF_R.$act_d_no);
				
				int lno = 0;
				for (MBT_SLS_SLIP_SND_IF_R r : grpL) {
					r.sls_slip_lno(++lno);
				}
			}
		}
		
		/**
		 * ＩＦデータを登録する
		 */
		protected void insIFData() {
			if (_sendL.isEmpty()) {
				return;
			}
			setLogKey();
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MBT_SLS_SLIP_SND_IF_R.create("T"));
			dbInsertEx("MSBBL6260_MBT_SLS_SLIP_SND_IF_I01", _sendL, bldr);
		}
		
		/**
		 * ログサブキーを設定する		
		 */
		protected void setLogKey() {
			getBatchLogger().setLogKey(
				_sendL,
				MBT_SLS_SLIP_SND_IF_R.$batch_log_no,
				MBT_SLS_SLIP_SND_IF_R.$log_sub_key1,
				MBT_SLS_SLIP_SND_IF_R.$log_sub_key2
			);
		}
		
		/**
		 * 送信制御処理呼び出し 
		 */
		protected void callESBSendCtrl() {
			// 送信制御処理は beforeCommit から呼び出す
			// GAに送信した後に例外が発生するとGAとデータの整合性が崩れてしまうので、
			// なるべく処理の終わりまで引きつけてから送信制御処理を呼ぶようにする
		}
		
		/**
		 * 引数の計上日が売上締めされているかチェックする
		 */
		protected Map<MCDate, Boolean> _acDtMap = new HashMap<>();
		protected boolean isClosed(MCDate acDt) {
			if (!_acDtMap.containsKey(acDt)) {
				MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();
				Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
				cndR.ac_dt(acDt);
				if (isProv()) {
					cndR.purc_cls_chk_flg(true);
				}
				else {
					cndR.sls_cls_chk_flg(true);
				}
				op.up0().add(cndR);
				op.up1().no_msg_flg(true);
				op.exec();
				
				_acDtMap.put(acDt, op.down0().get(0).err_flg());
			}
			return _acDtMap.get(acDt);
		}
		
		/**
		 * 請求部門を取得する
		 */
		protected String getBcstDpt(MBT_SLS_SLIP_SND_IF_R ifR) {
			return
				isProv() ? null : MSBGL_ArUtil.getBcstDpt(ifR.bcst_cd(),ifR.ac_dt(), ifR.dpt_cd(), ifR.ar_dpt_cd());
		}
		
		/**
		 * 決済方法を取得する
		 */
		protected static final String _STTL_SYS_PARM_KEY = "GA_PROV_AR_STTL_CD";
		protected String getArSttlCd(MBT_SLS_SLIP_SND_IF_R ifR, MCNumber ttlAmt) {
			if (isProv()) {
				String sttlCd = getSysParm(_STTL_SYS_PARM_KEY);
				if (isNull(sttlCd)) {
					throw new MCAppException(MSBBL0502, _STTL_SYS_PARM_KEY);
				}
				return sttlCd;
			}
			else {
				return getRcvCtrlR(ifR, ttlAmt).sttl_cd();
			}
		}
		
		/**
		 * 入金予定日を取得する
		 */
		protected MCDate getRcvSchdDt(MBT_SLS_SLIP_SND_IF_R ifR, MCNumber ttlAmt) {
			if (isProv()) {
				// 支給：支給実績の計上日
				return ifR.rcv_schd_dt();
			}
			else {
				// インボイス取引：売上実績ヘッダの入金予定日
				// それ以外：入金予定制御マスタから算出した日付
				if (!isNull(ifR.rcv_schd_dt())) {
					return ifR.rcv_schd_dt();
				}
				
				MCList<MST_RCV_SCHD_R> rcvSchdL =
					MSBGL_ArUtil.getRcvSchd(
						ifR.bcst_cd(),
						ifR.bill_dpt_cd(),
						ifR.trd_cur_cd(),
						ttlAmt,
						getRcvCtrlR(ifR, ttlAmt).getDateNE("baseDt")
					);
				return rcvSchdL.getFirst(MST_RCV_SCHD_R.$rcv_mtd_cd, ifR.ar_sttl_cd()).rcv_schd_dt();
			}
		}
		
		/**
		 * 入金予定制御マスタを取得する
		 */
		protected FXUCL_Cache<MAM_RCV_SCHD_CTL_R> _rcvSchdCtrlCache;
		protected MAM_RCV_SCHD_CTL_R getRcvCtrlR(MBT_SLS_SLIP_SND_IF_R ifR, MCNumber ttlAmt) {
			Function<MCDate, MAM_RCV_SCHD_CTL_R> f = baseDt -> {
				Comparable<?>[] key = new Comparable[]{
					ifR.bcst_cd(),
					ifR.bill_dpt_cd(),
					ifR.trd_cur_cd(),
					ttlAmt,
					baseDt
				};
				if (_rcvSchdCtrlCache == null) {
					_rcvSchdCtrlCache = new FXUCL_Cache<>();
					_rcvSchdCtrlCache.setFixMaxCacheSize(-1);
				}
				if (isNull(_rcvSchdCtrlCache.getCache(key))) {
					MCList<MAM_RCV_SCHD_CTL_R> rcvCtrlL =
						MSBGL_ArUtil.getRcvSchdCtl(
							ifR.bcst_cd(), ifR.bill_dpt_cd(),
							ifR.trd_cur_cd(), null, ttlAmt, baseDt);
					rcvCtrlL.sort(SortType.DESC, MAM_RCV_SCHD_CTL_R.$rate);
					
					// 入金予定制御マスタを取得した時の基準日を保持しておく
					// 取得したマスタは基準日ごとに管理したいので複製してキャッシュする（複製しないと設定した基準日が上書きされてしまうので）
					MAM_RCV_SCHD_CTL_R rcvCtrlR = rcvCtrlL.get(0).clone();
					rcvCtrlR.setDateNE("baseDt", baseDt);
					
					_rcvSchdCtrlCache.putCache(key, rcvCtrlR);
				}
				return _rcvSchdCtrlCache.getCache(key);
			};
			
			// 計上日で入金予定制御マスタを取得する
			MAM_RCV_SCHD_CTL_R byAcDt = f.apply(ifR.ac_dt());
			
			MAM_BP_R bcstR = getBp(ifR.bcst_cd());
			if (MAC_BILL_CL_TYP.isBATCH(bcstR.bill_cl_typ())
				|| MAC_BILL_CL_TYP.isMANUAL(bcstR.bill_cl_typ())) {
				
				// 請求締日で入金予定制御マスタを取得する（請求締日は計上日を基準日とする）
				MAM_RCV_SCHD_CTL_R byClDt = f.apply(
					MSBGL_ArUtil.getBillSchdDt(
							ifR.bcst_cd(),
							ifR.ac_dt(),
							MCNumber.ZERO,
							bcstR)
				);
				
				if (MAC_CRRYOVR_MONS_TYP.isMM(byAcDt.crryovr_mons_typ())
					&& MAC_CRRYOVR_MONS_TYP.isMM(byClDt.crryovr_mons_typ())) {
					// サイト区分「月」の場合、基準日＝請求締日
					return byClDt;
				}
				else if (MAC_CRRYOVR_MONS_TYP.isDD(byAcDt.crryovr_mons_typ())
						&& MAC_CRRYOVR_MONS_TYP.isDD(byClDt.crryovr_mons_typ())) {
					// サイト区分「日」の場合、基準日＝計上日
					return byAcDt;
				}
				
				// サイト区分が混在している場合はエラーとする
				throw new MCAppException(
					MSBBL0510, byAcDt.wg_cd(), byClDt.wg_cd(), ifR.bcst_cd(), ifR.trd_cur_cd(), ttlAmt);
			}
			else if (MAC_BILL_CL_TYP.isSEL(bcstR.bill_cl_typ())
						|| MAC_BILL_CL_TYP.isEACH_SLS(bcstR.bill_cl_typ()) && !ifR.iv_flg()) {
				
				if (MAC_CRRYOVR_MONS_TYP.isDD(byAcDt.crryovr_mons_typ())) {
					// サイト区分「日」の場合、基準日＝計上日
					return byAcDt;
				}
				
				// サイト区分が「月」の場合はエラーとする（計上日で計算する場合は「日」であること）
				throw new MCAppException(
					MSBBL0511, byAcDt.wg_cd(), ifR.bcst_cd(), ifR.trd_cur_cd(), ttlAmt);
			}
			
			return byAcDt;
		}
		
		/**
		 * 取引先マスタを取得する
		 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache;
		protected MAM_BP_R getBp(String bpCd) {
			if (_bpCache == null) {
				MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
				for (String col : new String[]{
						MBT_SLS_SLIP_SND_IF_R.$bp_cd, MBT_SLS_SLIP_SND_IF_R.$bcst_cd}) {
					_sendL.distinctNE(col).forEach(r -> bindL.add().bp_cd(r.getString(col)));
				}
				_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")), bindL, MAM_BP_R.$bp_cd
				);
			}
			return _bpCache.get(bpCd);
		}
	}

	/**
	 * SlsSlipSendIf_Upd02オペレーション.<p>
	 *
	 * 売上伝票を再送信する<br>
	 */
	public class SlsSlipSendIf_Upd02 extends MSBBL_SlsSlipSendIfService_MC_A.SlsSlipSendIf_Upd02 {
		protected MCList<MBT_SLS_SLIP_SND_IF_R> _sendL;

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			initBatchLogger(dbTran());
			getReSendInfo();
			if (isNull(_sendL)) return ;
			updIFData();
			makeDataNo();
			makeIFData();
			insIFData();
			callESBSendCtrl();
		}
		
		protected void getReSendInfo() {
			_sendL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			
			MBT_SLS_SLIP_SND_IF_R t = MBT_SLS_SLIP_SND_IF_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setWhere(t.data_no.eq(bind("data_no")));
			// 画面側でロック済み
			dbSelect("MSBBL6260_MBT_SLS_SLIP_SND_IF_S03", _sendL, bldr, up0());
		}
		
		/**
		 * ＩＦデータを更新する
		 */
		protected void updIFData() {
			// 更新カウンタを進めるため空更新する
			// _sendLの値を変更する前に行う
			MBT_SLS_SLIP_SND_IF_R t = MBT_SLS_SLIP_SND_IF_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(t.data_lno);
			dbUpdateKey("MSBBL6260_MBT_SLS_SLIP_SND_IF_U01", _sendL, bldr);
		}
		
		/**
		* データＮＯ発番（キャッシュ）
		*/
		protected void makeDataNo() {
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, _sendL.groupBy("data_no").size());
			doSeqCache(MAC_NUM_SYS_TYP.SLS_SLIP, _sendL.groupBy("data_no").size());
			doSeqCache(MAC_NUM_SYS_TYP.SLS_SLIP_SND_IF_DATA_LNO, _sendL.size());
		}
		
		/**
		 * ＩＦデータを作成する
		 */
		protected void makeIFData() {
			for (MCList<MBT_SLS_SLIP_SND_IF_R> grpL : _sendL.groupList(MBT_SLS_SLIP_SND_IF_R.$data_no)) {
				
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
			
				grpL.sort(MBT_SLS_SLIP_SND_IF_R.$data_lno);
				for (MBT_SLS_SLIP_SND_IF_R r : grpL) {
					r.data_lno(getSequence(MAC_NUM_SYS_TYP.SLS_SLIP_SND_IF_DATA_LNO.value()));
					r.data_no(dataNo);
					r.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
					
					r.re_snd_flg(true);
					r.not_snd_flg(false);
					r.snd_to_err_flg(false);
				}
			}
		}
		
		/**
		 * ＩＦデータを登録する
		 */
		protected void insIFData() {
			setLogKey();
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MBT_SLS_SLIP_SND_IF_R.create("T"));
			dbInsertEx("MSBBL6260_MBT_SLS_SLIP_SND_IF_I02", _sendL, bldr);
		}
		
		/**
		 * 送信制御処理呼び出し 
		 */
		protected void callESBSendCtrl() {
			// 送信制御処理は beforeCommit から呼び出す
			// GAに送信した後に例外が発生するとGAとデータの整合性が崩れてしまうので、
			// なるべく処理の終わりまで引きつけてから送信制御処理を呼ぶようにする
		}
		
		/**
		 * ログサブキーを設定する		
		 */
		protected void setLogKey() {
			getBatchLogger().setLogKey(
				_sendL,
				MBT_SLS_SLIP_SND_IF_R.$batch_log_no,
				MBT_SLS_SLIP_SND_IF_R.$log_sub_key1,
				MBT_SLS_SLIP_SND_IF_R.$log_sub_key2
			);
		}
	}
	
	/**
	 * SlsSlipSendIf_Upd03オペレーション.<p>
	 *
	 * 売上伝票を送信対象外にする<br>
	 */
	public class SlsSlipSendIf_Upd03 extends MSBBL_SlsSlipSendIfService_MC_A.SlsSlipSendIf_Upd03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			updIFData();
		}
		
		/**
		 * ＩＦデータを更新する
		 */
		protected void updIFData() {
			MBT_SLS_SLIP_SND_IF_R t = MBT_SLS_SLIP_SND_IF_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(t.not_snd_flg);
			bldr.setWhere(t.data_no.eq(bindEx("data_no")));
			dbUpdate("MSBBL6260_MBT_SLS_SLIP_SND_IF_U02", up0(), bldr);
		}
	}
	
	/**
	 * SlsSlipSendIf_Upd04オペレーション.<p>
	 *
	 * 売上伝票を送信する<br>
	 */
	public class SlsSlipSendIf_Upd04 extends MSBBL_SlsSlipSendIfService_MC_A.SlsSlipSendIf_Upd04 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callESBSendCtrl(getSendIfL());
		}
		
		/**
		 * 送信対象を取得する
		 */
		protected MCList<MBT_SLS_SLIP_SND_IF_R> getSendIfL() {
			MBT_SLS_SLIP_SND_IF_R t = MBT_SLS_SLIP_SND_IF_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.data_lno, t.data_no, t.data_crud_typ, t.ext_sys_cd);
			bldr.setWhere(t.exe_sts_typ.eq(bind("1")), MAC_EXE_STS_TYP.NOT_EXE.value());
			bldr.addWhereWithAnd(t.upd_srv_req_no.eq(bind("1")), MCSys.request.serverRequestNo());
			
			MCList<MBT_SLS_SLIP_SND_IF_R> rslt = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			dbSelect("MSBBL6260_MBT_SLS_SLIP_SND_IF_S02", rslt, bldr);
			return rslt;
		}
		
		/**
		 * 送信制御処理呼び出し 
		 */
		protected void callESBSendCtrl(MCList<MBT_SLS_SLIP_SND_IF_R> sendL) {
			MCList<MBT_SLS_SLIP_SND_IF_R>
				sendIfDL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class),
				sendIfCuL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			for (MBT_SLS_SLIP_SND_IF_R r : sendL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					sendIfDL.add(r);
				}
				else {
					sendIfCuL.add(r);
				}
			}
			callESBSendCtrlCmn(sendIfDL);
			callESBSendCtrlCmn(sendIfCuL);
		}
		
		/**
		 * 送信制御処理呼び出し 
		 */
		protected void callESBSendCtrlCmn(MCList<MBT_SLS_SLIP_SND_IF_R> sendIfL) {
			if (!sendIfL.isEmpty()) {
				PFBZL_SendRecvIfCtrl.Ins01 o = PFBZL_SendRecvIfCtrl.crtIns01();
				addAll(
					o.up0(),
					sendIfL.groupBy(
						MBT_SLS_SLIP_SND_IF_R.$data_no,
						MBT_SLS_SLIP_SND_IF_R.$ext_sys_cd),
					createMap_DtlR_MBT_SLS_SLIP_SND_IF_R()
				);
				o.exec();
			}
		}
		protected Map_DtlR_MBT_SLS_SLIP_SND_IF_R<DtlR, MBT_SLS_SLIP_SND_IF_R> createMap_DtlR_MBT_SLS_SLIP_SND_IF_R() {
			return new Map_DtlR_MBT_SLS_SLIP_SND_IF_R<DtlR, MBT_SLS_SLIP_SND_IF_R>();
		}
		public class Map_DtlR_MBT_SLS_SLIP_SND_IF_R<D extends DtlR, S extends MBT_SLS_SLIP_SND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MBT_SLS_SLIP_SND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MBT_SLS_SLIP_SND_IF_R.$ext_sys_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.if_proc_typ(MAC_IF_PROC_TYP.AC_SLS_SLIP_SEND.value());
			}
		}
	}

	//FMCB CUSTOM END
}