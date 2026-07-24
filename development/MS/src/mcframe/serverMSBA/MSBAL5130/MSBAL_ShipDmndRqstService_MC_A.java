package mcframe.serverMSBA.MSBAL5130;

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
 * "MSBAL_ShipDmndRqstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBAL_ShipDmndRqstService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBAL5130";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBAL_ShipDmndRqstService.ShipDmndRqst_Chk01 aShipDmndRqst_Chk01;

	protected void initShipDmndRqst_Chk01() {
		this.info = PDef.MS_MSBAL5130_ShipDmndRqst_Chk01_INFO;
		this.aShipDmndRqst_Chk01 = ((MSBAL_ShipDmndRqstService)this).new ShipDmndRqst_Chk01();
	}

	public static MSBAL_ShipDmndRqstService.ShipDmndRqst_Chk01 crtShipDmndRqst_Chk01() {
		MSBAL_ShipDmndRqstService lgc = new MSBAL_ShipDmndRqstService();
		lgc.initShipDmndRqst_Chk01();
		return lgc.aShipDmndRqst_Chk01;
	}

	protected void paramShipDmndRqst_Chk01(MCParam p) {
		if (this.aShipDmndRqst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipDmndRqst_Chk01.up0());
		p.addDownBlock(aShipDmndRqst_Chk01.down0());
	}

	protected void doShipDmndRqst_Chk01() {
		aShipDmndRqst_Chk01.call();
	};

	/**
	 * ShipDmndRqst_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR createShipDmndRqst_Chk01_DtlR(){
		return mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR.create();
	}

	/**
	 * ShipDmndRqst_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR> createShipDmndRqst_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR.class);
	}
	protected MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd01 aShipDmndRqst_Upd01;

	protected void initShipDmndRqst_Upd01() {
		this.info = PDef.MS_MSBAL5130_ShipDmndRqst_Upd01_INFO;
		this.aShipDmndRqst_Upd01 = ((MSBAL_ShipDmndRqstService)this).new ShipDmndRqst_Upd01();
	}

	public static MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd01 crtShipDmndRqst_Upd01() {
		MSBAL_ShipDmndRqstService lgc = new MSBAL_ShipDmndRqstService();
		lgc.initShipDmndRqst_Upd01();
		return lgc.aShipDmndRqst_Upd01;
	}

	protected void paramShipDmndRqst_Upd01(MCParam p) {
		if (this.aShipDmndRqst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipDmndRqst_Upd01.up0());
		p.addDownBlock(aShipDmndRqst_Upd01.down0());
	}

	protected void doShipDmndRqst_Upd01() {
		aShipDmndRqst_Upd01.call();
	};

	/**
	 * ShipDmndRqst_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR createShipDmndRqst_Upd01_DtlR(){
		return mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.create();
	}

	/**
	 * ShipDmndRqst_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> createShipDmndRqst_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.class);
	}
	protected MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd02 aShipDmndRqst_Upd02;

	protected void initShipDmndRqst_Upd02() {
		this.info = PDef.MS_MSBAL5130_ShipDmndRqst_Upd02_INFO;
		this.aShipDmndRqst_Upd02 = ((MSBAL_ShipDmndRqstService)this).new ShipDmndRqst_Upd02();
	}

	public static MSBAL_ShipDmndRqstService.ShipDmndRqst_Upd02 crtShipDmndRqst_Upd02() {
		MSBAL_ShipDmndRqstService lgc = new MSBAL_ShipDmndRqstService();
		lgc.initShipDmndRqst_Upd02();
		return lgc.aShipDmndRqst_Upd02;
	}

	protected void paramShipDmndRqst_Upd02(MCParam p) {
		if (this.aShipDmndRqst_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipDmndRqst_Upd02.up0());
		p.addDownBlock(aShipDmndRqst_Upd02.down0());
	}

	protected void doShipDmndRqst_Upd02() {
		aShipDmndRqst_Upd02.call();
	};

	/**
	 * ShipDmndRqst_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR createShipDmndRqst_Upd02_DtlR(){
		return mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.create();
	}

	/**
	 * ShipDmndRqst_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> createShipDmndRqst_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipDmndRqst_Chk01オペレーション.<p>
	 *
	 * 登録前のチェックを行う。<br>
	 */
	abstract public class ShipDmndRqst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipDmndRqst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipDmndRqst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR.class);

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
			invoke((MSBAL_ShipDmndRqstService)MSBAL_ShipDmndRqstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipDmndRqst_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR createShipDmndRqst_Chk01_DtlR(){
			return mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR.create();
		}

		/**
		 * ShipDmndRqst_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR> createShipDmndRqst_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>upd_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_can_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_no_up_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR> up0() {
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
		 * 	<tr><td><br></td><td>inst_po_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_ShipDmndRqstService)MSBAL_ShipDmndRqstService_MC_A.this).info;
		}


	}
	/**
	 * ShipDmndRqst_Upd01オペレーション.<p>
	 *
	 * 発注予定、移動・移送予定を登録するか、ＷＧ間依頼を登録するか制御する。<br>
	 */
	abstract public class ShipDmndRqst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipDmndRqst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipDmndRqst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.class);

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
			invoke((MSBAL_ShipDmndRqstService)MSBAL_ShipDmndRqstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipDmndRqst_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR createShipDmndRqst_Upd01_DtlR(){
			return mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.create();
		}

		/**
		 * ShipDmndRqst_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> createShipDmndRqst_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_po_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>comp_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_can_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_no_up_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>uplnd_outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_ShipDmndRqstService)MSBAL_ShipDmndRqstService_MC_A.this).info;
		}


	}
	/**
	 * ShipDmndRqst_Upd02オペレーション.<p>
	 *
	 * 発注予定、移動・移送予定を登録・訂正・削除する。<br>
	 */
	abstract public class ShipDmndRqst_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipDmndRqst_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipDmndRqst_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.class);

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
			invoke((MSBAL_ShipDmndRqstService)MSBAL_ShipDmndRqstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipDmndRqst_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR createShipDmndRqst_Upd02_DtlR(){
			return mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.create();
		}

		/**
		 * ShipDmndRqst_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> createShipDmndRqst_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_po_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>comp_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_no_up_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL5130.ShipDmndRqst_Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_ShipDmndRqstService)MSBAL_ShipDmndRqstService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}