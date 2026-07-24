package mcframe.serverMSBE.MSBEL5930;

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
 * "MSBEL_ArrActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ArrActService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5930";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ArrActService.ArrAct_Upd01 aArrAct_Upd01;

	protected void initArrAct_Upd01() {
		this.info = PDef.MS_MSBEL5930_ArrAct_Upd01_INFO;
		this.aArrAct_Upd01 = ((MSBEL_ArrActService)this).new ArrAct_Upd01();
	}

	public static MSBEL_ArrActService.ArrAct_Upd01 crtArrAct_Upd01() {
		MSBEL_ArrActService lgc = new MSBEL_ArrActService();
		lgc.initArrAct_Upd01();
		return lgc.aArrAct_Upd01;
	}

	protected void paramArrAct_Upd01(MCParam p) {
		if (this.aArrAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrAct_Upd01.up0());
		p.addUpBlock(aArrAct_Upd01.up1());
		p.addDownBlock(aArrAct_Upd01.down0());
	}

	protected void doArrAct_Upd01() {
		aArrAct_Upd01.call();
	};

	/**
	 * ArrAct_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5930.ArrAct_HdrR createArrAct_HdrR(){
		return mcframe.serverMSBE.MSBEL5930.ArrAct_HdrR.create();
	}

	/**
	 * ArrAct_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR createArrAct_DtlR(){
		return mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.create();
	}

	/**
	 * ArrAct_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> createArrAct_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);
	}
	protected MSBEL_ArrActService.ArrAct_Upd02 aArrAct_Upd02;

	protected void initArrAct_Upd02() {
		this.info = PDef.MS_MSBEL5930_ArrAct_Upd02_INFO;
		this.aArrAct_Upd02 = ((MSBEL_ArrActService)this).new ArrAct_Upd02();
	}

	public static MSBEL_ArrActService.ArrAct_Upd02 crtArrAct_Upd02() {
		MSBEL_ArrActService lgc = new MSBEL_ArrActService();
		lgc.initArrAct_Upd02();
		return lgc.aArrAct_Upd02;
	}

	protected void paramArrAct_Upd02(MCParam p) {
		if (this.aArrAct_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrAct_Upd02.up0());
	}

	protected void doArrAct_Upd02() {
		aArrAct_Upd02.call();
	};
	protected MSBEL_ArrActService.ArrAct_Upd03 aArrAct_Upd03;

	protected void initArrAct_Upd03() {
		this.info = PDef.MS_MSBEL5930_ArrAct_Upd03_INFO;
		this.aArrAct_Upd03 = ((MSBEL_ArrActService)this).new ArrAct_Upd03();
	}

	public static MSBEL_ArrActService.ArrAct_Upd03 crtArrAct_Upd03() {
		MSBEL_ArrActService lgc = new MSBEL_ArrActService();
		lgc.initArrAct_Upd03();
		return lgc.aArrAct_Upd03;
	}

	protected void paramArrAct_Upd03(MCParam p) {
		if (this.aArrAct_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrAct_Upd03.up0());
	}

	protected void doArrAct_Upd03() {
		aArrAct_Upd03.call();
	};
	protected MSBEL_ArrActService.ArrAct_Chk01 aArrAct_Chk01;

	protected void initArrAct_Chk01() {
		this.info = PDef.MS_MSBEL5930_ArrAct_Chk01_INFO;
		this.aArrAct_Chk01 = ((MSBEL_ArrActService)this).new ArrAct_Chk01();
	}

	public static MSBEL_ArrActService.ArrAct_Chk01 crtArrAct_Chk01() {
		MSBEL_ArrActService lgc = new MSBEL_ArrActService();
		lgc.initArrAct_Chk01();
		return lgc.aArrAct_Chk01;
	}

	protected void paramArrAct_Chk01(MCParam p) {
		if (this.aArrAct_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrAct_Chk01.up0());
		p.addUpBlock(aArrAct_Chk01.up1());
		p.addDownBlock(aArrAct_Chk01.down0());
	}

	protected void doArrAct_Chk01() {
		aArrAct_Chk01.call();
	};

	/**
	 * ArrAct_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5930.ArrAct_CtrlR createArrAct_CtrlR(){
		return mcframe.serverMSBE.MSBEL5930.ArrAct_CtrlR.create();
	}
	protected MSBEL_ArrActService.ArrAct_Chk03 aArrAct_Chk03;

	protected void initArrAct_Chk03() {
		this.info = PDef.MS_MSBEL5930_ArrAct_Chk03_INFO;
		this.aArrAct_Chk03 = ((MSBEL_ArrActService)this).new ArrAct_Chk03();
	}

	public static MSBEL_ArrActService.ArrAct_Chk03 crtArrAct_Chk03() {
		MSBEL_ArrActService lgc = new MSBEL_ArrActService();
		lgc.initArrAct_Chk03();
		return lgc.aArrAct_Chk03;
	}

	protected void paramArrAct_Chk03(MCParam p) {
		if (this.aArrAct_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrAct_Chk03.up0());
		p.addDownBlock(aArrAct_Chk03.down0());
	}

	protected void doArrAct_Chk03() {
		aArrAct_Chk03.call();
	};
	protected MSBEL_ArrActService.ArrAct_Srch01 aArrAct_Srch01;

	protected void initArrAct_Srch01() {
		this.info = PDef.MS_MSBEL5930_ArrAct_Srch01_INFO;
		this.aArrAct_Srch01 = ((MSBEL_ArrActService)this).new ArrAct_Srch01();
	}

	public static MSBEL_ArrActService.ArrAct_Srch01 crtArrAct_Srch01() {
		MSBEL_ArrActService lgc = new MSBEL_ArrActService();
		lgc.initArrAct_Srch01();
		return lgc.aArrAct_Srch01;
	}

	protected void paramArrAct_Srch01(MCParam p) {
		if (this.aArrAct_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrAct_Srch01.up0());
		p.addDownBlock(aArrAct_Srch01.down0());
	}

	protected void doArrAct_Srch01() {
		aArrAct_Srch01.call();
	};

	/**
	 * ArrAct_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR createArrAct_CndR(){
		return mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
	}

	/**
	 * ArrAct_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR createArrAct_RsltR(){
		return mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.create();
	}

	/**
	 * ArrAct_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> createArrAct_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);
	}
	protected MSBEL_ArrActService.ArrAct_Srch02 aArrAct_Srch02;

	protected void initArrAct_Srch02() {
		this.info = PDef.MS_MSBEL5930_ArrAct_Srch02_INFO;
		this.aArrAct_Srch02 = ((MSBEL_ArrActService)this).new ArrAct_Srch02();
	}

	public static MSBEL_ArrActService.ArrAct_Srch02 crtArrAct_Srch02() {
		MSBEL_ArrActService lgc = new MSBEL_ArrActService();
		lgc.initArrAct_Srch02();
		return lgc.aArrAct_Srch02;
	}

	protected void paramArrAct_Srch02(MCParam p) {
		if (this.aArrAct_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrAct_Srch02.up0());
		p.addDownBlock(aArrAct_Srch02.down0());
	}

	protected void doArrAct_Srch02() {
		aArrAct_Srch02.call();
	};
	protected MSBEL_ArrActService.ArrAct_Srch03 aArrAct_Srch03;

	protected void initArrAct_Srch03() {
		this.info = PDef.MS_MSBEL5930_ArrAct_Srch03_INFO;
		this.aArrAct_Srch03 = ((MSBEL_ArrActService)this).new ArrAct_Srch03();
	}

	public static MSBEL_ArrActService.ArrAct_Srch03 crtArrAct_Srch03() {
		MSBEL_ArrActService lgc = new MSBEL_ArrActService();
		lgc.initArrAct_Srch03();
		return lgc.aArrAct_Srch03;
	}

	protected void paramArrAct_Srch03(MCParam p) {
		if (this.aArrAct_Srch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrAct_Srch03.up0());
		p.addDownBlock(aArrAct_Srch03.down0());
	}

	protected void doArrAct_Srch03() {
		aArrAct_Srch03.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ArrAct_Upd01オペレーション.<p>
	 *
	 * 入荷予定から入荷実績および各実績を登録する。<br>
	 */
	abstract public class ArrAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5930.ArrAct_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> down0;
		
		
		// コンストラクタ
		protected ArrAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5930.ArrAct_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);

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
			invoke((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrAct_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_HdrR createArrAct_HdrR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_HdrR.create();
		}

		/**
		 * ArrAct_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR createArrAct_DtlR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.create();
		}

		/**
		 * ArrAct_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> createArrAct_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_act_flg</td></tr>
		 * 	<tr><td><br></td><td>io_act_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5930.ArrAct_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_HdrR up0() {
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
		 * 	<tr><td><br></td><td>arr_act.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ver_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_tm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>temp_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this).info;
		}


	}
	/**
	 * ArrAct_Upd02オペレーション.<p>
	 *
	 * 現品票発行済フラグをオン(発行済)に更新する。<br>
	 */
	abstract public class ArrAct_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrAct_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR up0;
		
		
		// コンストラクタ
		protected ArrAct_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.create();

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
			invoke((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ArrAct_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR createArrAct_DtlR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_act_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this).info;
		}


	}
	/**
	 * ArrAct_Upd03オペレーション.<p>
	 *
	 * 仕入実績受払に対応する入荷実績を更新する。<br>
	 */
	abstract public class ArrAct_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrAct_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> up0;
		
		
		// コンストラクタ
		protected ArrAct_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);

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
			invoke((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ArrAct_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR createArrAct_DtlR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.create();
		}

		/**
		 * ArrAct_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> createArrAct_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_act_io_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this).info;
		}


	}
	/**
	 * ArrAct_Chk01オペレーション.<p>
	 *
	 * 登録前のチェック処理を実行する。<br>
	 */
	abstract public class ArrAct_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrAct_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5930.ArrAct_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> down0;
		
		
		// コンストラクタ
		protected ArrAct_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5930.ArrAct_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);

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
			invoke((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrAct_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR createArrAct_DtlR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.create();
		}

		/**
		 * ArrAct_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> createArrAct_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);
		}

		/**
		 * ArrAct_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CtrlR createArrAct_CtrlR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_CtrlR.create();
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
		 * 	<tr><td><br></td><td>arr_act.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_act.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ver_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_tm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>temp_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_act_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>file_imp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5930.ArrAct_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CtrlR up1() {
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
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this).info;
		}


	}
	/**
	 * ArrAct_Chk03オペレーション.<p>
	 *
	 * 更新（未着品入荷）前のチェック処理を実行する<br>
	 */
	abstract public class ArrAct_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrAct_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> down0;
		
		
		// コンストラクタ
		protected ArrAct_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);

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
			invoke((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrAct_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR createArrAct_DtlR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.create();
		}

		/**
		 * ArrAct_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> createArrAct_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_act_io_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> up0() {
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
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this).info;
		}


	}
	/**
	 * ArrAct_Srch01オペレーション.<p>
	 *
	 * 未入荷、一部入荷の入荷予定を検索する。<br>
	 */
	abstract public class ArrAct_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrAct_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0;
		
		
		// コンストラクタ
		protected ArrAct_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);

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
			invoke((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrAct_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR createArrAct_CndR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
		}

		/**
		 * ArrAct_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR createArrAct_RsltR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.create();
		}

		/**
		 * ArrAct_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> createArrAct_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>not_wms_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_loc_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_fr</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_to</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5930.ArrAct_CndR
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pr_rate</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_use_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>split_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_ex_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_qty</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this).info;
		}


	}
	/**
	 * ArrAct_Srch02オペレーション.<p>
	 *
	 * 一部入荷、全数入荷の入荷実績を検索する。<br>
	 */
	abstract public class ArrAct_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrAct_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0;
		
		
		// コンストラクタ
		protected ArrAct_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);

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
			invoke((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrAct_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR createArrAct_CndR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
		}

		/**
		 * ArrAct_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR createArrAct_RsltR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.create();
		}

		/**
		 * ArrAct_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> createArrAct_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_done_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_done_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>not_wms_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_loc_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_fr</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_to</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_slip_prnt_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_slip_prnt_done_flg</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5930.ArrAct_CndR
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>arr_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pr_rate</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_use_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>split_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_temp_ent_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_ex_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this).info;
		}


	}
	/**
	 * ArrAct_Srch03オペレーション.<p>
	 *
	 * 未入荷、一部入荷の入荷予定、および一部入荷、全数入荷の入荷実績を検索する。<br>
	 */
	abstract public class ArrAct_Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrAct_Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0;
		
		
		// コンストラクタ
		protected ArrAct_Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);

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
			invoke((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrAct_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR createArrAct_CndR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_CndR.create();
		}

		/**
		 * ArrAct_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR createArrAct_RsltR(){
			return mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.create();
		}

		/**
		 * ArrAct_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> createArrAct_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prov_arrv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_done_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_done_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>not_wms_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_loc_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_fr</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_to</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_slip_prnt_yet_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_slip_prnt_done_flg</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5930.ArrAct_CndR
		 */
		public mcframe.serverMSBE.MSBEL5930.ArrAct_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_site_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_site_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>arr_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pr_rate</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_use_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>split_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_temp_ent_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_ex_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no1</td></tr>
		 * 	<tr><td><br></td><td>prov_src_schd_no2</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_src_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>po_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>po_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sret_fr_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>prsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5930.ArrAct_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActService)MSBEL_ArrActService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}