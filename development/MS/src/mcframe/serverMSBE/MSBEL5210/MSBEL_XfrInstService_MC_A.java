package mcframe.serverMSBE.MSBEL5210;

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
 * "MSBEL_XfrInstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_XfrInstService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_XfrInstService.XfrInst_Chk01 aXfrInst_Chk01;

	protected void initXfrInst_Chk01() {
		this.info = PDef.MS_MSBEL5210_XfrInst_Chk01_INFO;
		this.aXfrInst_Chk01 = ((MSBEL_XfrInstService)this).new XfrInst_Chk01();
	}

	public static MSBEL_XfrInstService.XfrInst_Chk01 crtXfrInst_Chk01() {
		MSBEL_XfrInstService lgc = new MSBEL_XfrInstService();
		lgc.initXfrInst_Chk01();
		return lgc.aXfrInst_Chk01;
	}

	protected void paramXfrInst_Chk01(MCParam p) {
		if (this.aXfrInst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrInst_Chk01.up0());
		p.addDownBlock(aXfrInst_Chk01.down0());
	}

	protected void doXfrInst_Chk01() {
		aXfrInst_Chk01.call();
	};

	/**
	 * XfrInstChk_HdrDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR createXfrInstChk_HdrDtlR(){
		return mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.create();
	}

	/**
	 * XfrInstChk_HdrDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> createXfrInstChk_HdrDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.class);
	}
	protected MSBEL_XfrInstService.XfrInst_Chk02 aXfrInst_Chk02;

	protected void initXfrInst_Chk02() {
		this.info = PDef.MS_MSBEL5210_XfrInst_Chk02_INFO;
		this.aXfrInst_Chk02 = ((MSBEL_XfrInstService)this).new XfrInst_Chk02();
	}

	public static MSBEL_XfrInstService.XfrInst_Chk02 crtXfrInst_Chk02() {
		MSBEL_XfrInstService lgc = new MSBEL_XfrInstService();
		lgc.initXfrInst_Chk02();
		return lgc.aXfrInst_Chk02;
	}

	protected void paramXfrInst_Chk02(MCParam p) {
		if (this.aXfrInst_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrInst_Chk02.up0());
		p.addDownBlock(aXfrInst_Chk02.down0());
	}

	protected void doXfrInst_Chk02() {
		aXfrInst_Chk02.call();
	};
	protected MSBEL_XfrInstService.XfrInst_Chk03 aXfrInst_Chk03;

	protected void initXfrInst_Chk03() {
		this.info = PDef.MS_MSBEL5210_XfrInst_Chk03_INFO;
		this.aXfrInst_Chk03 = ((MSBEL_XfrInstService)this).new XfrInst_Chk03();
	}

	public static MSBEL_XfrInstService.XfrInst_Chk03 crtXfrInst_Chk03() {
		MSBEL_XfrInstService lgc = new MSBEL_XfrInstService();
		lgc.initXfrInst_Chk03();
		return lgc.aXfrInst_Chk03;
	}

	protected void paramXfrInst_Chk03(MCParam p) {
		if (this.aXfrInst_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrInst_Chk03.up0());
		p.addDownBlock(aXfrInst_Chk03.down0());
	}

	protected void doXfrInst_Chk03() {
		aXfrInst_Chk03.call();
	};
	protected MSBEL_XfrInstService.XfrInst_Upd02 aXfrInst_Upd02;

	protected void initXfrInst_Upd02() {
		this.info = PDef.MS_MSBEL5210_XfrInst_Upd02_INFO;
		this.aXfrInst_Upd02 = ((MSBEL_XfrInstService)this).new XfrInst_Upd02();
	}

	public static MSBEL_XfrInstService.XfrInst_Upd02 crtXfrInst_Upd02() {
		MSBEL_XfrInstService lgc = new MSBEL_XfrInstService();
		lgc.initXfrInst_Upd02();
		return lgc.aXfrInst_Upd02;
	}

	protected void paramXfrInst_Upd02(MCParam p) {
		if (this.aXfrInst_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrInst_Upd02.up0());
		p.addUpBlock(aXfrInst_Upd02.up1());
		p.addUpBlock(aXfrInst_Upd02.up2());
		p.addDownBlock(aXfrInst_Upd02.down0());
		p.addDownBlock(aXfrInst_Upd02.down1());
	}

	protected void doXfrInst_Upd02() {
		aXfrInst_Upd02.call();
	};

	/**
	 * XfrInst_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR createXfrInst_HdrR(){
		return mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.create();
	}

	/**
	 * XfrInst_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR createXfrInst_DtlR(){
		return mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.create();
	}

	/**
	 * XfrInst_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> createXfrInst_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.class);
	}

	/**
	 * XfrInst_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5210.XfrInst_CndR createXfrInst_CndR(){
		return mcframe.serverMSBE.MSBEL5210.XfrInst_CndR.create();
	}
	protected MSBEL_XfrInstService.XfrInst_Ins02 aXfrInst_Ins02;

	protected void initXfrInst_Ins02() {
		this.info = PDef.MS_MSBEL5210_XfrInst_Ins02_INFO;
		this.aXfrInst_Ins02 = ((MSBEL_XfrInstService)this).new XfrInst_Ins02();
	}

	public static MSBEL_XfrInstService.XfrInst_Ins02 crtXfrInst_Ins02() {
		MSBEL_XfrInstService lgc = new MSBEL_XfrInstService();
		lgc.initXfrInst_Ins02();
		return lgc.aXfrInst_Ins02;
	}

	protected void paramXfrInst_Ins02(MCParam p) {
		if (this.aXfrInst_Ins02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrInst_Ins02.up0());
		p.addUpBlock(aXfrInst_Ins02.up1());
		p.addUpBlock(aXfrInst_Ins02.up2());
		p.addDownBlock(aXfrInst_Ins02.down0());
		p.addDownBlock(aXfrInst_Ins02.down1());
	}

	protected void doXfrInst_Ins02() {
		aXfrInst_Ins02.call();
	};
	protected MSBEL_XfrInstService.XfrInst_Del02 aXfrInst_Del02;

	protected void initXfrInst_Del02() {
		this.info = PDef.MS_MSBEL5210_XfrInst_Del02_INFO;
		this.aXfrInst_Del02 = ((MSBEL_XfrInstService)this).new XfrInst_Del02();
	}

	public static MSBEL_XfrInstService.XfrInst_Del02 crtXfrInst_Del02() {
		MSBEL_XfrInstService lgc = new MSBEL_XfrInstService();
		lgc.initXfrInst_Del02();
		return lgc.aXfrInst_Del02;
	}

	protected void paramXfrInst_Del02(MCParam p) {
		if (this.aXfrInst_Del02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrInst_Del02.up0());
		p.addUpBlock(aXfrInst_Del02.up1());
		p.addUpBlock(aXfrInst_Del02.up2());
	}

	protected void doXfrInst_Del02() {
		aXfrInst_Del02.call();
	};
	protected MSBEL_XfrInstService.XfrInst_Upd01 aXfrInst_Upd01;

	protected void initXfrInst_Upd01() {
		this.info = PDef.MS_MSBEL5210_XfrInst_Upd01_INFO;
		this.aXfrInst_Upd01 = ((MSBEL_XfrInstService)this).new XfrInst_Upd01();
	}

	public static MSBEL_XfrInstService.XfrInst_Upd01 crtXfrInst_Upd01() {
		MSBEL_XfrInstService lgc = new MSBEL_XfrInstService();
		lgc.initXfrInst_Upd01();
		return lgc.aXfrInst_Upd01;
	}

	protected void paramXfrInst_Upd01(MCParam p) {
		if (this.aXfrInst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrInst_Upd01.up0());
		p.addUpBlock(aXfrInst_Upd01.up1());
		p.addDownBlock(aXfrInst_Upd01.down0());
	}

	protected void doXfrInst_Upd01() {
		aXfrInst_Upd01.call();
	};

	/**
	 * XfrInst_HdrDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR createXfrInst_HdrDtlR(){
		return mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.create();
	}

	/**
	 * XfrInst_HdrDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> createXfrInst_HdrDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.class);
	}

	/**
	 * XfrInst_AggCndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR createXfrInst_AggCndR(){
		return mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR.create();
	}
	protected MSBEL_XfrInstService.XfrInst_Ins01 aXfrInst_Ins01;

	protected void initXfrInst_Ins01() {
		this.info = PDef.MS_MSBEL5210_XfrInst_Ins01_INFO;
		this.aXfrInst_Ins01 = ((MSBEL_XfrInstService)this).new XfrInst_Ins01();
	}

	public static MSBEL_XfrInstService.XfrInst_Ins01 crtXfrInst_Ins01() {
		MSBEL_XfrInstService lgc = new MSBEL_XfrInstService();
		lgc.initXfrInst_Ins01();
		return lgc.aXfrInst_Ins01;
	}

	protected void paramXfrInst_Ins01(MCParam p) {
		if (this.aXfrInst_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrInst_Ins01.up0());
		p.addUpBlock(aXfrInst_Ins01.up1());
		p.addDownBlock(aXfrInst_Ins01.down0());
	}

	protected void doXfrInst_Ins01() {
		aXfrInst_Ins01.call();
	};
	protected MSBEL_XfrInstService.XfrInst_Del01 aXfrInst_Del01;

	protected void initXfrInst_Del01() {
		this.info = PDef.MS_MSBEL5210_XfrInst_Del01_INFO;
		this.aXfrInst_Del01 = ((MSBEL_XfrInstService)this).new XfrInst_Del01();
	}

	public static MSBEL_XfrInstService.XfrInst_Del01 crtXfrInst_Del01() {
		MSBEL_XfrInstService lgc = new MSBEL_XfrInstService();
		lgc.initXfrInst_Del01();
		return lgc.aXfrInst_Del01;
	}

	protected void paramXfrInst_Del01(MCParam p) {
		if (this.aXfrInst_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrInst_Del01.up0());
		p.addUpBlock(aXfrInst_Del01.up1());
		p.addDownBlock(aXfrInst_Del01.down0());
	}

	protected void doXfrInst_Del01() {
		aXfrInst_Del01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * XfrInst_Chk01オペレーション.<p>
	 *
	 * 移動指図が登録可能かチェックする<br>
	 */
	abstract public class XfrInst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrInst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrInst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.class);

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
			invoke((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrInstChk_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR createXfrInstChk_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.create();
		}

		/**
		 * XfrInstChk_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> createXfrInstChk_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.class);
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
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
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
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>old_xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>inst_rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> up0() {
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
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this).info;
		}


	}
	/**
	 * XfrInst_Chk02オペレーション.<p>
	 *
	 * 移動指図が更新可能かチェックする<br>
	 */
	abstract public class XfrInst_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrInst_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrInst_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.class);

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
			invoke((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrInstChk_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR createXfrInstChk_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.create();
		}

		/**
		 * XfrInstChk_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> createXfrInstChk_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.class);
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
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
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
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>old_xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>inst_rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> up0() {
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
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this).info;
		}


	}
	/**
	 * XfrInst_Chk03オペレーション.<p>
	 *
	 * 移動指図が取消可能かチェックする<br>
	 */
	abstract public class XfrInst_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrInst_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrInst_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.class);

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
			invoke((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrInstChk_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR createXfrInstChk_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.create();
		}

		/**
		 * XfrInstChk_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> createXfrInstChk_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> up0() {
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
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInstChk_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this).info;
		}


	}
	/**
	 * XfrInst_Upd02オペレーション.<p>
	 *
	 * 移動指図のデータを更新・削除する。<br>
	 */
	abstract public class XfrInst_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrInst_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5210.XfrInst_CndR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> down1;
		
		
		// コンストラクタ
		protected XfrInst_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.class);
			up2 = mcframe.serverMSBE.MSBEL5210.XfrInst_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.class);

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
			invoke((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * XfrInst_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR createXfrInst_HdrR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.create();
		}

		/**
		 * XfrInst_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR createXfrInst_DtlR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.create();
		}

		/**
		 * XfrInst_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> createXfrInst_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.class);
		}

		/**
		 * XfrInst_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_CndR createXfrInst_CndR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xih.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xih.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xih.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.xfr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>xih.xfr_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>xih.inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xih.inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xih.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xih.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xih.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xih.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xid.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xid.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xid.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xid.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xid.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xid.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xid.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xid.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xid.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xas.pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xas.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xas.sno1</td></tr>
		 * 	<tr><td><br></td><td>xas.sno2</td></tr>
		 * 	<tr><td><br></td><td>xas.sno3</td></tr>
		 * 	<tr><td><br></td><td>xas.sno4</td></tr>
		 * 	<tr><td><br></td><td>xas.ver_no</td></tr>
		 * 	<tr><td><br></td><td>xas.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xas.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xas.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>xas.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>xas.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xas.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xas.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xas.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xas.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>xas.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xas.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xas.inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xas.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xas.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_src_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_to_peg_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>old_xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> up1() {
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
		 * @see mcframe.serverMSBE.MSBEL5210.XfrInst_CndR
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_CndR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>xih.gr_stk_arrv_bp_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>xid.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xas.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>old_xfr_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this).info;
		}


	}
	/**
	 * XfrInst_Ins02オペレーション.<p>
	 *
	 * 移動指図にデータを追加する。<br>
	 */
	abstract public class XfrInst_Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrInst_Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5210.XfrInst_CndR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> down1;
		
		
		// コンストラクタ
		protected XfrInst_Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.class);
			up2 = mcframe.serverMSBE.MSBEL5210.XfrInst_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.class);

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
			invoke((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * XfrInst_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR createXfrInst_HdrR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.create();
		}

		/**
		 * XfrInst_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR createXfrInst_DtlR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.create();
		}

		/**
		 * XfrInst_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> createXfrInst_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.class);
		}

		/**
		 * XfrInst_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_CndR createXfrInst_CndR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xih.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xih.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.xfr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>xih.xfr_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>xih.inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xih.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xih.inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xih.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xih.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xih.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xih.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xid.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xid.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xid.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xid.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xid.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xid.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xid.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xas.pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xas.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xas.sno1</td></tr>
		 * 	<tr><td><br></td><td>xas.sno2</td></tr>
		 * 	<tr><td><br></td><td>xas.sno3</td></tr>
		 * 	<tr><td><br></td><td>xas.sno4</td></tr>
		 * 	<tr><td><br></td><td>xas.ver_no</td></tr>
		 * 	<tr><td><br></td><td>xas.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xas.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xas.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xas.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>xas.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>xas.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xas.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xas.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xas.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xas.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>xas.alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>xas.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xas.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xas.inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xas.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_src_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_to_peg_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>old_xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> up1() {
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
		 * @see mcframe.serverMSBE.MSBEL5210.XfrInst_CndR
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_CndR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>xih.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xih.gr_stk_arrv_bp_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>xid.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xid.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xas.pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xas.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>xas.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>xas.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xas.ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>old_xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this).info;
		}


	}
	/**
	 * XfrInst_Del02オペレーション.<p>
	 *
	 * 移動指図のデータを削除する。<br>
	 */
	abstract public class XfrInst_Del02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrInst_Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5210.XfrInst_CndR up2;
		
		
		// コンストラクタ
		protected XfrInst_Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.class);
			up2 = mcframe.serverMSBE.MSBEL5210.XfrInst_CndR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * XfrInst_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR createXfrInst_HdrR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR.create();
		}

		/**
		 * XfrInst_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR createXfrInst_DtlR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.create();
		}

		/**
		 * XfrInst_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> createXfrInst_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR.class);
		}

		/**
		 * XfrInst_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_CndR createXfrInst_CndR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xih.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xas.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_DtlR> up1() {
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
		 * @see mcframe.serverMSBE.MSBEL5210.XfrInst_CndR
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_CndR up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this).info;
		}


	}
	/**
	 * XfrInst_Upd01オペレーション.<p>
	 *
	 * 移動指図のデータを更新・削除する。<br>
	 */
	abstract public class XfrInst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrInst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrInst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.class);

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
			invoke((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrInst_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR createXfrInst_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.create();
		}

		/**
		 * XfrInst_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> createXfrInst_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.class);
		}

		/**
		 * XfrInst_AggCndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR createXfrInst_AggCndR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.xfr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.xfr_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>hdr.immd_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr.immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr.immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno1</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno2</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno3</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno4</td></tr>
		 * 	<tr><td><br></td><td>dtl.ver_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dtl.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dtl.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>dtl.alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>dtl.alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>dtl.alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>dtl.alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dtl.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl.inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl.cont_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.inst_bndl_src_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.inst_bndl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.inst_bndl_to_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.old_xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.ret_prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.err_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.old_xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.ret_prov_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this).info;
		}


	}
	/**
	 * XfrInst_Ins01オペレーション.<p>
	 *
	 * 移動指図にデータを追加する。<br>
	 */
	abstract public class XfrInst_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrInst_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrInst_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.class);

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
			invoke((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrInst_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR createXfrInst_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.create();
		}

		/**
		 * XfrInst_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> createXfrInst_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.class);
		}

		/**
		 * XfrInst_AggCndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR createXfrInst_AggCndR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.xfr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.xfr_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>hdr.immd_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr.immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr.immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.lot_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno1</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno2</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno3</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno4</td></tr>
		 * 	<tr><td><br></td><td>dtl.ver_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dtl.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dtl.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>dtl.alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>dtl.alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>dtl.alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>dtl.alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.cont_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>agg_gi_loc_flg</td></tr>
		 * 	<tr><td><br></td><td>bndl_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_AggCndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.xfr_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this).info;
		}


	}
	/**
	 * XfrInst_Del01オペレーション.<p>
	 *
	 * 移動指図のデータを削除する。<br>
	 */
	abstract public class XfrInst_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrInst_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5210.XfrInst_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrInst_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.class);
			up1 = mcframe.serverMSBE.MSBEL5210.XfrInst_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.class);

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
			invoke((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrInst_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR createXfrInst_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.create();
		}

		/**
		 * XfrInst_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> createXfrInst_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR.class);
		}

		/**
		 * XfrInst_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_CndR createXfrInst_CndR(){
			return mcframe.serverMSBE.MSBEL5210.XfrInst_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> up0() {
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
		 * @see mcframe.serverMSBE.MSBEL5210.XfrInst_CndR
		 */
		public mcframe.serverMSBE.MSBEL5210.XfrInst_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl.peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5210.XfrInst_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrInstService)MSBEL_XfrInstService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}