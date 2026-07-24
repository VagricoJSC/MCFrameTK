package mcframe.serverMSLA.MSLAL6010;

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
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

import mcframe.serverPF.dbc.*;
import mcframe.serverPFBZ.PFBZL9050.*;
import mcframe.serverPFUD.PFUDL0030.DtlR;

import static mcframe.serverMSLA.MSLAL6010.Query.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_ShipInstSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_ShipInstSendIfService_MC extends MSLAL_ShipInstSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ShipInstSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の入荷予定をＩＦテーブルに書き込む<br>
	 */
	public class ShipInstSendIf_Upd01 extends MSLAL_ShipInstSendIfService_MC_A.ShipInstSendIf_Upd01 {

		//_sendL 送信対象情報
		// _sendIfInsL 今回送信ＩＦ情報
		// _sendIfOldL 前回送信ＩＦ情報
		protected MCList<MST_SHIP_INST_SEND_IF_R> _sendL, _sendIfInsL, _sendIfOldL;

		/**
		 * 納品書単位に分割する場合、納品書NOが設定される一時カラム
		 */
		protected final String SPLIT_DLV_SLIP_NO = "__dlv_slip_no__";

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			initProc();
			getSendInfo();
			if (isNull(_sendL)) return ;
			makeDataNo();
			makeIFData();
			callESBSendCtrl();
		}

		/**
		 * 初期化処理
		 */
		protected void initProc() {
			_sendL = MCList.create(MST_SHIP_INST_SEND_IF_R.class);
			_sendL.addStringColumn("pr_sts_typ");
			_sendL.addBooleanColumn("can_flg");
			_sendL.addNumberColumn("disp_seq");
			_sendL.addNumberColumn("latest_rev");
			_sendL.addStringColumn(SPLIT_DLV_SLIP_NO);
			_sendL.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg);
			_sendL.addBooleanColumn(MAM_EXT_SYS_R.$not_send_upd_flg);
			_sendL.addBooleanColumn(PFT_SDRV_IF_R.$not_send_flg);

			// 一時カラムも引き継ぎたいのでcloneする
			_sendIfInsL = _sendL.clone();
			_sendIfOldL = _sendL.clone();
		}

		/**
		 * 送信対象の出荷指図情報を取得
		 */
		protected void getSendInfo() {
			insWk();
			MCList<MST_SHIP_INST_SEND_IF_R>
				chgL = _sendL.clone(), sendL = _sendL.clone();

			executeQuery(sendL, MSLAL6010_MST_SHIP_INST_S01());

			// 送信対象のひとつ前のリビジョンを取得する
			executeQuery(_sendIfOldL, MSLAL6010_MST_SHIP_INST_S02());

			// ひとつ前のリビジョンから補完
			MCIndexKey upIdx = up0().createIndex(ShipInstSendIf_Upd01_DtlR.$ship_alloc_sts_no);
			MCIndexKey idx = sendL.createIndex(MST_SHIP_INST_SEND_IF_R.$ship_alloc_sts_no, MST_SHIP_INST_SEND_IF_R.$ship_inst_rev);
			MCIndexKey ifIdx = _sendIfOldL.createIndex(MST_SHIP_INST_SEND_IF_R.$ship_alloc_sts_no);
			for (MST_SHIP_INST_SEND_IF_R r : sendL) {
				if (isNull(r.getNumber("latest_rev"))) {
					// 最新でないリビジョンは送信対象外
					continue;
				}

				// 最新のリビジョンのみ送信対象
				_sendL.add(r);

				ShipInstSendIf_Upd01_DtlR upR = up0().getFirst(upIdx, r.ship_alloc_sts_no());
				MST_SHIP_INST_SEND_IF_R oldIfR = _sendIfOldL.getFirst(ifIdx, r.ship_alloc_sts_no());
				if (!MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ()) || isNull(oldIfR)) {
					continue;
				}

				// 打ち切った指図データは納品書の対象外なので、前回分の納品書NOを設定する
				if (r.abort_flg()) {
					r.dlv_slip_no(oldIfR.dlv_slip_no());
					r.dlv_slip_d_no(oldIfR.dlv_slip_d_no());
				}

				// 前回と場所が変わっている場合は、送信対象に追加する
				// 実際に送信するかは、場所に対応する外部システムCDによる
				if (!isSame(r.ship_loc_cd(), oldIfR.ship_loc_cd())) {
					MST_SHIP_INST_SEND_IF_R chgR = sendL.getFirst(idx, oldIfR.ship_alloc_sts_no(), oldIfR.ship_inst_rev());
					if (!isNull(chgR)) {
						chgR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						chgL.add(chgR);
					}
				}
			}

			// 外部システムCDを取得・設定する
			MCList<MST_SHIP_INST_SEND_IF_R> lst = MCList.create(MST_SHIP_INST_SEND_IF_R.class);
			lst.setAll(_sendL);
			lst.addAll(chgL);
			setExtSysCd(lst);

			idx = _sendL.createIndex(MST_SHIP_INST_SEND_IF_R.$ship_alloc_sts_no);
			for (MST_SHIP_INST_SEND_IF_R chgR : chgL) {
				MST_SHIP_INST_SEND_IF_R r = _sendL.getFirst(idx, chgR.ship_alloc_sts_no());
				if (isNull(chgR.ext_sys_cd()) || isSame(r.ext_sys_cd(), chgR.ext_sys_cd())) {
					chgR.setStatus(MCRow.DELETE);	// 送信対象外
				}
			}
			chgL.removeAll(chgL.subList(MCRow.DELETE));

			// 送信対象に追加
			_sendL.addAll(chgL);

			delWk();
		}

		/**
		 * ワークテーブルに上り電文のNOを追加する
		 */
		protected void insWk() {
			MCList<MST_SHIP_INST_R> inst = MCList.create(MST_SHIP_INST_R.class);
			up0().forEach(r -> inst.add().ship_inst_no(r.ship_inst_no()));

			MCQueryApiBuilder inst_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			dbWkDelete("MSLAL6010_MSW_SHIP_INST_D01", inst_bldr.getBaseDbc());
			MCList<MST_SHIP_INST_R> inst2 = inst.groupBy(MST_SHIP_INST_R.$ship_inst_no);
			MCQueryApiBuilder inst2_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			dbWkInsert("MSLAL6010_MSW_SHIP_INST_I01", inst2, inst2_bldr.getBaseDbc());

			MCList<MST_SHIP_ALLOC_STS_R> alloc = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			up0().forEach(r -> alloc.add().ship_alloc_sts_no(r.ship_alloc_sts_no()));
			
			MCQueryApiBuilder alloc_bldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_R.create("T"));
			dbWkDelete("MSLAL6010_MSW_SHIP_ALLOC_STS_D01", alloc_bldr.getBaseDbc());
			MCList<MST_SHIP_ALLOC_STS_R> alloc2 = alloc.groupBy(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
			MCQueryApiBuilder alloc2_bldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_R.create("T"));
			dbWkInsert("MSLAL6010_MSW_SHIP_ALLOC_STS_I01", alloc2, alloc2_bldr.getBaseDbc());
		}

		/**
		 * ワークテーブルを削除する
		 */
		protected void delWk() {
			
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			dbWkDelete("MSLAL6010_MSW_SHIP_INST_D02", dbcL_bldr.getBaseDbc());

			MCQueryApiBuilder dbcL2_bldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_R.create("T"));
			dbWkDelete("MSLAL6010_MSW_SHIP_ALLOC_STS_D02", dbcL2_bldr.getBaseDbc());
		}


		/**
		* データＮＯ発番（キャッシュ）
		*/
		protected void makeDataNo() {
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, _sendL.groupBy(getGrpKey()).size());
			doSeqCache(MSC_NUM_SYS_TYP.SHIPINSTSENDIF, _sendL.size());
		}

		/**
		 * ＩＦデータ作成
		 */
		protected void makeIFData() {
			MCIndexKey upIdx = up0().createIndex(ShipInstSendIf_Upd01_DtlR.$ship_alloc_sts_no);
			MCIndexKey ifIdx = _sendIfOldL.createIndex(MST_SHIP_INST_SEND_IF_R.$ship_alloc_sts_no);
			
			MCList<MST_IV_SHIP_INST_MAP_R> fixIvShipInstMapL = getFixIvShipInstMapL();
			MCIndexKey fixIvShipInstMapIdxkey = fixIvShipInstMapL.createIndex(MST_IV_SHIP_INST_MAP_R.$ship_alloc_sts_no);
			
			doItmUnitCache(_sendL);

			MCSortPolicy policy = new MCSortPolicy();
			policy.add(SortType.DESC, "can_flg");
			policy.add(SortType.ASC, "disp_seq");

			for (MCList<MST_SHIP_INST_SEND_IF_R> l: groupList()) {
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());

				l.sort(policy);
				MCList<MST_SHIP_INST_SEND_IF_R> sendL = MCList.create(MST_SHIP_INST_SEND_IF_R.class); 
				for (MCList<MST_SHIP_INST_SEND_IF_R> grpL: l.groupList(MST_SHIP_INST_SEND_IF_R.$ship_alloc_sts_no)) {
					// 梱包まとめした場合、同一の出荷引当状況NOがまとめ元の件数分取得されるので、先頭のみ処理対象とする
					MST_SHIP_INST_SEND_IF_R r = grpL.get(0);

					ShipInstSendIf_Upd01_DtlR upR = up0().getFirst(upIdx, r.ship_alloc_sts_no());
					MST_SHIP_INST_SEND_IF_R oldIfR = _sendIfOldL.getFirst(ifIdx, r.ship_alloc_sts_no());

					if (isNoSendTarget(r, upR, oldIfR)) {
						continue;
					}

					r.data_no(dataNo);
					r.co_nm(getCo().co_nm());
					r.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
					r.data_crud_typ(getIFDataCrudTyp(r, upR, oldIfR));
					r.data_lno(getSequence(MSC_NUM_SYS_TYP.SHIPINSTSENDIF.value()));

					if (!r.getBoolean(MAM_EXT_SYS_R.$null_val_if_flg)) {
						r.ship_str_ln_cd(nullValToNull(r.ship_str_ln_cd()));
						r.itm_sub1(nullValToNull(r.itm_sub1()));
						r.itm_sub2(nullValToNull(r.itm_sub2()));
						r.itm_sub3(nullValToNull(r.itm_sub3()));
						r.lot_no(nullValToNull(r.lot_no()));
						r.sublot_no(nullValToNull(r.sublot_no()));
						r.sno1(nullValToNull(r.sno1()));
						r.sno2(nullValToNull(r.sno2()));
						r.sno3(nullValToNull(r.sno3()));
						r.sno4(nullValToNull(r.sno4()));
						r.stk_bp_cd(nullValToNull(r.stk_bp_cd()));
					}

					if (!isNull(r.ent_unit_wt())) {
						r.ent_unit_wt().setScale(
							MST_SHIP_INST_SEND_IF_R.ent_unit_wt_META.scale(), MCNumber.MODE_DOWN);
					}
					if (!isNull(r.ent_unit_dim())) {
						r.ent_unit_dim().setScale(
							MST_SHIP_INST_SEND_IF_R.ent_unit_dim_META.scale(), MCNumber.MODE_DOWN);
					}
					MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = fixIvShipInstMapL.subList(fixIvShipInstMapIdxkey, r.ship_alloc_sts_no());
					MCNumber baseUnitQty = r.base_unit_qty();
					if (!isNull(r.iv_no()) || ivShipInstMapL.isEmpty()) {
						_sendIfInsL.add(r);
						sendL.add(r);
					}
					else {
						for (MST_IV_SHIP_INST_MAP_R ivShipInstMapR: ivShipInstMapL) {
							
							if (!baseUnitQty.isPositive()) {
								break;
							}
							
							MCNumber shipInstIvQty =  ivShipInstMapR.base_unit_qty();
							
							if (!shipInstIvQty.isPositive()) {
								continue;
							}
							
							MST_SHIP_INST_SEND_IF_R ivSendIfR = r.clone();
							ivSendIfR.data_lno(getSequence(MSC_NUM_SYS_TYP.SHIPINSTSENDIF.value()));
							ivSendIfR.iv_no(ivShipInstMapR.getStringNE(MST_IV_R.$iv_no));
							ivSendIfR.iv_d_no(ivShipInstMapR.iv_d_no());
							
							if (baseUnitQty.gt(shipInstIvQty)) {
								ivSendIfR.base_unit_qty(shipInstIvQty);
								baseUnitQty = baseUnitQty.subtract(shipInstIvQty);
								ivShipInstMapR.base_unit_qty(ivShipInstMapR.base_unit_qty().subtract(shipInstIvQty));
							}
							else {
								ivSendIfR.base_unit_qty(baseUnitQty);
								ivShipInstMapR.base_unit_qty(ivShipInstMapR.base_unit_qty().subtract(baseUnitQty));
								baseUnitQty = MCNumber.ZERO;
							}
							
							convUnit(ivSendIfR);
							
							_sendIfInsL.add(ivSendIfR);
							sendL.add(ivSendIfR);
						}
						
						if (baseUnitQty.isPositive()) {
							MST_SHIP_INST_SEND_IF_R noIvSendIfR = r.clone();
							noIvSendIfR.base_unit_qty(baseUnitQty);
							convUnit(noIvSendIfR);
							
							_sendIfInsL.add(noIvSendIfR);
							sendL.add(noIvSendIfR);
						}
					}
				}

				// ESBの送信対象外フラグの設定(データ更新区分を参照するので最後に設定する)
				sendL.setBoolean(PFT_SDRV_IF_R.$not_send_flg, isNotSendFlgForPF(sendL));
				
			}
			MCQueryApiBuilder sendIfInsL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_SEND_IF_R.create("T"));
			dbInsertEx("MSLAL6010_MST_SHIP_INST_SEND_IF_I01", _sendIfInsL, sendIfInsL_bldr);
		}
		
		/**
		 * 単位換算を行う。
		 * @param sendIfR 出荷指図送信ＩＦ
		 */
		protected void convUnit(MST_SHIP_INST_SEND_IF_R sendIfR) {
			
			if (!isNull(sendIfR.ent_unit_cd())) {
				if (isSame(sendIfR.ent_unit_cd(), sendIfR.base_unit_cd())) {
					sendIfR.ent_unit_qty(sendIfR.base_unit_qty());
				}
				else {
					MAVM_ITM_UNIT_R itmUnitR = getItmUnit(sendIfR.itm_cd(),
							nvl(sendIfR.itm_sub1(), MAC_STR.NULL_VAL.value()),
							nvl(sendIfR.itm_sub2(), MAC_STR.NULL_VAL.value()),
							nvl(sendIfR.itm_sub3(), MAC_STR.NULL_VAL.value()),
							sendIfR.ent_unit_cd());
					
					MCNumber entUnitQty = rvrsBaseUnitConv(
							sendIfR.base_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(), itmUnitR.rnd_typ(), true);
					
					if (!isNull(entUnitQty)) {
						sendIfR.ent_unit_qty(entUnitQty);
					}
					else {
						sendIfR.ent_unit_qty(sendIfR.base_unit_qty());
						sendIfR.ent_unit_cd(sendIfR.base_unit_cd());
						sendIfR.ent_unit_nm(sendIfR.base_unit_nm());
					}
				}
				
				MAVM_ITM_UNIT_R entItmUnitR = getItmUnit(sendIfR.itm_cd(),
						nvl(sendIfR.itm_sub1(), MAC_STR.NULL_VAL.value()),
						nvl(sendIfR.itm_sub2(), MAC_STR.NULL_VAL.value()),
						nvl(sendIfR.itm_sub3(), MAC_STR.NULL_VAL.value()),
						sendIfR.ent_unit_cd());
				// 重量
				if (!isNull(sendIfR.wt_unit_cd())) {
					sendIfR.ent_unit_wt(sendIfR.ent_unit_qty().multiply(entItmUnitR.unit_wt()));
				}
				
				// 容積
				if (!isNull(sendIfR.dim_unit_cd())) {
					sendIfR.ent_unit_dim(sendIfR.ent_unit_qty().multiply(entItmUnitR.unit_dim()));
				}
				
				if (!isNull(sendIfR.ent_unit_wt())) {
					sendIfR.ent_unit_wt().setScale(
						MST_SHIP_INST_SEND_IF_R.ent_unit_wt_META.scale(), MCNumber.MODE_DOWN);
				}
				if (!isNull(sendIfR.ent_unit_dim())) {
					sendIfR.ent_unit_dim().setScale(
						MST_SHIP_INST_SEND_IF_R.ent_unit_dim_META.scale(), MCNumber.MODE_DOWN);
				}
			}
			
			if (!isNull(sendIfR.trd_unit_cd())) {
				if (isSame(sendIfR.trd_unit_cd(), sendIfR.base_unit_cd())) {
					sendIfR.trd_unit_qty(sendIfR.base_unit_qty());
				}
				else {
					MAVM_ITM_UNIT_R itmUnitR = getItmUnit(sendIfR.itm_cd(),
							nvl(sendIfR.itm_sub1(), MAC_STR.NULL_VAL.value()),
							nvl(sendIfR.itm_sub2(), MAC_STR.NULL_VAL.value()),
							nvl(sendIfR.itm_sub3(), MAC_STR.NULL_VAL.value()),
							sendIfR.trd_unit_cd());
					MCNumber trdUnitQty = rvrsBaseUnitConv(
							sendIfR.base_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(), itmUnitR.rnd_typ(), true);
					
					if (!isNull(trdUnitQty)) {
						sendIfR.trd_unit_qty(trdUnitQty);
					}
					else {
						sendIfR.trd_unit_qty(sendIfR.base_unit_qty());
						sendIfR.trd_unit_cd(sendIfR.base_unit_cd());
						sendIfR.trd_unit_nm(sendIfR.base_unit_nm());
					}
				}
			}
			
			if (!isNull(sendIfR.pack_unit_cd())) {
				if (isSame(sendIfR.pack_unit_cd(), sendIfR.base_unit_cd())) {
					sendIfR.pack_unit_qty(sendIfR.base_unit_qty());
				}
				else {
					MAVM_ITM_UNIT_R itmUnitR = getItmUnit(sendIfR.itm_cd(),
							nvl(sendIfR.itm_sub1(), MAC_STR.NULL_VAL.value()),
							nvl(sendIfR.itm_sub2(), MAC_STR.NULL_VAL.value()),
							nvl(sendIfR.itm_sub3(), MAC_STR.NULL_VAL.value()),
							sendIfR.pack_unit_cd());
					MCNumber packUnitQty = rvrsBaseUnitConv(
							sendIfR.base_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(), itmUnitR.rnd_typ(), true);
					
					if (!isNull(packUnitQty)) {
						sendIfR.pack_unit_qty(packUnitQty);
					}
					else {
						sendIfR.pack_unit_qty(sendIfR.base_unit_qty());
						sendIfR.pack_unit_cd(sendIfR.base_unit_cd());
						sendIfR.pack_unit_nm(sendIfR.base_unit_nm());
					}
				}
			}
		}
		
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
		protected void doItmUnitCache(MCList<?> dtlL) {
			
			MAVM_ITM_UNIT_R t_itmUnit = MAVM_ITM_UNIT_R.create("ITMUNIT");
			MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(t_itmUnit);
			
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr);
			_itmUnitCache.setFixMaxCacheSize(-1);

			MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.class);
			itmUnitL_bldr.setWhere(t_itmUnit.itm_cd.eq(bind("itm_cd")));
			itmUnitL_bldr.addWhereWithAnd(t_itmUnit.itm_sub1.eq(bind("itm_sub1")));
			itmUnitL_bldr.addWhereWithAnd(t_itmUnit.itm_sub2.eq(bind("itm_sub2")));
			itmUnitL_bldr.addWhereWithAnd(t_itmUnit.itm_sub3.eq(bind("itm_sub3")));
			
			MCList<?> tmp = dtlL.groupBy("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			dbSelect("MSLAL6010_MAVM_ITM_UNIT_S01", itmUnitL, itmUnitL_bldr, tmp);

			for (MAVM_ITM_UNIT_R itmUnitR : itmUnitL) {
				Comparable<?>[] key = itmUnitR.toArray(itmUnitR.getKeyColumn());
				_itmUnitCache.putCache(key, itmUnitR);
			}
		}
		
		protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
			if (_itmUnitCache == null) {
				_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
						MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")));
				_itmUnitCache.setFixMaxCacheSize(-1);
			}
			
			return _itmUnitCache.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
		}
		
		/**
		 * 確定フラグがオンのインボイス出荷指図マップを取得する。
		 * @return 確定フラグがオンのインボイス出荷指図マップリスト
		 */
		protected MCList<MST_IV_SHIP_INST_MAP_R> getFixIvShipInstMapL() {
			
			MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
			
			MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			
			MCQueryApiBuilder ivShipInstMap_bldr = MCQueryApiBuilder.create(ivShipInstMap);
			ivShipInstMap_bldr.addSelect(iv.iv_no);
			ivShipInstMap_bldr.addInnerJoin(ivD, ivShipInstMap.iv_d_no.eq(ivD.iv_d_no));
			ivShipInstMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivShipInstMap_bldr.setWhere(ivShipInstMap.ship_alloc_sts_no.eq(bind(ShipInstSendIf_Upd01_DtlR.$ship_alloc_sts_no)));
			ivShipInstMap_bldr.addConstWhereWithAnd(ivShipInstMap.ship_inst_fix_flg.eq(value(true)));
			ivShipInstMap_bldr.addConstWhereWithAnd(iv.iv_ship_flg.eq(value(false)));
			ivShipInstMap_bldr.addConstWhereWithAnd(iv.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())));
			
			dbSelect("MSLAL6010_MST_IV_SHIP_INST_MAP_S01", ivShipInstMapL, ivShipInstMap_bldr, up0());
			
			return ivShipInstMapL;
		}

		/**
		 * 送受信ＩＦ(ESB)の送信対象外フラグに設定する値を取得する
		 */
		protected boolean isNotSendFlgForPF(MCList<MST_SHIP_INST_SEND_IF_R> sendL) {
			// 外部システムマスタの送信後訂正不可=オン、かつ全行がデータ更新区分=削除の場合は、送信対象外フラグをオンにする。
			for (MST_SHIP_INST_SEND_IF_R r : sendL) {
				if (!r.getBoolean(MAM_EXT_SYS_R.$not_send_upd_flg)
					|| !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					return false;
				}
			}
			return true;
		}

		/**
		 * 送信対象外か判定する
		 */
		protected boolean isNoSendTarget(
				MST_SHIP_INST_SEND_IF_R r, ShipInstSendIf_Upd01_DtlR upR, MST_SHIP_INST_SEND_IF_R oldIfR) {
			if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
				if (r.abort_flg()) {
					if (isNull(oldIfR)) {
						// 新規行の打ち切りは対象外
						return true;
					}
					else if (oldIfR.abort_flg()) {
						// 打ち切りフラグがオンからオン
						return true;
					}
				}
			}
			else if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
				if (r.abort_flg()) {
					// 新規行の打ち切りは対象外
					return true;
				}
			}
			// SCM IF制御マスタが未設定
			if (isNull(r.ext_sys_cd())) return true;
			// 一部出荷は扱わない
			if (MSC_PR_STS_TYP.isPART_SHIP(r.getStringNE("pr_sts_typ"))
				|| MSC_PR_STS_TYP.isSHIP(r.getStringNE("pr_sts_typ"))) {
				return true;
			}

			return false;
		}

		/**
		 * データ更新区分を取得する
		 */
		protected String getIFDataCrudTyp(
				MST_SHIP_INST_SEND_IF_R r, ShipInstSendIf_Upd01_DtlR upR, MST_SHIP_INST_SEND_IF_R oldIfR) {
			if (r.getBooleanNE("can_flg")) {
				return MAC_DATA_CRUD_TYP.DEL.value();
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
				if (isNull(oldIfR)) {
					return MAC_DATA_CRUD_TYP.CRT.value();
				}
				else if (!isNull(r.data_crud_typ())) {
					return r.data_crud_typ();
				}
			}
			return upR.data_crud_typ();
		}

		/**
		 * データNOを分割するキーを取得する
		 */
		protected String[] getGrpKey() {
			return new String[] {
				MST_SHIP_INST_SEND_IF_R.$ship_inst_no,
				MST_SHIP_INST_SEND_IF_R.$ext_sys_cd,
				SPLIT_DLV_SLIP_NO
			};
		}

		/**
		 * 送信対象を分割する
		 */
		protected MCList<MST_SHIP_INST_SEND_IF_R>[] groupList() {
			MCList<MST_SHIP_INST_SEND_IF_R>[] gl = _sendL.groupList(getGrpKey());
			Arrays.sort(gl,
				new Comparator<MCList<MST_SHIP_INST_SEND_IF_R>>() {
					public int compare(MCList<MST_SHIP_INST_SEND_IF_R> o1, MCList<MST_SHIP_INST_SEND_IF_R> o2) {
						int cmp = 0;
						for (String s : getGrpKey()) {
							if (compare(o1.get(0).getStringNE(s), o2.get(0).getStringNE(s)) != 0) {
								break;
							}
						}
						return cmp;
					}
					public int compare(String s1, String s2) {
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
			return gl;
		}

		/**
		 * 外部システムCDを取得・設定する
		 */
		protected void setExtSysCd(MCList<MST_SHIP_INST_SEND_IF_R> sendL) {

			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			Map<MCNumber, MST_SHIP_INST_SEND_IF_R> map = new HashMap<>();
			MCNumber peg = MCNumber.ZERO;
			for (MST_SHIP_INST_SEND_IF_R ssR : sendL) {

				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(MAC_IF_PROC_TYP.WMS_SHIP_INST_SEND.value());
				r.loc_cd(ssR.ship_loc_cd());
				r.lg_grp_cd(ssR.ship_fr_lg_grp_cd());
				if (MSC_DLV_ID_TYP.isDLV(ssR.dlv_id_typ())) {
					r.dlv_cd(ssR.dlv_id_cd());
				}
				else if (MSC_DLV_ID_TYP.isLOC(ssR.dlv_id_typ())) {
					r.gr_loc_cd(ssR.dlv_id_cd());
				}
				r.master_dt(getToday());

				map.put(peg, ssR);
				peg = peg.add(1);
			}
			if (!o.up0().isEmpty()) {
				o.exec();

				for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
					if (map.containsKey(r.peg_no())) {
						MST_SHIP_INST_SEND_IF_R ssR = map.get(r.peg_no());
						ssR.ext_sys_cd(r.ext_sys_cd());
						ssR.setBoolean(MAM_EXT_SYS_R.$null_val_if_flg, r.null_val_if_flg());
						ssR.setBoolean(MAM_EXT_SYS_R.$not_send_upd_flg, r.not_send_upd_flg());
						if (r.dlv_slip_split_flg()) {
							// 納品書単位分割フラグがオンの場合は、納品書単位にデータNOを分ける
							ssR.setStringNE(SPLIT_DLV_SLIP_NO, ssR.dlv_slip_no());
						}
					}
				}
			}
		}

		/**
		 * 送信制御処理呼び出し 
		 */
		protected void callESBSendCtrl() {

			// 今回作成分
			PFBZL_SendRecvIfCtrl.Ins01 ins01 = PFBZL_SendRecvIfCtrl.crtIns01();
			addAll(
				ins01.up0(),
				_sendIfInsL.groupBy(
					MST_SHIP_INST_SEND_IF_R.$data_no,
					MST_SHIP_INST_SEND_IF_R.$ext_sys_cd,
					MAM_EXT_SYS_R.$not_send_upd_flg),
				createMap_DtlR_MST_SHIP_INST_SEND_IF_R()
			);

			// 今回作成分および過去データの送信対象外フラグをオンに更新する。
			PFBZL_SendRecvIfCtrl.Upd01 upd01 = PFBZL_SendRecvIfCtrl.crtUpd01();
			upd01.up0().addAll(getNotSendList(_sendIfInsL));
			upd01.up0().addAll(getNotSendOldList(_sendIfInsL));	// ins01でデータを登録する前に取得する

			if (!ins01.up0().isEmpty()) {
				ins01.exec();
			}
			if (!upd01.up0().isEmpty()) {
				upd01.exec();
			}
		}
		protected Map_DtlR_MST_SHIP_INST_SEND_IF_R<DtlR,MST_SHIP_INST_SEND_IF_R> createMap_DtlR_MST_SHIP_INST_SEND_IF_R() {
			return new Map_DtlR_MST_SHIP_INST_SEND_IF_R<DtlR, MST_SHIP_INST_SEND_IF_R>();
		}
		public class Map_DtlR_MST_SHIP_INST_SEND_IF_R<D extends DtlR, S extends MST_SHIP_INST_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_SHIP_INST_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_SHIP_INST_SEND_IF_R.$ext_sys_cd);
				addColumnPathMap(DtlR.$not_send_upd_flg, MAM_EXT_SYS_R.$not_send_upd_flg);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.if_proc_typ(MAC_IF_PROC_TYP.WMS_SHIP_INST_SEND.value());
			}
		}

		/**
		 * 送信対象外データ取得処理
		 */
		protected MCList<Upd01_DtlR> getNotSendList(MCList<MST_SHIP_INST_SEND_IF_R> sendL) {
			MCList<Upd01_DtlR> notSendL = MCList.create(Upd01_DtlR.class);
			if(sendL.isEmpty()) return notSendL;
			
			sendL.forEach(r -> {
				if(r.getBooleanNE("not_send_flg")) {
					Upd01_DtlR notSendR = notSendL.add();
					notSendR.data_no(r.data_no());
					notSendR.not_send_flg(true);
					notSendR.not_send_upd_flg(r.getBooleanNE("not_send_upd_flg"));
				}
			});
			return notSendL.groupBy(
				Upd01_DtlR.$data_no, Upd01_DtlR.$not_send_flg, Upd01_DtlR.$not_send_upd_flg);
		}

		/**
		 * 送信対象外の過去データ取得処理
		 */
		protected MCList<Upd01_DtlR> getNotSendOldList(MCList<MST_SHIP_INST_SEND_IF_R> sendL) {
			MCList<Upd01_DtlR> notSendL = MCList.create(Upd01_DtlR.class);
			if(sendL.isEmpty()) return notSendL;

			MCList<PFT_SDRV_IF_R> sdrvIfL = MCList.create(PFT_SDRV_IF_R.class);
			PFT_SDRV_IF_R t1 = PFT_SDRV_IF_R.create("T");
			MCQueryApiBuilder sdrvIfL_bldr = MCQueryApiBuilder.create(t1);
			MST_SHIP_INST_SEND_IF_R t2 = MST_SHIP_INST_SEND_IF_R.create("T2");
			sdrvIfL_bldr.setSelect(t1.data_no, t1.not_send_upd_flg);
			sdrvIfL_bldr.addInnerJoin(t2, bracket(t2.data_no.eq(t1.data_no)));
			sdrvIfL_bldr.addWhereWithAnd(t2.ship_inst_no.eq(bind("ship_inst_no")));
			sdrvIfL_bldr.addWhereWithAnd(t2.ext_sys_cd.eq(bind("ext_sys_cd")));
			sdrvIfL_bldr.addWhereWithAnd(t1.not_send_flg.eq(value(false)));
			sdrvIfL_bldr.addWhereWithAnd(t1.sdrv_sts_typ.neq(value(MAC_SDRV_STS_TYP.SEND_OK.value())));
			sdrvIfL_bldr.setLockTable(t1.data_no);
			dbSelectForUpdate("MSLAL6010_PFT_SDRV_IF_S01", sdrvIfL, sdrvIfL_bldr,
					sendL.subList(r -> r.getBoolean("not_send_upd_flg")));

			if(sdrvIfL.isEmpty()) return notSendL;
			sdrvIfL.forEach(r -> {
				Upd01_DtlR notSendR = notSendL.add();
				notSendR.data_no(r.data_no());
				notSendR.not_send_flg(true);
				notSendR.not_send_upd_flg(r.not_send_upd_flg());
			});

			return notSendL.groupBy(
				Upd01_DtlR.$data_no, Upd01_DtlR.$not_send_flg, Upd01_DtlR.$not_send_upd_flg);
		}
	}

	//FMCB CUSTOM END
}