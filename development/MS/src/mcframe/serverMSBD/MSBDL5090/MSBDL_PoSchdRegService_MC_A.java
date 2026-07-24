package mcframe.serverMSBD.MSBDL5090;

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
 * "MSBDL_PoSchdRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PoSchdRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDL5090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PoSchdRegService.PoSchd_Upd01 aPoSchd_Upd01;

	protected void initPoSchd_Upd01() {
		this.info = PDef.MS_MSBDL5090_PoSchd_Upd01_INFO;
		this.aPoSchd_Upd01 = ((MSBDL_PoSchdRegService)this).new PoSchd_Upd01();
	}

	public static MSBDL_PoSchdRegService.PoSchd_Upd01 crtPoSchd_Upd01() {
		MSBDL_PoSchdRegService lgc = new MSBDL_PoSchdRegService();
		lgc.initPoSchd_Upd01();
		return lgc.aPoSchd_Upd01;
	}

	protected void paramPoSchd_Upd01(MCParam p) {
		if (this.aPoSchd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoSchd_Upd01.up0());
		p.addDownBlock(aPoSchd_Upd01.down0());
	}

	protected void doPoSchd_Upd01() {
		aPoSchd_Upd01.call();
	};

	/**
	 * PoSchd_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR createPoSchd_Upd01_DtlR(){
		return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.create();
	}

	/**
	 * PoSchd_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> createPoSchd_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.class);
	}
	protected MSBDL_PoSchdRegService.PoSchd_Upd02 aPoSchd_Upd02;

	protected void initPoSchd_Upd02() {
		this.info = PDef.MS_MSBDL5090_PoSchd_Upd02_INFO;
		this.aPoSchd_Upd02 = ((MSBDL_PoSchdRegService)this).new PoSchd_Upd02();
	}

	public static MSBDL_PoSchdRegService.PoSchd_Upd02 crtPoSchd_Upd02() {
		MSBDL_PoSchdRegService lgc = new MSBDL_PoSchdRegService();
		lgc.initPoSchd_Upd02();
		return lgc.aPoSchd_Upd02;
	}

	protected void paramPoSchd_Upd02(MCParam p) {
		if (this.aPoSchd_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoSchd_Upd02.up0());
		p.addDownBlock(aPoSchd_Upd02.down0());
	}

	protected void doPoSchd_Upd02() {
		aPoSchd_Upd02.call();
	};

	/**
	 * PoSchd_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR createPoSchd_Upd02_DtlR(){
		return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR.create();
	}

	/**
	 * PoSchd_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR> createPoSchd_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR.class);
	}
	protected MSBDL_PoSchdRegService.PoSchd_Upd03 aPoSchd_Upd03;

	protected void initPoSchd_Upd03() {
		this.info = PDef.MS_MSBDL5090_PoSchd_Upd03_INFO;
		this.aPoSchd_Upd03 = ((MSBDL_PoSchdRegService)this).new PoSchd_Upd03();
	}

	public static MSBDL_PoSchdRegService.PoSchd_Upd03 crtPoSchd_Upd03() {
		MSBDL_PoSchdRegService lgc = new MSBDL_PoSchdRegService();
		lgc.initPoSchd_Upd03();
		return lgc.aPoSchd_Upd03;
	}

	protected void paramPoSchd_Upd03(MCParam p) {
		if (this.aPoSchd_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoSchd_Upd03.up0());
		p.addUpBlock(aPoSchd_Upd03.up1());
		p.addDownBlock(aPoSchd_Upd03.down0());
	}

	protected void doPoSchd_Upd03() {
		aPoSchd_Upd03.call();
	};

	/**
	 * PoSchd_Upd03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR createPoSchd_Upd03_HdrR(){
		return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR.create();
	}

	/**
	 * PoSchd_Upd03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR> createPoSchd_Upd03_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR.class);
	}

	/**
	 * PoSchd_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR createPoSchd_Upd03_DtlR(){
		return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR.create();
	}

	/**
	 * PoSchd_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR> createPoSchd_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR.class);
	}
	protected MSBDL_PoSchdRegService.PoSchd_Upd04 aPoSchd_Upd04;

	protected void initPoSchd_Upd04() {
		this.info = PDef.MS_MSBDL5090_PoSchd_Upd04_INFO;
		this.aPoSchd_Upd04 = ((MSBDL_PoSchdRegService)this).new PoSchd_Upd04();
	}

	public static MSBDL_PoSchdRegService.PoSchd_Upd04 crtPoSchd_Upd04() {
		MSBDL_PoSchdRegService lgc = new MSBDL_PoSchdRegService();
		lgc.initPoSchd_Upd04();
		return lgc.aPoSchd_Upd04;
	}

	protected void paramPoSchd_Upd04(MCParam p) {
		if (this.aPoSchd_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoSchd_Upd04.up0());
	}

	protected void doPoSchd_Upd04() {
		aPoSchd_Upd04.call();
	};

	/**
	 * PoSchd_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR createPoSchd_Upd04_DtlR(){
		return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR.create();
	}

	/**
	 * PoSchd_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR> createPoSchd_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR.class);
	}
	protected MSBDL_PoSchdRegService.PoSchd_Chk01 aPoSchd_Chk01;

	protected void initPoSchd_Chk01() {
		this.info = PDef.MS_MSBDL5090_PoSchd_Chk01_INFO;
		this.aPoSchd_Chk01 = ((MSBDL_PoSchdRegService)this).new PoSchd_Chk01();
	}

	public static MSBDL_PoSchdRegService.PoSchd_Chk01 crtPoSchd_Chk01() {
		MSBDL_PoSchdRegService lgc = new MSBDL_PoSchdRegService();
		lgc.initPoSchd_Chk01();
		return lgc.aPoSchd_Chk01;
	}

	protected void paramPoSchd_Chk01(MCParam p) {
		if (this.aPoSchd_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoSchd_Chk01.up0());
		p.addDownBlock(aPoSchd_Chk01.down0());
	}

	protected void doPoSchd_Chk01() {
		aPoSchd_Chk01.call();
	};

	/**
	 * PoSchd_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR createPoSchd_Chk01_DtlR(){
		return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.create();
	}

	/**
	 * PoSchd_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> createPoSchd_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.class);
	}
	protected MSBDL_PoSchdRegService.PoSchd_Chk02 aPoSchd_Chk02;

	protected void initPoSchd_Chk02() {
		this.info = PDef.MS_MSBDL5090_PoSchd_Chk02_INFO;
		this.aPoSchd_Chk02 = ((MSBDL_PoSchdRegService)this).new PoSchd_Chk02();
	}

	public static MSBDL_PoSchdRegService.PoSchd_Chk02 crtPoSchd_Chk02() {
		MSBDL_PoSchdRegService lgc = new MSBDL_PoSchdRegService();
		lgc.initPoSchd_Chk02();
		return lgc.aPoSchd_Chk02;
	}

	protected void paramPoSchd_Chk02(MCParam p) {
		if (this.aPoSchd_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoSchd_Chk02.up0());
		p.addDownBlock(aPoSchd_Chk02.down0());
	}

	protected void doPoSchd_Chk02() {
		aPoSchd_Chk02.call();
	};

	/**
	 * PoSchd_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR createPoSchd_Chk02_DtlR(){
		return mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR.create();
	}

	/**
	 * PoSchd_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR> createPoSchd_Chk02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PoSchd_Upd01オペレーション.<p>
	 *
	 * 発注予定を登録・訂正・取消する。<br>
	 */
	abstract public class PoSchd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoSchd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> down0;
		
		
		// コンストラクタ
		protected PoSchd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.class);

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
			invoke((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PoSchd_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR createPoSchd_Upd01_DtlR(){
			return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.create();
		}

		/**
		 * PoSchd_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> createPoSchd_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.class);
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
		 * 	<tr><td><br></td><td>fr_pnl_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.ver_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sno1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sno2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sno3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sno4</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>po_schd.reg_dt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.pln_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>po_schd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.xrate</td></tr>
		 * 	<tr><td><br></td><td>po_schd.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>po_schd.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_avl_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_upd_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_crrct_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.outsrc_itm_ord_crt_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.split_src_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.base_unit_po_qty</td></tr>
		 * 	<tr><td><br></td><td>po_schd.slo_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.add_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_fr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cred_no_up_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PoSchd_Upd02オペレーション.<p>
	 *
	 * 発注状況を更新する。<br>
	 */
	abstract public class PoSchd_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoSchd_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR> down0;
		
		
		// コンストラクタ
		protected PoSchd_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR.class);

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
			invoke((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PoSchd_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR createPoSchd_Upd02_DtlR(){
			return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR.create();
		}

		/**
		 * PoSchd_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR> createPoSchd_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.base_unit_po_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_schd.io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PoSchd_Upd03オペレーション.<p>
	 *
	 * 発注予定の分割・分割取消をする。<br>
	 */
	abstract public class PoSchd_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoSchd_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR> down0;
		
		
		// コンストラクタ
		protected PoSchd_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR.class);

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
			invoke((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PoSchd_Upd03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR createPoSchd_Upd03_HdrR(){
			return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR.create();
		}

		/**
		 * PoSchd_Upd03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR> createPoSchd_Upd03_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR.class);
		}

		/**
		 * PoSchd_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR createPoSchd_Upd03_DtlR(){
			return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR.create();
		}

		/**
		 * PoSchd_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR> createPoSchd_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>po_schd.pln_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.split_src_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_HdrR> up0() {
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
		 * 	<tr><td><br></td><td>po_schd.po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.ver_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sno1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sno2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sno3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sno4</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>po_schd.reg_dt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.outsrc_itm_ord_crt_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.pln_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>po_schd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.xrate</td></tr>
		 * 	<tr><td><br></td><td>po_schd.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>po_schd.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_avl_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>po_schd.drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_chg_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_upd_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_crrct_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.split_src_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.add_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_schd.slo_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_fr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_fr_usr_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd03_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PoSchd_Upd04オペレーション.<p>
	 *
	 * 依頼元訂正ＦＬＧを更新する。<br>
	 */
	abstract public class PoSchd_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoSchd_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR> up0;
		
		
		// コンストラクタ
		protected PoSchd_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR.class);

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
			invoke((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PoSchd_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR createPoSchd_Upd04_DtlR(){
			return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR.create();
		}

		/**
		 * PoSchd_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR> createPoSchd_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>only_own_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_crrct_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_can_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd04_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PoSchd_Chk01オペレーション.<p>
	 *
	 * 発注予定を登録・訂正・取消する。<br>
	 */
	abstract public class PoSchd_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoSchd_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> down0;
		
		
		// コンストラクタ
		protected PoSchd_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.class);

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
			invoke((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PoSchd_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR createPoSchd_Chk01_DtlR(){
			return mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.create();
		}

		/**
		 * PoSchd_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> createPoSchd_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR.class);
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
		 * 	<tr><td><br></td><td>fr_mfg_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd.rqst_crrct_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>po_schd.itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> up0() {
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
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_flg</td></tr>
		 * 	<tr><td><br></td><td>act_flg</td></tr>
		 * 	<tr><td><br></td><td>fr_mfg_inst_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PoSchd_Chk02オペレーション.<p>
	 *
	 * 分割処理前チェック<br>
	 */
	abstract public class PoSchd_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoSchd_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected PoSchd_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR.class);

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
			invoke((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PoSchd_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR createPoSchd_Chk02_DtlR(){
			return mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR.create();
		}

		/**
		 * PoSchd_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR> createPoSchd_Chk02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd.po_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR> up0() {
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
		public MCList<mcframe.serverMSBD.MSBDL5090.PoSchd_Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PoSchdRegService)MSBDL_PoSchdRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}