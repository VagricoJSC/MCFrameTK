package mcframe.serverMSBE.MSBEL5220;

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
 * "MSBEL_XfrActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_XfrActService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5220";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_XfrActService.XfrAct_Chk01 aXfrAct_Chk01;

	protected void initXfrAct_Chk01() {
		this.info = PDef.MS_MSBEL5220_XfrAct_Chk01_INFO;
		this.aXfrAct_Chk01 = ((MSBEL_XfrActService)this).new XfrAct_Chk01();
	}

	public static MSBEL_XfrActService.XfrAct_Chk01 crtXfrAct_Chk01() {
		MSBEL_XfrActService lgc = new MSBEL_XfrActService();
		lgc.initXfrAct_Chk01();
		return lgc.aXfrAct_Chk01;
	}

	protected void paramXfrAct_Chk01(MCParam p) {
		if (this.aXfrAct_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrAct_Chk01.up0());
		p.addUpBlock(aXfrAct_Chk01.up1());
		p.addDownBlock(aXfrAct_Chk01.down0());
	}

	protected void doXfrAct_Chk01() {
		aXfrAct_Chk01.call();
	};

	/**
	 * XfrActChk_HdrDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR createXfrActChk_HdrDtlR(){
		return mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR.create();
	}

	/**
	 * XfrActChk_HdrDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR> createXfrActChk_HdrDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR.class);
	}

	/**
	 * XfrActChk_DelDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5220.XfrActChk_DelDtlR createXfrActChk_DelDtlR(){
		return mcframe.serverMSBE.MSBEL5220.XfrActChk_DelDtlR.create();
	}

	/**
	 * XfrActChk_DelDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_DelDtlR> createXfrActChk_DelDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrActChk_DelDtlR.class);
	}
	protected MSBEL_XfrActService.XfrAct_Chk02 aXfrAct_Chk02;

	protected void initXfrAct_Chk02() {
		this.info = PDef.MS_MSBEL5220_XfrAct_Chk02_INFO;
		this.aXfrAct_Chk02 = ((MSBEL_XfrActService)this).new XfrAct_Chk02();
	}

	public static MSBEL_XfrActService.XfrAct_Chk02 crtXfrAct_Chk02() {
		MSBEL_XfrActService lgc = new MSBEL_XfrActService();
		lgc.initXfrAct_Chk02();
		return lgc.aXfrAct_Chk02;
	}

	protected void paramXfrAct_Chk02(MCParam p) {
		if (this.aXfrAct_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrAct_Chk02.up0());
		p.addDownBlock(aXfrAct_Chk02.down0());
	}

	protected void doXfrAct_Chk02() {
		aXfrAct_Chk02.call();
	};
	protected MSBEL_XfrActService.XfrAct_Upd02 aXfrAct_Upd02;

	protected void initXfrAct_Upd02() {
		this.info = PDef.MS_MSBEL5220_XfrAct_Upd02_INFO;
		this.aXfrAct_Upd02 = ((MSBEL_XfrActService)this).new XfrAct_Upd02();
	}

	public static MSBEL_XfrActService.XfrAct_Upd02 crtXfrAct_Upd02() {
		MSBEL_XfrActService lgc = new MSBEL_XfrActService();
		lgc.initXfrAct_Upd02();
		return lgc.aXfrAct_Upd02;
	}

	protected void paramXfrAct_Upd02(MCParam p) {
		if (this.aXfrAct_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrAct_Upd02.up0());
		p.addUpBlock(aXfrAct_Upd02.up1());
		p.addUpBlock(aXfrAct_Upd02.up2());
		p.addDownBlock(aXfrAct_Upd02.down0());
		p.addDownBlock(aXfrAct_Upd02.down1());
	}

	protected void doXfrAct_Upd02() {
		aXfrAct_Upd02.call();
	};

	/**
	 * XfrAct_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR createXfrAct_HdrR(){
		return mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.create();
	}

	/**
	 * XfrAct_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR createXfrAct_DtlR(){
		return mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.create();
	}

	/**
	 * XfrAct_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR> createXfrAct_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.class);
	}

	/**
	 * XfrAct_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5220.XfrAct_CndR createXfrAct_CndR(){
		return mcframe.serverMSBE.MSBEL5220.XfrAct_CndR.create();
	}
	protected MSBEL_XfrActService.XfrAct_Ins02 aXfrAct_Ins02;

	protected void initXfrAct_Ins02() {
		this.info = PDef.MS_MSBEL5220_XfrAct_Ins02_INFO;
		this.aXfrAct_Ins02 = ((MSBEL_XfrActService)this).new XfrAct_Ins02();
	}

	public static MSBEL_XfrActService.XfrAct_Ins02 crtXfrAct_Ins02() {
		MSBEL_XfrActService lgc = new MSBEL_XfrActService();
		lgc.initXfrAct_Ins02();
		return lgc.aXfrAct_Ins02;
	}

	protected void paramXfrAct_Ins02(MCParam p) {
		if (this.aXfrAct_Ins02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrAct_Ins02.up0());
		p.addUpBlock(aXfrAct_Ins02.up1());
		p.addUpBlock(aXfrAct_Ins02.up2());
		p.addDownBlock(aXfrAct_Ins02.down0());
		p.addDownBlock(aXfrAct_Ins02.down1());
	}

	protected void doXfrAct_Ins02() {
		aXfrAct_Ins02.call();
	};
	protected MSBEL_XfrActService.XfrAct_Del02 aXfrAct_Del02;

	protected void initXfrAct_Del02() {
		this.info = PDef.MS_MSBEL5220_XfrAct_Del02_INFO;
		this.aXfrAct_Del02 = ((MSBEL_XfrActService)this).new XfrAct_Del02();
	}

	public static MSBEL_XfrActService.XfrAct_Del02 crtXfrAct_Del02() {
		MSBEL_XfrActService lgc = new MSBEL_XfrActService();
		lgc.initXfrAct_Del02();
		return lgc.aXfrAct_Del02;
	}

	protected void paramXfrAct_Del02(MCParam p) {
		if (this.aXfrAct_Del02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrAct_Del02.up0());
		p.addUpBlock(aXfrAct_Del02.up1());
		p.addDownBlock(aXfrAct_Del02.down0());
	}

	protected void doXfrAct_Del02() {
		aXfrAct_Del02.call();
	};

	/**
	 * XfrActDel02ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR createXfrActDel02R(){
		return mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.create();
	}
	protected MSBEL_XfrActService.XfrAct_Upd01 aXfrAct_Upd01;

	protected void initXfrAct_Upd01() {
		this.info = PDef.MS_MSBEL5220_XfrAct_Upd01_INFO;
		this.aXfrAct_Upd01 = ((MSBEL_XfrActService)this).new XfrAct_Upd01();
	}

	public static MSBEL_XfrActService.XfrAct_Upd01 crtXfrAct_Upd01() {
		MSBEL_XfrActService lgc = new MSBEL_XfrActService();
		lgc.initXfrAct_Upd01();
		return lgc.aXfrAct_Upd01;
	}

	protected void paramXfrAct_Upd01(MCParam p) {
		if (this.aXfrAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrAct_Upd01.up0());
		p.addUpBlock(aXfrAct_Upd01.up1());
		p.addDownBlock(aXfrAct_Upd01.down0());
	}

	protected void doXfrAct_Upd01() {
		aXfrAct_Upd01.call();
	};

	/**
	 * XfrAct_HdrDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR createXfrAct_HdrDtlR(){
		return mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.create();
	}

	/**
	 * XfrAct_HdrDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> createXfrAct_HdrDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.class);
	}

	/**
	 * XfrAct_AggCndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR createXfrAct_AggCndR(){
		return mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR.create();
	}
	protected MSBEL_XfrActService.XfrAct_Ins01 aXfrAct_Ins01;

	protected void initXfrAct_Ins01() {
		this.info = PDef.MS_MSBEL5220_XfrAct_Ins01_INFO;
		this.aXfrAct_Ins01 = ((MSBEL_XfrActService)this).new XfrAct_Ins01();
	}

	public static MSBEL_XfrActService.XfrAct_Ins01 crtXfrAct_Ins01() {
		MSBEL_XfrActService lgc = new MSBEL_XfrActService();
		lgc.initXfrAct_Ins01();
		return lgc.aXfrAct_Ins01;
	}

	protected void paramXfrAct_Ins01(MCParam p) {
		if (this.aXfrAct_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrAct_Ins01.up0());
		p.addUpBlock(aXfrAct_Ins01.up1());
		p.addDownBlock(aXfrAct_Ins01.down0());
	}

	protected void doXfrAct_Ins01() {
		aXfrAct_Ins01.call();
	};
	protected MSBEL_XfrActService.XfrAct_Del01 aXfrAct_Del01;

	protected void initXfrAct_Del01() {
		this.info = PDef.MS_MSBEL5220_XfrAct_Del01_INFO;
		this.aXfrAct_Del01 = ((MSBEL_XfrActService)this).new XfrAct_Del01();
	}

	public static MSBEL_XfrActService.XfrAct_Del01 crtXfrAct_Del01() {
		MSBEL_XfrActService lgc = new MSBEL_XfrActService();
		lgc.initXfrAct_Del01();
		return lgc.aXfrAct_Del01;
	}

	protected void paramXfrAct_Del01(MCParam p) {
		if (this.aXfrAct_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrAct_Del01.up0());
		p.addUpBlock(aXfrAct_Del01.up1());
		p.addDownBlock(aXfrAct_Del01.down0());
	}

	protected void doXfrAct_Del01() {
		aXfrAct_Del01.call();
	};

	/**
	 * XfrActDel01ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR createXfrActDel01R(){
		return mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.create();
	}

	/**
	 * XfrActDel01ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> createXfrActDel01L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * XfrAct_Chk01オペレーション.<p>
	 *
	 * 移動実績が登録・更新可能かチェックする<br>
	 */
	abstract public class XfrAct_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrAct_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_DelDtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrAct_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrActChk_DelDtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR.class);

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
			invoke((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrActChk_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR createXfrActChk_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR.create();
		}

		/**
		 * XfrActChk_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR> createXfrActChk_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR.class);
		}

		/**
		 * XfrActChk_DelDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrActChk_DelDtlR createXfrActChk_DelDtlR(){
			return mcframe.serverMSBE.MSBEL5220.XfrActChk_DelDtlR.create();
		}

		/**
		 * XfrActChk_DelDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_DelDtlR> createXfrActChk_DelDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrActChk_DelDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_DelDtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this).info;
		}


	}
	/**
	 * XfrAct_Chk02オペレーション.<p>
	 *
	 * 移動実績が更新可能かチェックする<br>
	 */
	abstract public class XfrAct_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrAct_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrAct_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR.class);

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
			invoke((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrActChk_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR createXfrActChk_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR.create();
		}

		/**
		 * XfrActChk_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR> createXfrActChk_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrActChk_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this).info;
		}


	}
	/**
	 * XfrAct_Upd02オペレーション.<p>
	 *
	 * 移動実績のデータを更新・削除する。<br>
	 */
	abstract public class XfrAct_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrAct_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_CndR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR> down1;
		
		
		// コンストラクタ
		protected XfrAct_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.class);
			up2 = mcframe.serverMSBE.MSBEL5220.XfrAct_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * XfrAct_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR createXfrAct_HdrR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.create();
		}

		/**
		 * XfrAct_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR createXfrAct_DtlR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.create();
		}

		/**
		 * XfrAct_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR> createXfrAct_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.class);
		}

		/**
		 * XfrAct_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_CndR createXfrAct_CndR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xah.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sno1</td></tr>
		 * 	<tr><td><br></td><td>xad.sno2</td></tr>
		 * 	<tr><td><br></td><td>xad.sno3</td></tr>
		 * 	<tr><td><br></td><td>xad.sno4</td></tr>
		 * 	<tr><td><br></td><td>xad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xad.skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>xad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>xad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_CndR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_CndR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xah.dlv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this).info;
		}


	}
	/**
	 * XfrAct_Ins02オペレーション.<p>
	 *
	 * 移動実績にデータを追加する。<br>
	 */
	abstract public class XfrAct_Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrAct_Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_CndR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR> down1;
		
		
		// コンストラクタ
		protected XfrAct_Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.class);
			up2 = mcframe.serverMSBE.MSBEL5220.XfrAct_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * XfrAct_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR createXfrAct_HdrR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.create();
		}

		/**
		 * XfrAct_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR createXfrAct_DtlR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.create();
		}

		/**
		 * XfrAct_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR> createXfrAct_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.class);
		}

		/**
		 * XfrAct_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_CndR createXfrAct_CndR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xah.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xah.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sno1</td></tr>
		 * 	<tr><td><br></td><td>xad.sno2</td></tr>
		 * 	<tr><td><br></td><td>xad.sno3</td></tr>
		 * 	<tr><td><br></td><td>xad.sno4</td></tr>
		 * 	<tr><td><br></td><td>xad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xad.skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>xad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>xad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xad.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>xad.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.ext_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_CndR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_CndR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xah.dlv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this).info;
		}


	}
	/**
	 * XfrAct_Del02オペレーション.<p>
	 *
	 * 移動実績のデータを削除する。<br>
	 */
	abstract public class XfrAct_Del02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrAct_Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR down0;
		
		
		// コンストラクタ
		protected XfrAct_Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.create();
			up1 = mcframe.serverMSBE.MSBEL5220.XfrAct_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.create();

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
			invoke((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrActDel02ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR createXfrActDel02R(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.create();
		}

		/**
		 * XfrAct_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_CndR createXfrAct_CndR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_CndR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this).info;
		}


	}
	/**
	 * XfrAct_Upd01オペレーション.<p>
	 *
	 * 移動実績のデータを更新・削除する。<br>
	 */
	abstract public class XfrAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.class);

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
			invoke((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrAct_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR createXfrAct_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.create();
		}

		/**
		 * XfrAct_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> createXfrAct_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.class);
		}

		/**
		 * XfrAct_AggCndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR createXfrAct_AggCndR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xauh.xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xauh.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.xfr_dt</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xauh.immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>xauh.can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xaud.peg_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sno1</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sno2</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sno3</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sno4</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xaud.skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xaud.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>xaud.prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.ret_prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.ret_prov_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xauh.xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>xaud.peg_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.ret_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.pr_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this).info;
		}


	}
	/**
	 * XfrAct_Ins01オペレーション.<p>
	 *
	 * 移動実績にデータを追加する。<br>
	 */
	abstract public class XfrAct_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrAct_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrAct_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.class);

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
			invoke((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrAct_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR createXfrAct_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.create();
		}

		/**
		 * XfrAct_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> createXfrAct_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.class);
		}

		/**
		 * XfrAct_AggCndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR createXfrAct_AggCndR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xauh.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.xfr_dt</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xauh.immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>xaud.peg_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sno1</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sno2</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sno3</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sno4</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xaud.skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>xaud.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.ext_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>xaud.prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.ret_prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.ret_prov_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>agg_gi_loc_flg</td></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xauh.xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xauh.xah.dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>xaud.peg_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.xad.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.ret_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xaud.ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xaud.pr_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this).info;
		}


	}
	/**
	 * XfrAct_Del01オペレーション.<p>
	 *
	 * 移動実績のデータを削除する。<br>
	 */
	abstract public class XfrAct_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrAct_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrAct_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.class);

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
			invoke((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrActDel01ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR createXfrActDel01R(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.create();
		}

		/**
		 * XfrActDel01ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> createXfrActDel01L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR.class);
		}

		/**
		 * XfrAct_AggCndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR createXfrAct_AggCndR(){
			return mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xauh.xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xauh.immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>xauh.can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xaud.peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR
		 */
		public mcframe.serverMSBE.MSBEL5220.XfrAct_AggCndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xaud.peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5220.XfrAct_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrActService)MSBEL_XfrActService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}