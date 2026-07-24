package mcframe.serverMSLA.MSLAL6420;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSLAL_InspActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_InspActRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL6420";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_InspActRecvIfService.InspActRecvIf_Chk01 aInspActRecvIf_Chk01;

	protected void initInspActRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL6420_InspActRecvIf_Chk01_INFO;
		this.aInspActRecvIf_Chk01 = ((MSLAL_InspActRecvIfService)this).new InspActRecvIf_Chk01();
	}

	public static MSLAL_InspActRecvIfService.InspActRecvIf_Chk01 crtInspActRecvIf_Chk01() {
		MSLAL_InspActRecvIfService lgc = new MSLAL_InspActRecvIfService();
		lgc.initInspActRecvIf_Chk01();
		return lgc.aInspActRecvIf_Chk01;
	}

	protected void paramInspActRecvIf_Chk01(MCParam p) {
		if (this.aInspActRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspActRecvIf_Chk01.up0());
		p.addDownBlock(aInspActRecvIf_Chk01.down0());
	}

	protected void doInspActRecvIf_Chk01() {
		aInspActRecvIf_Chk01.call();
	};

	/**
	 * InspActRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR createInspActRecvIf_Chk01_DtlR(){
		return mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.create();
	}

	/**
	 * InspActRecvIf_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> createInspActRecvIf_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.class);
	}
	protected MSLAL_InspActRecvIfService.InspActRecvIf_Upd01 aInspActRecvIf_Upd01;

	protected void initInspActRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL6420_InspActRecvIf_Upd01_INFO;
		this.aInspActRecvIf_Upd01 = ((MSLAL_InspActRecvIfService)this).new InspActRecvIf_Upd01();
	}

	public static MSLAL_InspActRecvIfService.InspActRecvIf_Upd01 crtInspActRecvIf_Upd01() {
		MSLAL_InspActRecvIfService lgc = new MSLAL_InspActRecvIfService();
		lgc.initInspActRecvIf_Upd01();
		return lgc.aInspActRecvIf_Upd01;
	}

	protected void paramInspActRecvIf_Upd01(MCParam p) {
		if (this.aInspActRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspActRecvIf_Upd01.up0());
	}

	protected void doInspActRecvIf_Upd01() {
		aInspActRecvIf_Upd01.call();
	};

	/**
	 * InspActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createInspActRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * InspActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createInspActRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_InspActRecvIfService.InspActRecvIf_Upd02 aInspActRecvIf_Upd02;

	protected void initInspActRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL6420_InspActRecvIf_Upd02_INFO;
		this.aInspActRecvIf_Upd02 = ((MSLAL_InspActRecvIfService)this).new InspActRecvIf_Upd02();
	}

	public static MSLAL_InspActRecvIfService.InspActRecvIf_Upd02 crtInspActRecvIf_Upd02() {
		MSLAL_InspActRecvIfService lgc = new MSLAL_InspActRecvIfService();
		lgc.initInspActRecvIf_Upd02();
		return lgc.aInspActRecvIf_Upd02;
	}

	protected void paramInspActRecvIf_Upd02(MCParam p) {
		if (this.aInspActRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspActRecvIf_Upd02.up0());
		p.addUpBlock(aInspActRecvIf_Upd02.up1());
		p.addDownBlock(aInspActRecvIf_Upd02.down0());
	}

	protected void doInspActRecvIf_Upd02() {
		aInspActRecvIf_Upd02.call();
	};

	/**
	 * InspActRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createInspActRecvIf_Upd02_DtlR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * InspActRecvIf_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createInspActRecvIf_Upd02_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * InspActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createInspActRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * InspActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createInspActRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_InspActRecvIfService.InspActRecvIf_Upd03 aInspActRecvIf_Upd03;

	protected void initInspActRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL6420_InspActRecvIf_Upd03_INFO;
		this.aInspActRecvIf_Upd03 = ((MSLAL_InspActRecvIfService)this).new InspActRecvIf_Upd03();
	}

	public static MSLAL_InspActRecvIfService.InspActRecvIf_Upd03 crtInspActRecvIf_Upd03() {
		MSLAL_InspActRecvIfService lgc = new MSLAL_InspActRecvIfService();
		lgc.initInspActRecvIf_Upd03();
		return lgc.aInspActRecvIf_Upd03;
	}

	protected void paramInspActRecvIf_Upd03(MCParam p) {
		if (this.aInspActRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspActRecvIf_Upd03.up0());
		p.addDownBlock(aInspActRecvIf_Upd03.down0());
	}

	protected void doInspActRecvIf_Upd03() {
		aInspActRecvIf_Upd03.call();
	};

	/**
	 * InspActRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_DtlR createInspActRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_DtlR.create();
	}

	/**
	 * InspActRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_DtlR> createInspActRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_DtlR.class);
	}

	/**
	 * InspActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_RsltR createInspActRecvIf_Upd03_RsltR(){
		return mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_RsltR.create();
	}
	protected MSLAL_InspActRecvIfService.InspActRecvIf_Upd04 aInspActRecvIf_Upd04;

	protected void initInspActRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL6420_InspActRecvIf_Upd04_INFO;
		this.aInspActRecvIf_Upd04 = ((MSLAL_InspActRecvIfService)this).new InspActRecvIf_Upd04();
	}

	public static MSLAL_InspActRecvIfService.InspActRecvIf_Upd04 crtInspActRecvIf_Upd04() {
		MSLAL_InspActRecvIfService lgc = new MSLAL_InspActRecvIfService();
		lgc.initInspActRecvIf_Upd04();
		return lgc.aInspActRecvIf_Upd04;
	}

	protected void paramInspActRecvIf_Upd04(MCParam p) {
		if (this.aInspActRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspActRecvIf_Upd04.up0());
		p.addDownBlock(aInspActRecvIf_Upd04.down0());
	}

	protected void doInspActRecvIf_Upd04() {
		aInspActRecvIf_Upd04.call();
	};

	/**
	 * InspActRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR createInspActRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.create();
	}

	/**
	 * InspActRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> createInspActRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * InspActRecvIf_Chk01オペレーション.<p>
	 *
	 * 検査実績受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class InspActRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspActRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected InspActRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_InspActRecvIfService)MSLAL_InspActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspActRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR createInspActRecvIf_Chk01_DtlR(){
			return mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.create();
		}

		/**
		 * InspActRecvIf_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> createInspActRecvIf_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_if.data_lno</td></tr>
		 * 	<tr><td><br></td><td>insp_if.data_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>insp_if.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>insp_if.vld_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_if.lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.vld_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_if.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_if.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.imp_only_judg</td></tr>
		 * 	<tr><td><br></td><td>insp_if.insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_rsn</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.stk_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.stk_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.base_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_if.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.so_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>insp_if.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.log_sub_key2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_if.data_lno</td></tr>
		 * 	<tr><td><br></td><td>insp_if.data_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>insp_if.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>insp_if.vld_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_if.lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.vld_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_if.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_if.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.imp_only_judg</td></tr>
		 * 	<tr><td><br></td><td>insp_if.insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_rsn</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.stk_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.stk_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.base_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_if.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.so_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>insp_if.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_InspActRecvIfService)MSLAL_InspActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * InspActRecvIf_Upd01オペレーション.<p>
	 *
	 * 検査実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class InspActRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspActRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected InspActRecvIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_InspActRecvIfService)MSLAL_InspActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * InspActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createInspActRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * InspActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createInspActRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_InspActRecvIfService)MSLAL_InspActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * InspActRecvIf_Upd02オペレーション.<p>
	 *
	 * 検査実績受信ＩＦ取込を行う。（ＩＦデータ確認、および検査実績受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class InspActRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspActRecvIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected InspActRecvIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_InspActRecvIfService)MSLAL_InspActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspActRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createInspActRecvIf_Upd02_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * InspActRecvIf_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createInspActRecvIf_Upd02_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * InspActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createInspActRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * InspActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createInspActRecvIf_Upd02_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>exe_unit_lump_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_actlumprecv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_InspActRecvIfService)MSLAL_InspActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * InspActRecvIf_Upd03オペレーション.<p>
	 *
	 * 検査実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class InspActRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspActRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_RsltR down0;
		
		
		// コンストラクタ
		protected InspActRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_DtlR.class);
			down0 = mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_RsltR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_InspActRecvIfService)MSLAL_InspActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspActRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_DtlR createInspActRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_DtlR.create();
		}

		/**
		 * InspActRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_DtlR> createInspActRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_DtlR.class);
		}

		/**
		 * InspActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_RsltR createInspActRecvIf_Upd03_RsltR(){
			return mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_if.data_lno</td></tr>
		 * 	<tr><td><br></td><td>insp_if.data_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_smpl_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_RsltR
		 */
		public mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Upd03_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_InspActRecvIfService)MSLAL_InspActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * InspActRecvIf_Upd04オペレーション.<p>
	 *
	 * 検査実績受信ＩＦ取込を行う。<br>
	 */
	abstract public class InspActRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspActRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected InspActRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_InspActRecvIfService)MSLAL_InspActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspActRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR createInspActRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.create();
		}

		/**
		 * InspActRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> createInspActRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_if.data_lno</td></tr>
		 * 	<tr><td><br></td><td>insp_if.data_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>insp_if.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_act_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_act_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_smpl_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_smpl_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_smpl_dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_smpl_dfct_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>insp_if.vld_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_if.lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.vld_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_if.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_if.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.imp_only_judg</td></tr>
		 * 	<tr><td><br></td><td>insp_if.insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_judg_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_judg_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_judg_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_judg_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.judg_rsn</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.stk_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_stk_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_stk_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.stk_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_stk_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_stk_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_ttl_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_ttl_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_ttl_dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_ttl_dfct_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.base_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_if.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_ttl_pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_ttl_pack_xfr_pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ttl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.so_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_smpl_pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_smpl_pack_xfr_pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_if.if_bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_if.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.smpl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_if.ext_insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>insp_if.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>insp_if.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>insp_if.log_sub_key2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_if.data_lno</td></tr>
		 * 	<tr><td><br></td><td>insp_if.data_no</td></tr>
		 * 	<tr><td><br></td><td>insp_if.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6420.InspActRecvIf_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_InspActRecvIfService)MSLAL_InspActRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}